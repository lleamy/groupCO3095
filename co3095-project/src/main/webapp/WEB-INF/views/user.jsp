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

</style>

</head>
<body>


<div class="container">

<h2 style="text-align:center;">TDEE (Total Daily Energy Expenditure) Calculator</h2>	
<p>Do you know the total energy consumed by a person in a day? Let's calculate it!</p>

<form action="/getUserDetail" method="post">
	<h3>Personal Information:</h3>	
	<label for="height">Height:</label><br>
	<input type="number" id="height" name="height" min="1" max="300"required><span style="margin-left:3px;">cm</span><br>
	
	<label for="weight">Weight:</label><br>
	<input type="number" id="weight" name="weight" min="1" max="700" required><span style="margin-left:3px;">kg</span><br>
	
	<label for="age">Age:</label><br>
	<input type="number" id="age" name="age" min="15" max="80" required><span style="margin-left:3px;">(15-80)</span><br>
	
	<div>
	  <h3>Gender:</h3>
	  <label>
	    <input type="radio"  id="gender" name="gender" value="1" required />Male</label>
	  <label>
	    <input type="radio" id="gender" name="gender" value="2"  />Female</label>
	  
	</div>
	
	<div>
	  <h3>Amount of Exercise:</h3>
	  <label>
	    <input type="radio"  id="amount" name="amount" value="1" required />Never work</label>
	  <label>
	    <input type="radio" id="amount" name="amount" value="2"  />1-3 days per week</label>
	  <label>
	    <input type="radio" id="amount" name="amount" value="3"  />3-5 days per week</label>
      <label>
	    <input type="radio" id="amount" name="amount" value="4"  />6-7 days per week</label>
	</div>
	
	<div>
	  <h3>Goal:</h3>
	  <label>
	    <input type="radio"  id="choice" name="choice" value="1" required />Lose Fat</label>
	  <label>
	    <input type="radio" id="choice" name="choice" value="2"  />Gain Muscle</label>
	  <label>
	    <input type="radio" id="choice" name="choice" value="3"  />Stay in Shape </label>
	</div>
	
	<br>
	
	<input type="submit" value="Submit">
</form> 
    
</div> 
 <script type="text/javascript">
 
 
 </script>   

</body>
</html>