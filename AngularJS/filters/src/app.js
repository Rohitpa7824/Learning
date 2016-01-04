var app=angular.module('app',[]);

app.controller('MainController', function($scope){
		$scope.mydata={arr: ["rohit","yukti","cat","sun","pink"]}

		$scope.newdata={arr: [{name:"rohit1",age:19},{name:"yukti1",age:16},{name:"robot",age:999}]}
})

app.filter('charlim',function(){
	return function(input,length){
		if(!length)
			length=10
		if(!input)
			return ''
		if(input.length<=length)
			return input
		else
			return input.substring(0,length)+'...'
	}
})