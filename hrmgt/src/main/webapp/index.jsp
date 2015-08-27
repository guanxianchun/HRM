<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>dddd</title>
   
 <meta http-equiv="pragma" content="no-cache">
 <meta http-equiv="cache-control" content="no-cache">
 <meta http-equiv="expires" content="0">   
 <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
 <meta http-equiv="description" content="This is my page">

  </head>
  <body>
   <s:form action="/User_login.action" method="post">
    <s:label value="系统登陆dd"></s:label>
    <s:textfield name="userName" label="账号" />
    <s:password name="passWord" label="密码" />
    <s:submit value="登录" />
   </s:form>
  </body>
</html>