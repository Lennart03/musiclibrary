import angular from 'angular';

import ngRoute from 'angular-route';

import {ContractsListController} from './contacts-list/contracts-list.controller';

export default angular.module('contactsApp', [ngRoute])
  .constant('appVersion', '0.5.3')
  .config(function (appVersion) {
    console.log(appVersion);
  })
  .constant('apiUrl', 'https://jsonplaceholder.typicode.com')
  .controller('ContactsListController', ContractsListController)
  .name;
