var myApp = angular.module('store', []);

myApp.controller('LoginController', function ($scope, $http, $window) {
	  
	  $scope.errorMessage = "";
  	  $scope.showError = false;  	        
  	
	  $scope.processLogin = function (username,password) {
		  //$http.post('/loginService', { username: username, password: password })
		  $http({
			    url: '/loginService', 
			    method: "GET",
			    params: {username: username, password: password}
			 })
	    .success(function (response) {
	  	    if (response.resultCode == 0) {
	  	    	 $window.location.href = '/showProducts.html';
	  	    } else {
	  	        $scope.errorMessage = response.resultText;
	  	    	$scope.showError = true;  	        
	  	    }
	    })
	  }
  });

myApp.controller('ShowProductsController', function($scope, $http) {
  $http.get('/products/').success(function(data) {
    $scope.products = data;
  })
});