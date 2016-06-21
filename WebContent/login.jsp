<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="no-js">
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>产学研平台中心系统</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="./css/login/reset.css">
        <link rel="stylesheet" href="./css/login/supersized.css">
        <link rel="stylesheet" href="./css/login/style.css">
    </head>
    <body>
        <div class="page-container">
            <h1  >登    录</h1>
            <form  action = "checkUser">
                <input type="text" name="username" class="username" placeholder="Username">
                <input type="password" name="password" class="password" placeholder="Password">
                <button  id="submit" type = "submit">登  录</button>
                <button  id="register" >注册</button>
                <div class="error"><span>+</span></div>
            </form>
            <div class="connect">
                <p>本系统由周明亮版权所有 </p>
                <p>Copyright © 2015-2016 </p>
                <p> BriceChou  All Rights Reserved.</p>
            </div>
        </div>
        <!-- Javascript -->
        <script src="./js/jquery-1.8.2.min.js"></script>
        <script src="./js/login/supersized.3.2.7.min.js"></script>
        <script src="./js/login/supersized-init.js"></script>
        <script src="./js/login/login.js"></script>
    </body>
</html>