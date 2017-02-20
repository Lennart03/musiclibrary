import 'materialize-css/dist/css/materialize.css';

import './index.css';

import 'jquery/dist/jquery';

import 'materialize-css/dist/js/materialize';

import angular from 'angular';

import 'angular-i18n/angular-locale_nl-be';

import appModule from './app/app.module';

angular.bootstrap(document, [appModule]);
