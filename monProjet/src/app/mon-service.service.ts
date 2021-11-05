import { HttpClient,  } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class MonServiceService {
  public host:String="http://localhost:8090";

  constructor(
    private route:Router,
    private http:HttpClient
    ) { }
afficher(){
  return this.http.get(this.host+'/listeApprenant');

}
afficherFormateur(){
  return this.http.get(this.host+'/listeFormateur');
}
ajouterApprenant(data: any){
  return this.http.post(this.host+"/saveApprenant",data);
}
ajouterFormateur(data:any){
  return this.http.post(this.host+"/saveFormateur",data);
}
supprimerApprenant(id: any){
  return this.http.delete(this.host+"/deleteApprenant/"+id);
}
supprimerformateur(id: any){
  return this.http.delete(this.host+"/deleteFormateur/"+id);
}
}
