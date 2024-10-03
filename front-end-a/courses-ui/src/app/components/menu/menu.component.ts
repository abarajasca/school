import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api/menuitem';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styles: [
  ]
})
export class MenuComponent {
  public items : MenuItem[] = [
    {
      label: 'Courses',
      icon: 'pi pi-search',
      routerLink: '/courses'
      
    },
    {
      label: 'Students',
      icon: 'pi pi-search',
      routerLink: '/students'
    },
    
  ];
}
