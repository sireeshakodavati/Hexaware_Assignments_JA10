import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GetallbycountrynameComponent } from './component/getallbycountryname/getallbycountryname.component';
import { AddplayerComponent } from './component/addplayer/addplayer.component';

const routes: Routes = [
  {path:'getallplayer',component:GetallbycountrynameComponent},
  {path:'addplayer',component:AddplayerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
}
