angular.module('HelloWorldApp', []).

controller('Hello', ['\$scope', function(\$scope) {
  \$scope.pageLoadTime = "page load";
}]);