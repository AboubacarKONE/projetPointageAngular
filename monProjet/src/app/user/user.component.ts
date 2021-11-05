import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { ModalDismissReasons, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { NgForm } from '@angular/forms';
import { MonServiceService } from '../mon-service.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss']
})
export class UserComponent implements OnInit {
public  users: any;
public formateurs: any;

  constructor(private route:Router,
    private service:MonServiceService

    ) {}

  ngOnInit(): void {
    this.service.afficher().subscribe(data=> {
      this.users = data
    },err=>{
      console.log(err)
    })
    this.service.afficherFormateur().subscribe(data=> {
      this.formateurs = data
      console.log(this.formateurs)
    },err=>{
      console.log(err)
    })

  }
  onClick(){
    this.route.navigateByUrl('/addUser')
  }
  addApprenant(){
    this.route.navigateByUrl('/addUser')
  }
  supprimer(id: any){
    this.service.supprimerApprenant(id).subscribe(
      () => {
        alert('apprenant supprimé avec succès!');
        this.ngOnInit()
      },
      (error) => {
        alert('Erreur ! : ' + error);
      }
     );
  }
  supprimerformateur(id: any){
    this.service.supprimerformateur(id).subscribe(
      () => {
        alert('apprenant supprimé avec succès!');
        this.ngOnInit()
      },
      (error) => {
        alert('Erreur ! : ' + error);
      }
     );
  }


}
