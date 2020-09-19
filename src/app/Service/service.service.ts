import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from '../Modelo/persona';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/backend/personas';

  getPersonas(){
    return this.http.get<Persona[]>(this.Url)
  }
  createPersona(persona:Persona){
    return this.http.post<Persona>(this.Url,persona);
  }
  getPersonaId(id_persona:number){
    return this.http.get<Persona>(this.Url+"/"+id_persona);
  }
  updatePersona(persona:Persona){
    return this.http.put<Persona>(this.Url+"/"+persona.id_persona,persona);
  }
  deletePersona(persona:Persona){
    return this.http.delete<Persona>(this.Url+"/"+persona.id_persona);
  }
}
