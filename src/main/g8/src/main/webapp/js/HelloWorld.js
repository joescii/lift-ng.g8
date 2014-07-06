angular.module('HelloWorldApp', ['HelloServices']).

controller('Hello', ['\$scope', 'helloService', function(\$scope, hello) {
  \$scope.pageLoadTime = hello.pageLoadTime;

  \$scope.checkTime = function() {
    hello.currentServerTime().then(function(time){
      \$scope.lastTime = time;
    });
  };
}]);