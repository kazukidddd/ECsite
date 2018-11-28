<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf8"/>
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品一覧削除確認画面</title>
</head>
<body>
	<div id="header">
			<div id="pr">
			</div>
		</div>
		<div id="main">
			<div id="top">
				<p>商品一覧削除確認</p>
			</div>
			<div>


			<h3>本当に削除してもいいですか？</h3>
					<table border="1">
						<tr>
							<th>商品名</th>
							<th>値段</th>
							<th>在庫数</th>

						</tr>
						<s:iterator value="#session.itemList">
							<tr>
								<td><s:property value="itemName" /></td>
								<td><s:property value="itemPrice" /><span>円</span></td>
								<td><s:property value="itemStock" /></td>

							</tr>
						</s:iterator>
					</table>
						<s:form action="ItemListDeleteCompleteAction">
							<s:submit value="削除"  />
						</s:form>
				<s:if test="message !=null">
					<h3><s:property value="message" /></h3>
				</s:if>

		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>