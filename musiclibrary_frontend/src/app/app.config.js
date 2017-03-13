export function appConfig($routeProvider, $locationProvider) {

  $locationProvider.html5Mode(true);

  $routeProvider.when('/home', {
    template: '<home></home>'
  });

  $routeProvider.when('/artistDetail', {
    template: '<artist-detail></artist-detail>'
  });

  $routeProvider.otherwise({
    redirectTo: '/home'
  });

}
