<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">  
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Faculty</title>
        
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
    
    <script>
    $(function() {
	    $( "#datepicker" ).datepicker();
	    $( "#datepicker1" ).datepicker();
	    $( "#datepicker2" ).datepicker();
	    $( "#datepicker3" ).datepicker();
  	});
  	</script>

    
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body data-spy="scroll" data-target="#navbar" data-offset="0">




    <header id="header" role="banner">
        <div class="container">
            <div id="navbar" class="navbar navbar-default">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <!-- <a class="navbar-brand" href="index.html"></a> -->
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#main-slider"><i class="icon-home"></i></a></li>
                        <li><a href="#viewClass">View Class</a></li>
                        <li><a href="#addClass">Add Class</a></li>
                        <li><a href="#editClass">Update Class</a></li>
                        <li><a href="#facultyProfile">Faculty Profile</a></li>
                        <li><a href="#">Logout</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header><!--/#header-->

    <section id="main-slider" class="carousel">
        <div class="carousel-inner">
            <div class="item active">
                <div class="container">
                    <div class="carousel-content">
                        <h1>Hello ${faculty.fname}!</h1>
                        <p class="lead">Have a nice day!</p>
                        <p class="lead">${serverTime}</p>
                    </div>
                </div>
            </div><!--/.item-->
            <div class="item">
                <div class="container">
                    <div class="carousel-content">
                        <h1>Be proud you are a teacher,</h1>
                        <p class="lead">the future depends on you.</p>
                    </div>
                </div>
            </div><!--/.item-->
        </div><!--/.carousel-inner-->
        <a class="prev" href="#main-slider" data-slide="prev"><i class="icon-angle-left"></i></a>
        <a class="next" href="#main-slider" data-slide="next"><i class="icon-angle-right"></i></a>
    </section><!--/#main-slider-->

    <section id="viewClass">    
        <div class="container">       
            <div class="box first">             
              <div class="center gap">
                    <h2>View Classes</h2>
                    </div><!--/.center-->
             	
                  	<table  class="table table-striped table-bordered" id="example"> 
                   <thead> 
                   
                  	 	<tr>	
                   				<td>Subject Name</td> 
								<td>Enrollment Due Date</td>
								<td>Enrolled</td>
						        <td>Max</td> 
                                <td>Min</td> 
                                <td>Start Date</td> 
                                <td>Status</td> 
                                <td>Day</td>
                                <td>Room</td>  
                                <td>Start</td>
                                <td>End</td>  
                   		</tr>
                   		
                   </thead>
                   <tbody>
					<c:forEach begin="0" end="${fn:length(classList) - 1}" var="index">
					
                        <tr>
                        		<td> ${classList[index].subject.subjName}</td> 
								<td> ${classList[index].dueEnrollmentDate}</td>								
								<td> ${allEnrolled[index]}</td>																				
								<td> ${classList[index].maxStudents}</td> 
                                <td> ${classList[index].minStudents}</td> 
                                <td> ${classList[index].startClassDate}</td> 
                                <td> ${classList[index].status}</td> 
                                <td> ${classList[index].day.dayName}</td>
                                <td> ${classList[index].room.roomName}</td>  
                                <td> ${classList[index].schedule.scheduleStartTime}</td> 
                                <td> ${classList[index].schedule.scheduleEndTime}</td> 
                        </tr>

           			 </c:forEach>
                                        
                    </tbody>
                    
                    </table>
                                        
                    
                </div><!--/.row-->
            </div><!--/.box-->
        </div><!--/.container-->
    </section><!--/#services-->

    <section id="addClass">
        <div class="container">
            <div class="box">
            <br>
                <div class="center gap">
                    <h2>Add Class</h2>
                    </div><!--/.center-->
                
                
                
                <form class="form-horizontal" method="post" action="addClassPost">
<fieldset>

<!-- Form Name 
<legend>Add Class</legend> -->


<!-- Subject Drop Down -->   
<div class="control-group">
  <label class="control-label" for="asd">Subject</label>
  <div class="controls">
    <select id="endTime" name="subject.subjId" class="input-medium">
    				<option> </option>
      	<c:forEach var="listValue" items="${subjectList}">
                   <option value="${listValue.subjId}">${listValue.semester.yearLevel.yearLevelName} Year - ${listValue.semester.semesterDesc} - ${listValue.subjName} - ${listValue.subjDesc} - ${listValue.units}.0 units</option>
	   	</c:forEach>
    </select>
  </div>
</div>  




