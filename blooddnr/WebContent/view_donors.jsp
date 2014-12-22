<%@page import="ctap.sample.BloodDonorRepo"%>
<%@page import="java.util.List"%>
<%@page import="ctap.sample.BloodDonorInMemoryRepo"%>
<%@page import="ctap.sample.BloodDonor"%>
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
<form action="">
	<div class="form-group">
	 		<label>Blood Group</label>	         
			<label class="radio-inline"><input type="radio" value ="A"  name="bloodGroup"> A</label>
			<label class="radio-inline"><input type="radio" value ="B"  name="bloodGroup"> B</label>
			<label class="radio-inline"><input type="radio" value ="AB"  name="bloodGroup"> AB</label>
			<label class="radio-inline"><input type="radio" value ="O"  name="bloodGroup"> O</label>
			<hr>				  	   
			 	<label>Rhesus Factor</label>	         
			<label class="radio-inline"><input type="radio"  value="POS"  name="rhesusFactor"> POS(+)</label>
			<label class="radio-inline"><input type="radio"  value="NEG"  name="rhesusFactor"> NEG(-)</label>
			<hr>			
			<button type="submit" class="btn btn-primary">Submit</button>
			<hr>    		    		  	    
  	    </div>
  	    
  	    <%
  	      	    	List<BloodDonor> bloodDonors;
  	    			BloodDonorRepo repo = new BloodDonorInMemoryRepo();
  	      	      	    	if(request.getParameter("bloodGroup") ==  null  ||  request.getParameter("rhesusFactor") == null) {
  	      	      	    		bloodDonors = repo.allDonors();
  	      	    %>
  	    	<label>Select a blood group and a rhesus factor, searched for all available donors</label>	         				
			<%
	         								} else {
	         									bloodDonors = repo.bloodDonors(request.getParameter("bloodGroup"),  request.getParameter("rhesusFactor"));
	         									String displayMsg = "Searching for blood group  - " + request.getParameter("bloodGroup")  + ",  rhesus factor - " + request.getParameter("rhesusFactor");
	         							%>			
				<label>"<%= displayMsg %>"</label>				
				<%
			}
  	    %>
      <%
      	if(bloodDonors.isEmpty()) {
      		%> 
      		<label>No results to show</label>
      		<% 
      	} else {
      		%>
      		<table style="width:100%">
		<tr>
			<th>Full Name</th>
			<th>Mobile Number</th> 
			<th>Blood Group</th>
			<th>Rhesus Factor</th>
		</tr>
      		<%       		      	
      		for(int i = 0; i < bloodDonors.size(); i+=1) { %>
            <tr>
            	<td><%=bloodDonors.get(i).getFullName()%></td>      
                <td><%=bloodDonors.get(i).getMobileNumber()%></td>
                <td><%=bloodDonors.get(i).getBloodGroup()%></td>
                <td><%=bloodDonors.get(i).getRhesusFactor()%></td>
            </tr>
        <% }
      		%>  
      		</table>
      		<%
      	}%>
	
</form>

<a href="register_donor.jsp">Add Donor</a>

</body>

</html>