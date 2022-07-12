import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './campana/add/add.component';
import { EditComponent } from './campana/edit/edit.component';
import { ListarComponent } from './campana/listar/listar.component';
/* CREACION DE LAS RUTAS */
const routes: Routes = [
{path: 'listar',component:ListarComponent},
{path: 'add',component:AddComponent},
{path: 'edit',component:EditComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