<!-- Days Drop Down-->
<div class="control-group">
  <label class="control-label" for="selectbasic">Days</label>
  <div class="controls">
    <select id="selectbasic" name="day.dayId" class="input-medium">
    				<option> </option>
   		<c:forEach var="listValue" items="${dayList}">
                   <option value="${listValue.dayId}">${listValue.dayName}</option>
	   	</c:forEach>
 </select>
  </div>
</div>

<!-- Start time and End Time Drop Down -->
<div class="control-group">
  <label class="control-label" for="asd">Time Schedule</label>
  <div class="controls">
    <select id="startTime" name="schedule.scheduleId" class="input-medium" required>
    				<option> </option>
      	<c:forEach var="listValue" items="${scheduleList}">
                   <option value="${listValue.scheduleId}">${listValue.scheduleStartTime} - ${listValue.scheduleEndTime}</option>
	   	</c:forEach>
    </select>
  </div>
</div>
 



<!-- Room Drop Down-->    
<div class="control-group">
  <label class="control-label" for="asd">Room and Capacity</label>
  <div class="controls">
    <select id="endTime" name="room.roomId" class="input-medium" required>
    				<option> </option>
      	<c:forEach var="listValue" items="${roomList}">
                   <option value="${listValue.roomId}">${listValue.roomName} Capacity-${listValue.roomCapacity}</option>
	   	</c:forEach>
    </select>
  </div>
</div>

<!-- School Year Drop Down -->
<div class="control-group">
  <label class="control-label" for="asd">School Year</label>
  <div class="controls">
    <select id="startTime" name="schoolYear.schoolYearId" class="input-medium" required>
    				<option> </option>
      	<c:forEach var="listValue" items="${schoolYearList}">
                   <option value="${listValue.schoolYearId}">${listValue.acadYear}</option>
	   	</c:forEach>
    </select>
  </div>
</div>


<!-- Start Date DatePicker Input-->
<div class="control-group">
  <label class="control-label" for="Startdate">Start Date:</label>
  <div class="controls">
    <input id="datepicker" name="startClassDate" placeholder="dd-mm-yyyy" class="input-small" required type="text">
    
  </div>
</div>


<!-- Due Date DatePicker Input-->
<div class="control-group">
  <label class="control-label" for="textinput">Due Date</label>
   <div class="controls">
    <input id="datepicker1" name="dueEnrollmentDate" placeholder="dd-mm-yyyy" class="input-small" required type="text">
    
  </div>
</div>

<!-- Minimum Students Text input-->
<div class="control-group">
  <label class="control-label" for="minstud">Minimum Students:</label>
  <div class="controls">
    <input id="minstud" name="minStudents" placeholder="" class="input-mini" required type="text">
    
  </div>
</div>

<!-- Maximum Students Text input-->
<div class="control-group">
  <label class="control-label" for="textinput">Maximun Students:</label>
  <div class="controls">
    <input id="textinput" name="maxStudents" placeholder="" class="input-mini" type="text">
    
  </div>
</div>



<!-- Button (Double) -->
<div class="control-group">
  <label class="control-label" for="button1id"></label>
  <div class="controls">
    <button id="button1id" name="button1id" class="btn btn-success">Submit</button>
    <button id="button2id" name="button2id" class="btn btn-danger">Cancel</button>
  </div>
</div>

