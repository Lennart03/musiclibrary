import angular from 'angular';

import ngRoute from 'angular-route';

import {ArtistListController} from './artist-list/artist-list.controller';

export default angular.module('musiclibrary', [ngRoute])
  .constant('appVersion', '0.0.1')
  .config(function (appVersion) {
    console.log(appVersion);
  })
  .constant('apiUrl', 'http://localhost:8080')
  .controller('ArtistListController', ArtistListController)
  .name;
