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
</head>
<body>
	<section class="login-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<h1>투자신청</h1>
					<!-- 가상계좌정보 -->
					<div class="panel panel-default" id="invest-account-info">
						<div class="panel-heading">나의 계좌정보</div>
						<div class="panel-body">
							<table>
								<tr>
									<td>가상계좌번호:</td>
									<td>189-283823-589</td>
								</tr>
								<tr>
									<td>계좌잔액:</td>
									<td>1,300,000원</td>
								</tr>
							</table>
						</div>
					</div>
					<!-- 투자시뮬레이션 -->
					<a href="#" class="btn btn-info btn-lg btn-block"
					id="invest-simulation">
					<span class="glyphicon glyphicon-calendar"></span>
					상환스케쥴</a>
					
					<!-- 투자신청금 -->
					<form id="invest-form" role="form" action="investSuc.do" method="post">
					<div class="panel panel-default" id="invest-account-info">
						<div class="panel-body">
							<p>투자 가능 금액: <strong>300,000원</strong></p>
								<div class="form-group">
									<input class="control-form" id="invest-money"
									name="investMoney" type="number"
									min="10000" max="300000" step="10000" 
									placeholder="투자신청금 입력"/>원
								</div>
						</div>
					</div>
					<!-- 안내문 -->
					<div id="invest-attention">
						<h2>안내문</h2>
						<div id="invest-attention123">
							<p>1. 세금 : 세법에 의거하여 이자소득에 대해 25%(이자소득세) + 2.5%(주민세) = 총 27.5% 의 세금을 납부합니다.</p>
							<p>2. 수수료 : 2%</p>
							<p>3. 투자위험안내 : 당사는 원금 및 수익을 보장하지 않습니다. 다만, 채권 추심에 도의적 책임을 다합니다.</p>
						</div>
					</div>
					<!-- 투자하기 버튼 -->
					<div id="invest-button2">
						<button class="btn btn-default btn-lg" id="submit-invest">
				        	<span class="glyphicon glyphicon-thumbs-up"></span>투자신청
				        </button>
			        </div>
			        </form>
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
    <script>
    	$(document).ready(function(){
    		// 신청버튼을 눌렀을 때 서브밋
    		$("#submit-invest").click(function(){
    			$("invest-form").submit();
    		});
    	});
    </script>
</body>
</html>