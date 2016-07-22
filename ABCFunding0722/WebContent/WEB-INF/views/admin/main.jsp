<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="crowding funding">
    <meta name="author" content="9age">

    <title>${title}</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/scrolling-nav.css" rel="stylesheet">

    <!-- ABC Funding CSS -->
    <link href="css/abcstyle.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<!-- The #page-top ID is part of the scrolling feature - the data-spy and data-target are part of the built-in Bootstrap scrollspy function -->

<body>
	
	
	<!-- Admin Main Section -->
    <section id="adminMain" class="adminMain-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                	<table class="adminMain-table">
                		<tr>
                			<td><a class="btn btn-info btn-lg btn-block" href="memeberManage.do" role="button">회원관리</a></td>
                		</tr>
                		<tr>
                			<td><a class="btn btn-info btn-lg btn-block" href="investManage.do" role="button">투자관리</a></td>
                		</tr>
                		<tr>
                			<td><a class="btn btn-info btn-lg btn-block" href="loanManage.do" role="button">대출관리</a></td>
                		</tr>
                		<tr>
                			<td><a class="btn btn-info btn-lg btn-block" href="judgeManage.do" role="button">심사관리</a></td>
                		</tr>
                	</table>
                </div>	
            </div>
        </div>
    </section>
    
	<!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Scrolling Nav JavaScript -->
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/scrolling-nav.js"></script>
    
</body>
</html>