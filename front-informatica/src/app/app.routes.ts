import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';


export const routes: Routes = [
    { path: '',title:"Accueil", component: HomeComponent },
    {
        path: 'admin',
        loadChildren: () => import('./pages/admin/admin.routes').then(routes => routes.routes)
      }

];