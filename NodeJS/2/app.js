var fs=require('fs');

fs.writeFileSync("test.txt","I love life");
console.log(fs.readFileSync("test.txt"));