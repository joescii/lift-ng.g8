angular.module('HelloWorldApp', ['HelloServices']).

controller('Hello', ['\$scope', 'helloService', function(\$scope, hello) {
  \$scope.pageLoadTime = hello.pageLoadTime;
}]);