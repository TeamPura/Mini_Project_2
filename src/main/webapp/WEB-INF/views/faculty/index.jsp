<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">  
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Faculty</title>
    <link href="resources/faculty/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/faculty/css/font-awesome.min.css" rel="stylesheet">
    <link href="resources/faculty/css/prettyPhoto.css" rel="stylesheet">
    <link href="resources/faculty/css/main.css" rel="stylesheet">
        
    <script src="resources/faculty/js/jquery.js"></script>
    <script src="resources/faculty/js/bootstrap.min.js"></script>
    <script src="resources/faculty/js/jquery.isotope.min.js"></script>
    <script src="resources/faculty/js/jquery.prettyPhoto.js"></script>
    <script src="resources/faculty/js/main.js"></script>    
  
    <link href="resources/faculty/css/jquery-ui-1.10.4.custom.css" rel="stylesheet">
    <script src="resources/faculty/js/jquery-1.10.2.js"></script>
    <script src="resources/faculty/js/jquery-ui-1.10.4.custom.js"></script> 
    
    <script>
    $(function() {
	    $( "#datepicker" ).datepicker();
	    $( "#datepicker1" ).datepicker();
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
                        <li><a href="#editClass">Edit Class</a></li>
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
             <br><br><br>
             	<h3> Filter by: </h3>
             	
             	<form method="post" action="filterView">
             	<label class="control-label" for="textinput">School Year: </label>
             	 <select id="selectbasic" name="selectbasic" class="input-medium">
   		             
   		              <c:forEach var="listValue" items="${schoolYearList}">
                      		<option>${listValue.acadYear}</option>
   		           	  </c:forEach>
   		              
	   			</select>
	   			
	   			 <label class="control-label" for="textinput">Semester: </label>
	   			 <select id="selectbasic" name="selectbasic" class="input-medium">
   		              <option>1st Semester</option>
   		              <option>2nd Semester</option>
   		         </select>
	   			
	   			<button id="button1id" name="button1id" class="btn btn-success">Filter</button>
	   			
	   			</form>
	   			
             <br><br>
                <div class="row">
                    
                    
                  	<table class = "CSSTableGenerator" align = "center"> 
                   
                  	 	<tr>	
                   				<td>Class ID</td> 
								<td>Enrollment Due Date</td> 
                                <td>Max</td> 
                                <td>Min</td> 
                                <td>Start Date</td> 
                                <td>Status</td> 
                                <td>Day</td>
                                <td>Room</td>  
                                <td>Start</td>
                                <td>End</td>  
                   		</tr>
                   
					<c:forEach var="listValue" items="${classList}">

                        <tr>
                        		<td>${listValue.subject.subjName}</td> 
								<td>${listValue.dueEnrollmentDate}</td> 
                                <td> ${listValue.maxStudents}</td> 
                                <td> ${listValue.minStudents}</td> 
                                <td> ${listValue.startClassDate}</td> 
                                <td> ${listValue.status}</td> 
                                <td> ${listValue.day.dayName}</td>
                                <td> ${listValue.room.roomName}</td>  
                                <td> ${listValue.schedule.scheduleStartTime}</td> 
                                <td> ${listValue.schedule.scheduleEndTime}</td> 
                        </tr>

           			 </c:forEach>
                    
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
                
                
                
                <form class="form-horizontal">
<fieldset>

<!-- Form Name 
<legend>Add Class</legend> -->

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="Startdate">Start Date:</label>
  <div class="controls">
    <input id="datepicker" name="startdate" placeholder="dd-mm-yyyy" class="input-small" required type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="minstud">Minimum Students:</label>
  <div class="controls">
    <input id="minstud" name="minstud" placeholder="" class="input-mini" required type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="textinput">Maximun Students:</label>
  <div class="controls">
    <input id="textinput" name="textinput" placeholder="" class="input-mini" type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="textinput">Due Date</label>
   <div class="controls">
    <input id="datepicker1" name="enddate" placeholder="dd-mm-yyyy" class="input-small" required type="text">
    
  </div>
</div>

<!-- Select Basic -->
<div class="control-group">
  <label class="control-label" for="selectbasic">Days</label>
  <div class="controls">
    <select id="selectbasic" name="selectbasic" class="input-medium">
   		<c:forEach var="listValue" items="${dayList}">
                   <option>${listValue.dayName}</option>
	   	</c:forEach>
 </select>
  </div>
</div>

<!-- Select Basic -->
<div class="control-group">
  <label class="control-label" for="asd">Start Time</label>
  <div class="controls">
    <select id="startTime" name="startTime" class="input-medium">
      	<c:forEach var="listValue" items="${scheduleList}">
                   <option>${listValue.scheduleStartTime}</option>
	   	</c:forEach>
    </select>
  </div>
</div>

<!-- Select Basic -->
<div class="control-group">
  <label class="control-label" for="asd">End Time</label>
  <div class="controls">
    <select id="endTime" name="endTime" class="input-medium">
      	<c:forEach var="listValue" items="${scheduleList}">
                   <option>${listValue.scheduleEndTime}</option>
	   	</c:forEach>
    </select>
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
                    <h2>Edit Class</h2>
                    <p class="lead">Pellentesque habitant morbi tristique senectus et netus et <br>malesuada fames ac turpis egestas.</p>
                </div><!--/.center-->   
                <div class="big-gap"></div>
                <div id="pricing-table" class="row">
                    <div class="col-sm-4">
                        <ul class="plan">
                            <li class="plan-name">Basic</li>
                            <li class="plan-price">$29</li>
                            <li>5GB Storage</li>
                            <li>1GB RAM</li>
                            <li>400GB Bandwidth</li>
                            <li>10 Email Address</li>
                            <li>Forum Support</li>
                            <li class="plan-action"><a href="#" class="btn btn-primary btn-lg">Signup</a></li>
                        </ul>
                    </div><!--/.col-sm-4-->
                    <div class="col-sm-4">
                        <ul class="plan featured">
                            <li class="plan-name">Standard</li>
                            <li class="plan-price">$49</li>
                            <li>10GB Storage</li>
                            <li>2GB RAM</li>
                            <li>1TB Bandwidth</li>
                            <li>100 Email Address</li>
                            <li>Forum Support</li>
                            <li class="plan-action"><a href="#" class="btn btn-primary btn-lg">Signup</a></li>
                        </ul>
                    </div><!--/.col-sm-4-->
                    <div class="col-sm-4">
                        <ul class="plan">
                            <li class="plan-name">Advanced</li>
                            <li class="plan-price">$199</li>
                            <li>30GB Storage</li>
                            <li>5GB RAM</li>
                            <li>5TB Bandwidth</li>
                            <li>1000 Email Address</li>
                            <li>Forum Support</li>
                            <li class="plan-action"><a href="#" class="btn btn-primary btn-lg">Signup</a></li>
                        </ul>
                    </div><!--/.col-sm-4-->
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