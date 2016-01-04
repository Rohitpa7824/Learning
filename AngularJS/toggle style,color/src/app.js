var app=angular.module('app',[]);

app.controller('MainController', function($scope){
	$scope.color='red'
	$scope.style=''
	$scope.changeColor=function(){
		if($scope.color=='red')
			$scope.color='yellow'
		else
			$scope.color='red'
	}

	$scope.changeStyle=function(){
		if($scope.style=='')
			$scope.style='italics'
		else
			$scope.style=''
	}
})