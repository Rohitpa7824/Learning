var app=angular.module('app',[]);

app.controller('MainController', function($scope){

	$scope.mydata={val:'NAME'}
	$scope.$watch('mydata.val',function(newval){
			$scope.mydata.toolong=newval.length > 15
	})
	
})