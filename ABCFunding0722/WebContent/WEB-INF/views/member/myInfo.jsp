<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

	<!-- myInfo Section -->
	<section id="myInfo" class="myInfo-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<h1>내 정보 상세조회</h1>
					<br> <br>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-6">
					<h4 class="text-center">개인 기본정보</h4>
					<table class="myInfo-table text-center">
						<thead>
							<tr>
								<th class="text-center">이름</th>
								<td><c:out value="${myInfo.name}" /></td>
							</tr>
							<tr>
								<th class="text-center">성별</th>
								<td><c:out value="${myInfo.gender}" /></td>
							</tr>
							<tr>
								<th class="text-center">생년월일</th>
								<td><c:out value="${myInfo.birth}" /></td>
							</tr>
							<tr>
								<th class="text-center">신용등급</th>
								<td><c:out value="${myInfo.creditRating}" /></td>
							</tr>
							<tr>
								<td><input class="btn btn-default" type="button" value="비밀번호 변경"
									onclick="location.href='#'"></td>
								<td><input class="btn btn-default" type="button" value="회원탈퇴"
									onclick="location.href='#'"></td>
							</tr>
						</thead>
					</table>
				</div>
				<div class="col-lg-6">
					<h4 class="text-center">가상 계좌정보</h4>
					<table class="myInfo-table text-center">
						<thead>
							<tr>
								<th class="text-center">가상계좌번호</th>
								<td><c:out value="${myInfo.accountNo}" /></td>
							</tr>
							<tr>
								<th class="text-center">잔액</th>
								<td><c:out value="${myInfo.balance}" />원</td>
							</tr>
							<tr>
								<td colspan="2">
									<input class="btn btn-default" type="button" value="예치금 입금하기"
									onclick="location.href='#'">
								</td>
							</tr>
						</thead>
					</table>
				</div>
				</div>
				<div class="row">
					<div class="col-lg-12">
						<br> <br>
						<table class="myLoanTable">
						<thead>
							<tr id="myLoanTable-head">
								<th colspan="5" onclick="ajaxLoanList('${login.email}')">나의 대출 내역</th>
								<!-- <th>대출신청금액</th>
								<th>상환예정금</th>
								<th>납입일자</th>
								<th>진행상태</th> -->
							</tr>
							
						</thead>
						<tbody id="myLoanTable-list">
							<tr>
								<td>번호</td>
								<td>대출신청금액</td>
								<td>상환예정금</td>
								<td>납입일자</td>
								<td>진행상태</td>
							</tr>
						</tbody>
						</table>
					</div>
				</div>
			</div>
	</section>
	
	
	<script>
	function ajaxLoanList(userEmail){
		$.ajax({
    		url:"<%=application.getContextPath()%>/myLoanInfoList.do",
    		type:"POST",
    		data:"email="+userEmail,
    		dataType:"json",
    		success:function(result){
    			outList(result);
    		},
    		error:function(result){
    			alert('error');
    		}
    	}); 
	}
	function outList(resultLists){
		var count = resultLists.loanList.length;
		var loanLists = resultLists.loanList;
		var str="";
		for(var i=0,i<count,i++){
			str += "<tr><td>"+(i+1)+"</td>";
			str += "<td>"+loanLists[i].loanMoney+"</td>";
			str += "<td>"+loanLists[i].loanMoney+"</td>";
			str += "<td>"+loanLists[i].repay+"</td>";
			str += "<td>"+loanLists[i].progress+"</td></tr>";
		}
		$("#myLoanTable-list").append(str);
	}
	</script>
	<%-- <script>
	var emails = "<c:out value='${login.email}'/>";
	var loanList =  new Array;
	$(document).ready(function(){
	    $("#myLoanTable-head").click(function(emails){
	    	/* $(".myLoanTable > tbody:last").append("<tr><td>"+emails+"</td><td>"+
	    			emails+"</td><td>"+emails+"</td><td>"
    				+emails+"</td><td>"+emails+"</td></tr>"); */
	    	/* $("#myLoanTable-list").toggle("slow"); */
	    	 $.ajax({
	    		url:"<%=application.getContextPath()%>/myLoanInfoList.do",
	    		type:"get",
	    		data:"email="+emails,
	    		dataType:"json",
	    		success:function(data){
	    			for(var i=0,i<data.loanList.length,i++){
	    				$(".myLoanTable > tbody:last").append("<tr><td>"+(i+1)+"</td><td>"+
	    				data.loanList[i].loanMoney+"</td><td>"+data.loanList[i].loanMoney+"</td><td>"
	    				+data.loanList[i].repay+"</td><td>"+data.loanList[i].progress+"</td></tr>");
	    			}
	    		},
	    		error:function(data){
	    			alert('error');
	    		}
	    	}); 
	        
	    });
	});
	</script> --%>
	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Scrolling Nav JavaScript -->
	<script src="js/jquery.easing.min.js"></script>
	<script src="js/scrolling-nav.js"></script>

</body>
</html>