</fieldset>
</form>
                
         
                
            </div><!--/.box-->
        </div><!--/.container-->
    </section><!--/#portfolio-->

    <section id="editClass">
        <div class="container">
        	<div class="box">
        	<br>
                <div class="center">
                    <h2>Update Class</h2>
                    
           <form action = "updatePost" method="post">        
                  	
                  	<table class="table table-striped table-bordered" id="example"> 
                   
                  	 	<tr>	
                   				<td>Subject Name</td> 
								<td>Enrollment Due Date</td>
								<td>Enrolled</td>
						        <td>Max</td> 
                                <td>Min</td> 
                                <td>Start Date</td> 
                                <td>Status</td> 
                                <td>Day</td>
                                <td>Room</td>  
                                <td>Start</td>
                                <td>End</td>  
                   		</tr>
                   
					<c:forEach begin="0" end="${fn:length(classDue) - 1}" var="index">

                        <tr>
                        		<td> ${classDue[index].subject.subjName}</td> 
								<td>  
  									<input id="datepicker2" name="dueEnrollmentDateUpdate" value="${classDue[index].dueEnrollmentDate}" class="input-small" required type="text">	
  								</td>		
  										
								<td> ${Enrolled[index]}</td>																				
								<td> ${classDue[index].maxStudents}</td> 
                                <td> ${classDue[index].minStudents}</td>                           
                                <td>  
  									<input id="datepicker3" name="dueEnrollmentDateUpdate" value="${classDue[index].startClassDate}" class="input-small" required type="text">	
  								</td>	
                                
                                <td><select id="endTime" name="room.roomId" class="input-medium" > 
                                
                                <option value = "1"> ${classDue[index].status} </option>
                                <option value = "2"> Cancel </option>
                                <option value = "3"> Start </option>
                                
                                 </select></td> 
                                 
                                <td> ${classDue[index].day.dayName}</td>
                                <td> ${classDue[index].room.roomName}</td>  
                                <td> ${classDue[index].schedule.scheduleStartTime}</td> 
                                <td> ${classDue[index].schedule.scheduleEndTime}</td> 
                        </tr>

           			 </c:forEach>
     
                    </table>
                     
                     
                     
						<!-- Button (Double) -->
						<div class="control-group">
						  <label class="control-label" for="button1id"></label>
						  <div class="controls">
						    <button id="button1id" name="button1id" class="btn btn-success">Update</button>
						    <button id="button2id" name="button2id" class="btn btn-danger">Cancel</button>
						  </div>
						</div>
                     
                     
                     </form>  
                     
                </div> 
            </div> 
        </div>
    </section><!--/#pricing-->
                
    <section id="facultyProfile">
        <div class="container">
            <div class="box">
                <div class="center">
                    <h2>Faculty Profile</h2>
                    <p class="lead">Pellentesque habitant morbi tristique senectus et netus et<br>malesuada fames ac turpis egestas.</p>
                </div>
                <div class="gap"></div>
                <div id="team-scroller" class="carousel scale">
                    <div class="carousel-inner">
                        <div class="item active">
                            <div class="row">
                                <div class="col-sm-4">
                                    <div class="member">
                                        <p><img class="img-responsive img-thumbnail img-circle" src="images/team1.jpg" alt="" ></p>
                                        <h3>Agnes Smith<small class="designation">CEO &amp; Founder</small></h3>
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="member">
                                        <p><img class="img-responsive img-thumbnail img-circle" src="images/team2.jpg" alt="" ></p>
                                        <h3>Donald Ford<small class="designation">Senior Vice President</small></h3>
                                    </div>
                                </div>        
                                <div class="col-sm-4">
                                    <div class="member">
                                        <p><img class="img-responsive img-thumbnail img-circle" src="images/team3.jpg" alt="" ></p>
                                        <h3>Karen Richardson<small class="designation">Assitant Vice President</small></h3>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="row">
                                <div class="col-sm-4">
                                    <div class="member">
                                        <p><img class="img-responsive img-thumbnail img-circle" src="images/team3.jpg" alt="" ></p>
                                        <h3>David Robbins<small class="designation">Co-Founder</small></h3>
                                    </div>
                                </div>   
                                <div class="col-sm-4">
                                    <div class="member">
                                        <p><img class="img-responsive img-thumbnail img-circle" src="images/team1.jpg" alt="" ></p>
                                        <h3>Philip Mejia<small class="designation">Marketing Manager</small></h3>
                                    </div>
                                </div>     
                                <div class="col-sm-4">
                                    <div class="member">
                                        <p><img class="img-responsive img-thumbnail img-circle" src="images/team2.jpg" alt="" ></p>
                                        <h3>Charles Erickson<small class="designation">Support Manager</small></h3>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <a class="left-arrow" href="#team-scroller" data-slide="prev">
                        <i class="icon-angle-left icon-4x"></i>
                    </a>
                    <a class="right-arrow" href="#team-scroller" data-slide="next">
                        <i class="icon-angle-right icon-4x"></i>
                    </a>
                </div><!--/.carousel-->
            </div><!--/.box-->
        </div><!--/.container-->
    </section><!--/#about-us-->

    

    <footer id="footer">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    &copy; 2013 <a target="_blank" href="http://shapebootstrap.net/" title="Free Twitter Bootstrap WordPress Themes and HTML templates">ShapeBootstrap</a>. All Rights Reserved.
                </div>
                <div class="col-sm-6">
                    <img class="pull-right" src="images/shapebootstrap.png" alt="ShapeBootstrap" title="ShapeBootstrap">
                </div>
            </div>
        </div>
    </footer><!--/#footer-->

    
    
    
</body>
</html>