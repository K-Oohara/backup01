<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css; charset=UTF-8"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript; charset=UTF-8"/>
	<meta http-equiv="imagetoolber" content="no"/>
	<meta name="discription" content=""/>
	<meta name="keywords" content=""/>
	<title>ホーム画面</title>
	<style type="text/css">
		body{
			margin:0;
			padding:0;
			line-height:1.6;
			letter-spacing:1px;
			font-family:Verdana,Helvetica,sans-serif;
			font-size:12px;
			color:#0;
			background:#333;
		}
		table{
			text-aline:center;
			margin:0 auto;
		}

		/* ========TEMPLATE LAYOUT======== */
		#header{
			position:relative;
			top:0;
			left:0;
			width:100%;
			height:110px;
			background-color:white;
		}

		.header-logo{
			float:left;
			width:300px;
			padding-left:10px;
			color:black;
			font-size:25px;
			line-height:60px;
		}

		.headerMenu{
			position:absolute;
			top:60px;
			left:0px;
			float:left;
			width:100%;
			height:50px;
			color:white;
			line-height:50px;
			background-color:black;
		}

		.headerMenu ul{
			float:left;
			text-align:center;
			margin:0;
			padding:0;
		}

		.headerMenu li{
			float:left;
			list-style:none;
			width:150px;
			color:white;
			font-size:18px;
			border-right: 1px solid #FFF;
			background-color:black;
		}

		.headerMenu a{
			text-decoration:none;
			line-height:50px;
			display:block;
		}

		.headerMenu li a:link{
			color:white;
		}

		.headerMenu li a:visited{
			color:white;
		}

		.headerMenu li a:hover{
			background-color:red;
		}

		#main{
			width:100%;
			height:500px;
			text-align:center;
			background-color:white;
			clear:both;
		}

		#main .contents{
			background-color:#ffffff;
		}

		#errorMessage{
			color:red;
		}


		#footer{
			width:100%;
			height:80px;
			background-color:black;
			clear:both;
		}
	</style>
</head>
<body>
	<div id="header">
		<div class="header-logo">
			ECサイト
		</div>
		<div class="headerMenu">
		<ul style="cursor: pointer">
			<li id="home">
				<a href='<s:url action="GoHomeAction"/>'>HOME</a>
			</li>
			<li id="registration">
				<a href='<s:url action="UserCreateAction"/>'>新規登録</a>
			</li>
			<li id="login">
				<a href='<s:url action="HomeAction"/>'>ログイン</a>
			</li>
		</ul>
		</div>
	</div>
	<div id="main">
		<div class="contents">
			<h1>ようこそ！</h1>
		</div>
		<div id="contents-text">
			<s:form action="HomeAction">
				<s:submit value="商品購入"/>
			</s:form>
		</div>
	</div>
	<div id="footer">

	</div>
</body>
</html>