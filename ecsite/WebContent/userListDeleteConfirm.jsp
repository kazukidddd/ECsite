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
<title>UserListDelete確認画面</title>
</head>
<body>
		<div id="header">
			<div id="pr">
			</div>
		</div>
		<div id="main">
			<div id="top">
				<p>ユーザー一覧削除確認</p>
			</div>
			<div>


			<h3>本当に削除してもいいですか？</h3>
					<table border="1">
						<tr>
							<th>ログインID</th>
							<th>ログインパス</th>
							<th>ユーザー名</th>
							<th>登録日</th>

						</tr>
						<s:iterator value="#session.userInfoList">
							<tr>
								<td><s:property value="loginID" /></td>
								<td><s:property value="loginPass" /></td>
								<td><s:property value="userName" /></td>
								<td><s:property value="insertDate" /></td>

							</tr>
						</s:iterator>
					</table>
						<s:form action="UserListDeleteCompleteAction">
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