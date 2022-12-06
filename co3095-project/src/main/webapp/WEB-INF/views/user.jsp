<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TDEE Calculator</title>

<style>

.container{
margin-left:5%;
margin-right:5%;

}

input[type='number']{
    width: 80px;
} 

.alert {
  padding: 20px;
  background-color: #f44336;
  color: white;
}

.closebtn {
  margin-left: 15px;
  color: white;
  font-weight: bold;
  float: right;
  font-size: 22px;
  line-height: 20px;
  cursor: pointer;
  transition: 0.3s;
}

.closebtn:hover {
  color: black;
}


</style>

</head>
<body>


<div class="container">

<h2 style="text-align:center;">TDEE (Total Daily Energy Expenditure) Calculator</h2>	
<p>Do you know the total energy consumed by a person in a day? Let's calculate it!</p>

<form action="/getUserDetail" method="post">
	<h3>Personal Information:</h3>	
	
	<p id="error"></p>
	
	
	<label for="height">Height:</label><br>
	<input type="number" id="height" name="height" min="1" max="300" required oninvalid="setCustomValidity('Please enter height from 1-300.');" oninput="setCustomValidity('');"><span style="margin-left:3px;">cm</span><br>
	
	<label for="weight">Weight:</label><br>
	<input type="number" id="weight" name="weight" min="1" max="700" required oninvalid="setCustomValidity('Please enter weight from 0-700.');" oninput="setCustomValidity('');"> <span style="margin-left:3px;">kg</span><br>
	
	<label for="age">Age:</label><br>
	<input type="number" id="age" name="age" min="15" max="80" required oninvalid="setCustomValidity('Please enter age from 15-80.');" oninput="setCustomValidity('');"><span style="margin-left:3px;">(15-80)</span><br>
	
	<div>
	  <h3>Gender:</h3>
	  <label>
	    <input type="radio"  id="1" name="gender" value="1" required>Male</label>
	  <label>
	    <input type="radio" id="2" name="gender" value="2"  >Female</label>
	  
	</div>
	
	<div>
	  <h3>Amount of Exercise:</h3>
	  <label>
	    <input type="radio"  id="3" name="amount" value="1" required >Never work</label>
	  <label>
	    <input type="radio" id="4" name="amount" value="2"  />1-3 days per week</label>
	  <label>
	    <input type="radio" id="5" name="amount" value="3"  />3-5 days per week</label>
      <label>
	    <input type="radio" id="6" name="amount" value="4"  />6-7 days per week</label>
	</div>
	
	<div>
	  <h3>Goal:</h3>
	  <label>
	    <input type="radio"  id="7" name="choice" value="1" required >Lose Fat</label>
	  <label>
	    <input type="radio" id="8" name="choice" value="2"  />Gain Muscle</label>
	  <label>
	    <input type="radio" id="9" name="choice" value="3"  />Stay in Shape </label>
	</div>
	
	<br>
	
	<button id = "btn" onClick="ValidateForm(this.form)">Submit</button>
</form> 
    
</div> 
 <script>
 function ValidateForm(form) {
	  const height = document.getElementById("height");
	  const weight = document.getElementById("weight");
	  const age = document.getElementById("age");
	  var gender1 = document.getElementById('1');
	  var gender2 = document.getElementById('2');
	  
	  var a1 = document.getElementById('3');
	  var a2 = document.getElementById('4');
	  var a3 = document.getElementById('5');
	  var a4 = document.getElementById('6');

	  var c1 = document.getElementById('7');
	  var c2 = document.getElementById('8');
	  var c3 = document.getElementById('9');
	  

	  if (!height.checkValidity()) {
		    document.getElementById("error").innerHTML = height.validationMessage;
		    document.getElementById("error").style.color = "red";

	  } else if (!weight.checkValidity()) {
		    document.getElementById("error").innerHTML = weight.validationMessage;
		    document.getElementById("error").style.color = "red";
	  } else if (!age.checkValidity()) {
		    document.getElementById("error").innerHTML = age.validationMessage;
		    document.getElementById("error").style.color = "red";
	  } else if ( (gender1.checked == false ) && (gender2.checked == false ) ) {
		    document.getElementById("error").innerHTML = "Select one of the genders.";
		    document.getElementById("error").style.color = "red";
		    return false;
	  } else if ( (a1.checked == false ) && (a2.checked == false ) && (a3.checked == false )&& (a4.checked == false )) {
		    document.getElementById("error").innerHTML = "Select one of the following amount.";
		    document.getElementById("error").style.color = "red";
		    return false;
		  }
	  else if ( (c1.checked == false ) && (c2.checked == false ) && (c3.checked == false )) {
		    document.getElementById("error").innerHTML = "Select one of the following choice.";
		    document.getElementById("error").style.color = "red";
		    return false;
		  }
	 
	}  
</script>
   

</body>
</html>
