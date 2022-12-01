<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>


<style>
* {
  box-sizing: border-box;
}

.container{
margin-left:5%;
margin-right:5%;

}

.column {
  float: left;
  width: 33.33%;
  padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
  content: "";
  clear: both;
  display: table;
}
</style>


</head>



<body>




<div class="container">

<h2> You will need ${bmr} calories per day.</h2>
<h3>TDEE (Total Daily Energy Expenditure) per meal: ${bmr_per_meal} kcal </h3>


 
<c:forEach items="${recipe}" var="recipe">
<div class="column">

<div class="row">
	<img src="${recipe.pic}" width="300" height="250">
	<br>
	<a href="${recipe.url}">Click To View</a>
	<h2>${recipe.recipe_name}</h2>
	<p>Total Calories: ${recipe.calorie} kcal </p>

    <h3>Suggest Quantity:</h3>
    <c:forEach items="${recipe.ingredients}" var="food">
    	<p>${food.food_name} ${food.suggest_grams}g</p>
    </c:forEach>
    
    
</div>
</div>
</c:forEach>

</div>




</body>
</html>





