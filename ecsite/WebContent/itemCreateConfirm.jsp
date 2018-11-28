<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utr-8"/>
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品確認画面</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>確認画面</p>
		</div>
		<div><h3>登録する内容は以下でよろしいですか。</h3>
			<table>
				<s:form action="ItemCreateCompleteAction">
				<tr id="box">
					<td>
						<label>商品名</label>
					</td>
					<td>
						<s:property value="itemName" escape="false" />
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>商品価格:</label>
					</td>
					<td>
						<s:property value="itemPrice" escape="false" />
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>在庫数:</label>
					</td>
					<td>
						<s:property value="itemStock" escape="false" />
					</td>
				</tr>
				<tr>
					<td>
						<s:submit value="完了" />
					</td>
				</tr>
				</s:form>
			</table>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>