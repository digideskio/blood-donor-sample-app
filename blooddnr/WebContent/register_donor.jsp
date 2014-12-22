<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Blood Donor Registration</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
 
<style type="text/css">
    .bs-example{
    	margin: 20px;
    }
</style>
</head>
<body>
<div class="bs-example">
    	<form action="register_success.jsp" method="post" >
        <div class="form-group">
            <label for="inputMobileNumber">Mobile Number</label>
            <input type="text" class="form-control"  name="inputMobileNumber" placeholder="Mobile Number"  required="required">
        </div>
        <div class="form-group">
            <label for="inputName">Full Name</label>
            <input type="text" class="form-control"  name="inputName" placeholder="Full  Name">
        </div>
        <div class="form-group">
        <label>Blood Group</label>
	         <div class="checkbox">
	    		<label><input type="radio" value ="A"  name="bloodGroup" checked="checked"> A</label>
	    		<label><input type="radio" value ="B"  name="bloodGroup"> B</label>
	    		<label><input type="radio" value ="AB"  name="bloodGroup"> AB</label>
	    		<label><input type="radio" value ="O"  name="bloodGroup"> O</label>
	  	    </div>
	  	    <p>   </p>
	  	    <label>Rhesus Factor</label>
	         <div class="checkbox">
	    		<label><input type="radio"  value="POS"  name="rhesusFactor" checked="checked"> POS(+)</label>
	    		<label><input type="radio"  value="NEG"  name="rhesusFactor"> NEG(-)</label>    		    	
	  	    </div>
  	    </div>       
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>                                		