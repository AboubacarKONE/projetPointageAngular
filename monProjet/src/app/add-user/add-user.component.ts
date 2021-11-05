import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { MonServiceService } from '../mon-service.service';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.scss']
})
export class AddUserComponent implements OnInit {
  public Type: any;
  ajoutApprenant='';
  data= {
    nom: '',
    prenom: '',
    email: '',
    password: '',
    telephone: '',
    genre: '',
    statut: ''
  }
  constructor(private route:Router, private Myservice:MonServiceService) {}

  ngOnInit(): void {

  }

  // gestion(){
  //   this.route.navigateByUrl('/user')
  // }
  onSubmit(valeur:NgForm){
    this.data.nom=valeur.value['nom'];
    this.data.prenom=valeur.value['prenom'];
    this.data.email=valeur.value['email'];
    this.data.password=valeur.value['password'];
    this.data.telephone=valeur.value['Telephone'];
    this.data.genre=valeur.value['genre'];
    this.data.statut=valeur.value['statut'];
    this.Type=valeur.value['type']
    if(this.Type=="Apprenant"){
    this.Myservice.ajouterApprenant(this.data).subscribe(
      () => {
        alert('Apprenant enregistré avec succès!');
        this.route.navigateByUrl('/user')
      },
      (error) => {
        alert('Erreur ! : ' + error);
      }
    );
   }
    if(this.Type=="formateur"){
      this.Myservice.ajouterFormateur(this.data).subscribe(
        () => {
          alert('formateur enregistré avec succès!');
          this.route.navigateByUrl('/user')
        },
        (error) => {
          alert('Erreur ! : ' + error);
        }
       );

    }


 }

 }
