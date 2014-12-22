<%@page import="ctap.sample.BloodDonorInMemoryRepo"%>
<%@page import="ctap.sample.BloodDonor"%>
<%@page import="ctap.sample.BloodDonorRepo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Details Of Donor</title>
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
	<h3>		
			Blood Donor Registration Successful ...		
	</h3>
	<br>
	
Full Name:<%=request.getParameter("inputName")%><br> 
Mobile Number:<%=request.getParameter("inputMobileNumber")%><br>
Blood Group:<%=request.getParameter("bloodGroup")%><br>
Rhesus Factor:<%=request.getParameter("rhesusFactor")%><br>

<%
	BloodDonor donor  = new BloodDonor(request.getParameter("inputMobileNumber"),  request.getParameter("inputName"), request.getParameter("bloodGroup"),  request.getParameter("rhesusFactor"));
     BloodDonorRepo repo =  new BloodDonorInMemoryRepo();
	repo.addBloodDonor(donor);
%>

 <br>

<a href="register_donor.jsp">Add Donor</a>
<a href="view_donors.jsp">View Donors</a>

</body>

</html>