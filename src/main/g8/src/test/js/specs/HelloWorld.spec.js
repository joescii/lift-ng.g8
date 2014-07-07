describe('HelloWorld App', function(){
  var helloMock = {};
  var rootScope = {};
  var scope = {};

  beforeEach(module('HelloWorldApp'));

  beforeEach(function(){
    angular.mock.module( function($provide) {
      $provide.value('helloService', helloMock);
    });
  });

  beforeEach(inject(['$rootScope', '$controller', function($rootScope, $controller){
    rootScope = $rootScope;
    scope = $rootScope.$new();

    helloMock.pageLoadTime = "load time";
    helloMock.callCount = 0;
    helloMock.currentServerTime = function() {
      this.callCount += 1;
      return "server time";
    };

    $controller('Hello', { $scope: scope, helloService: helloMock })
  }]));

  describe('Hello Controller', function(){
    it('should say hello', function() {
      expect(scope.pageLoadTime).toBe("load time");
    });
  });
});