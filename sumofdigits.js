
function myFunction(){ //make a function
let num=prompt("Enter numbers to add up:") //ask user for input
let total =num.length  //find lenght of user input
let sum = 0  //the sum
for (i = 0; i < total; i++){   // run a loop 
    let n = parseInt(num[i])   //turn number into int
    sum = n + sum    //add
}
console.log(sum)  //print
}
myFunction()   //call function
