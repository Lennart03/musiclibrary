import angular from 'angular';

import ngRoute from 'angular-route';

import {appConfig} from 'app.config';

import {MusicLibService} from './shared/MusicLibService.service'

import {ArtistListController} from './artist-list/artist-list.controller';
import {ArtistDetailController} from './artist-detail/artist-detail.controller';

export default angular.module('musiclibrary', [ngRoute])
  .constant('appVersion', '0.0.1')
  .config(appConfig)
  .run(function (appVersion) {
    console.log(appVersion);
  })
  .constant('apiUrl', 'http://localhost:8080')
  .service('MusicLibService', MusicLibService)
  .controller('ArtistListController', ArtistListController)
  .controller('ArtistDetailController', ArtistDetailController)
  .name;
