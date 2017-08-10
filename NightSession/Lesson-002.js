function testFunc() { 
  console.log("Hello.. "); 
  return 1; 
}
testFunc()    // Calling

function testFunc(user) { 
  console.log("Hello.. "+user); 
  return 1; 
}
testFunc('Steve')    // Calling

var test = function testMethod() { 
  console.log('Hello'); 
}
test()    // Calling


var test = function() { 
  console.log('Hello'); 
}
test()    // Calling


function sumOfArray(arr) {
    if (arr.length <= 0) {
        console.log("Sum will be 0");
    } else {
        sum = 0;
        for (var i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        console.log("Sum is " + sum);
    }
}

sumOfArray([])  // Sum is 0

sumOfArray([1,2,3,4])  // Sum is 10

/*
<!doctype html>
<html>
	<head>
		<title>Index Page</title>
	</head>
	<body>
	</body>
</html>
 */


function test() {
    document.writeln('<ul>');
    for (var i = 0; i < 5; i++) {
        document.writeln('<li>Value ' + i + '</li>');
    }
    document.writeln('</ul>');
}

test()        // View Your Page it will Show you Output as list

function renderFruits(index){
	var arr=new Array('orange', 'apple', 'grapes', 'mango', 'banana', 'greenapple', 'pomegrante', 'watermelon', 'pineapple');
	document.writeln("<ol>");
	for(var i=0;i < arr.length; i++)
		document.writeln("<li>"+arr[i]+"</li>");
	document.writeln("</ol>");
	return arr[index%10];
}

var selected = renderFruits(3)

document.writeln("<h1>You have selected </h1>" + selected);

var emp = {}

emp // object {}

emp.name = 'Steve'

emp //Object {name: "Steve"}name: "Steve"__proto__: Object

emp.company = 'Apple Inc.'

emp //Object {name: "Steve", company: "Apple Inc."}

emp.name = 'Steve Jobs'

emp //Object {name: "Steve Jobs", company: "Apple Inc."}

emp.name //"Steve Jobs"

emp.showProfile = function() {
   console.log(this.name + "\t" + this.company);
}

emp //Object {name: "Steve Jobs", company: "Apple Inc."}company: "Apple Inc."name: "Steve Jobs"

emp.showProfile() //Steve Jobs	Apple Inc.

var emp1 = {
   name: "Guido Van Rossom",
   company: "Python Org."
}

emp1 //Object {name: "Guido Van Rossom", company: "Python Org."}

emp1.showProfile = function() {
   console.log(this.name + "\t" + this.company);
}

emp //Object {name: "Steve Jobs", company: "Apple Inc."}

emp1 //Object {name: "Guido Van Rossom", company: "Python Org."}

emp.showProfile() //Steve Jobs	Apple Inc.

emp1.showProfile() //Guido Van Rossom	Python Org.

emp["name"] = "Steve";

emp["showProfile"]()

delete emp.location

var emp = new Object()

var emp = {
	name: "Steve Jobs",
	company: "Apple Inc.",
	showProfile: function() {
		console.log(this.name + "\t\t" + this.company);
	}
}

function Employee(name,company) {
	this.name = name;
	this.company = company;
	showProfile = profile;
	function profile() {
		console.log(this.name + "\t\t" + this.company);
	}
}

var emp = new Employee("Steve Jobs", "Apple Inc.");

function Employee(name,company) {
	this.name = name;
	this.company = company;
	this.showProfile = profile;
	function profile() {
		console.log(this.name + "\t\t" + this.company);
	}
}

var emp = new Employee("Steve Jobs", "Apple Inc.");

var emp1 = new Employee("Guido Van Rossom", "Python org.");

function Employee(name,company) {
	this.name = name;
	this.company = company;
	this.showProfile = profile;
}

function profile() {
	console.log(name + "\t\t" + company);
}

var emp = new Employee("Steve Jobs", "Apple Inc.");

emp.showProfile()	//Uncaught ReferenceError: company is not defined(…)profile, (anonymous function)

function profile() {
	console.log(this.name + "\t\t" + this.company);
}

var emp = new Employee("Steve Jobs", "Apple Inc.");

emp.showProfile()	//Steve Jobs		Apple Inc.

for(props in emp) { 
	console.log(emp[props]); 
}
/*
	Steve Jobs
	Apple Inc.
	profile() {
		console.log(this.name + "\t\t" + this.company);
	}
*/

for(props in emp) { 
	console.log(props);
}
/*
	name
	company
	showProfile
*/

for(props in emp) { 
	document.writeln(props); 
}

for(props in emp) { 
	document.writeln("<h1>"+emp[props]+"</h1>");
}
