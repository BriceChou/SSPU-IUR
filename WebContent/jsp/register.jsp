<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8">
		<link href="../css/register/style.css" rel='stylesheet' type='text/css' />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		
</head>
 
<body>

<script type="text/javascript">
<!--
function addUser(type) {
		if(!$('#unitEditForm').valid()) return false;
		if (!confirm('确认保存信息吗?')) return false;
		var data = $('#unitEditForm').serializeJson();
		$.ajax({
			type: 'POST',
			data: data,
			dataType: 'json',
			url: '<s:url action="register" namespace="/"/>?saveType='+type,
			success: function(msg){
				if(msg.code != '200') {
					alert(msg.error);
				} else {
					parent._returnvalue = 1;
					alert('保存信息成功');
					window.location.reload();
				}
			}
		});

//-->
</script>




	<div class="main">
				 <!-----start-main---->		 
				 <form action = "register">
							<div class="lable">
		                     	<input type="text" name = "username" class="text" value="用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入用户名';}" id="active">
	
		                     	<input type="Password" name = "password"  class="text" value="密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入密码';}">
		                    </div>
		                    <div class="clear"> </div>
							
		                    <div class="lable-2">
		                    <input type="text" class="text" name="mail" value="请输入您的邮箱账号" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入您的邮箱账号';}">
		                    
							<div class="clear"> </div>
							 <h3>我已阅读并同意相关<span><a href="#" >服务条款和隐私政策</a><span></h3>
								 <div class="submit">
									<input type="submit" value="创建" >
									<input type="submit" value="返回" >
								</div>
									<div class="clear"> </div>
							 </form>
		<!-----//end-main---->
		</div>
		 <!-----start-copyright---->
   					<div class="copy-right">
						  <p>本系统由周明亮版权所有 </p>
                <p>Copyright © 2015-2016 </p>
                <p> BriceChou  All Rights Reserved.</p>
					</div>
				<!-----//end-copyright---->
	 <!--JavaScript-->
	
	 
</body>
</html>