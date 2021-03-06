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
	<title>商品購入確認画面</title>
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
			margin:0 auto;
			background-color:aqua;
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
			clear:both;
			width:100%;
			height:500px;
			text-align:center;
			background-color:white;
		}

		#main .contents{
			background-color:#ffffff;
		}

		#main table{
			text-aline:left;
			margin:0 auto;
			line-height:1.6;
			font-family:Verdana,Helvetica,sans-serif;
			font-size:16px;
			background-color:aqua;
		}

		table .item{
			text-align:right;
		}

		table .value{
			text-align:left;
		}

		#errorMessage{
			color:red;
		}


		#footer{
			clear:both;
			width:100%;
			height:80px;
			background-color:black;

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
			<h1>商品購入確認画面</h1>
		</div>
		<div>
			<h3></h3>
			<div id ="errorMessage">
				<s:if test="errorMessage != ''">
					<s:property value="errorMessage" escape="false"/>
				</s:if>
			</div>

			<s:form action="BuyItemConfirmAction">
				<table>
					<tr>
						<td class="item">商品名:</td>
						<td class="value"><s:property value="#session.item_name"/></td>
					</tr>
					<tr>
						<td class="item">価格:</td>
						<td class="value"><span style="color:red;"><s:property value="#session.item_price"/>円</span></td>
					</tr>
					<tr>
						<td class="item">購入個数:</td>
						<td class="value"><s:property value="#session.count"/></td>
					</tr>
					<tr>
						<td class="item">支払い方法:</td>
						<td class="value"><s:property value="#session.pay"/></td>
					</tr>
					<s:submit value="購入を確定する"/>
				</table>


			</s:form>
		</div>
	</div>
	<div id="footer">

	</div>
</body>
</html>