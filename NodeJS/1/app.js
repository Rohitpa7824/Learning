function User(){
	this.name="";
	this.life=100;
	this.giveLife = function giveLife(target){
		target.life+=1;
		console.log(this.name + " gave 1 life to " + target.name);

	}
}

var bucky=new User();
var wendy=new User();
bucky.name="bucky";
wendy.name="wendy";

bucky.giveLife(wendy);
console.log("bucky " + bucky.life);
console.log("wendy " + wendy.life);

User.prototype.uppercut = function uppercut(target){
	target.life-=3;
	console.log(this.name + " just stabbed " + target.name);
};

wendy.uppercut(bucky);
console.log("bucky " + bucky.life);
console.log("wendy " + wendy.life);