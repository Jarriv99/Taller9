import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Persona } from 'src/app/Modelo/persona';
import {ServiceService}from '../../Service/service.service'

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {


  personas:Persona[]
  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit()  {

    this.service.getPersonas()
    .subscribe(data=>{
      this.personas=data;
    })

  }
  Editar(persona:Persona):void{
    localStorage.setItem("id_persona",persona.id_persona.toString());
    this.router.navigate(["edit"]);
  }
  Delete(persona:Persona){
    this.service.deletePersona(persona)
    .subscribe(data=>{
      this.personas=this.personas.filter(p=>p!==persona);
      alert("Usuario Eliminado")
    })

  }

}
