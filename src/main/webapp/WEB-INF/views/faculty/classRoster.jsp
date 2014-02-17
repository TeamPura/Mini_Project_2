<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Class Roster</title>



<link rel="shortcut icon" type="image/ico" href="http://www.datatables.net/favicon.ico" />
        
    <link href="resources/faculty/css/bootstrap.min1.css" rel="stylesheet">
    
    <link href="resources/faculty/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/faculty/css/font-awesome.min.css" rel="stylesheet">
    <link href="resources/faculty/css/prettyPhoto.css" rel="stylesheet">
    <link href="resources/faculty/css/main.css" rel="stylesheet">

	<!-- <link href="resources/faculty/css/jquery.dataTables.css" rel="stylesheet">  -->
	
    <script src="resources/faculty/js/jquery-1.10.2.js"></script>  
    <script src="resources/faculty/js/bootstrap.min.js"></script>
    <script src="resources/faculty/js/jquery.isotope.min.js"></script>
    <script src="resources/faculty/js/jquery.prettyPhoto.js"></script>
    <script src="resources/faculty/js/main.js"></script>    
    
    <script type="text/javascript" charset="utf-8"  src="resources/faculty/js/jquery.dataTables.js"></script>
	<script type="text/javascript" charset="utf-8"  src="resources/faculty/js/DT_bootstrap.js"></script>   

    <link href="resources/faculty/css/jquery-ui-1.10.4.custom.css" rel="stylesheet">  
    <script src="resources/faculty/js/jquery-ui-1.10.4.custom.js"></script> 




</head>
<body>


  				<c:choose>
    				<c:when test="${empty studentsEnrolled}">
       					<h3 align="center"> No students enrolled in this class. </h3>
    				</c:when>
    
    				<c:otherwise> 

		 		<table  class="table table-striped table-bordered" id="example"> 
                   
                    
                    
					
					<thead>
						<tr>	
                   				<td>Student ID</td> 
								<td>Student Complete Name</td>
								<td>Email Address</td>
						        <td>Date of Enrollment</td> 
                               
                   		</tr>
					<c:forEach begin="0" end="${fn:length(studentsEnrolled) - 1}" var="index">
	                    <tr>
                      
                        		
                        		<td> ${studentsEnrolled[index].student.userId}</td> 
								<td> ${studentsEnrolled[index].student.fname} ${studentsEnrolled[index].student.mname} ${studentsEnrolled[index].student.lname}</td>
								<td> ${studentsEnrolled[index].student.emailAddress}</td>																											
								<td> ${studentsEnrolled[index].dateOfEnrollment}</td> 
                    
                                                   
                        </tr>
                 
                 	</c:forEach>
                 	</thead>
                 	
           			 
         		
         		
         		</table>
                    

                
             		</c:otherwise>    
                  
                 </c:choose>
                  

</body>
</html>