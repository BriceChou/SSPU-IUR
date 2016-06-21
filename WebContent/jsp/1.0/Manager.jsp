<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>
<title>上海第二工业大学人力资源管理系统</title>
<style type="text/css">
body {
	background-image: url("./images/manager_head.jpg");
	background-repeat: no-repeat;
	background-size: 100% 20%;
	font-family: "宋体";
	font-size: 16px;
}

.a1 {
	font-family: "宋体";
	font-size: 12px;
	color: #333;
}
</style>
<script type="text/javascript" src="./js/index.js">
	
</script>
</head>

<body
	onload="MM_preloadImages('./images/companyInfo_1.png','./images/companyInfo_2.png',
		'./images/studentInfo_1.png','./images/studentInfo_2.png',
		'./images/practiceInfo_1.png','./images/practiceInfo_2.png',
		'./images/messageBox_1.png','./images/messageBox_2.png')">
	<table width="100%" height="100%" border="0">
		<tr>
			<td height="38" colspan="6">&nbsp;</td>
		</tr>
		<tr>
			<td height="38" colspan="3">欢迎管理员周明亮（BriceChou）同学登陆系统！</td>
			<td width="200" align="right" valign="middle">我的账户</td>
			<td width="202" align="right" valign="middle">返回首页</td>
			<td width="198" align="right" valign="middle"><a
				href="exitLogin">退出登录</a></td>
		</tr>
		<tr>
			<td width="235" align="center" valign="middle"><form id="form1"
					name="form1" method="post" action="">
					<table width="200" border="0" cellspacing="15">
						<tr>
							<th scope="col"><a href="companyJobs" onmouseout="MM_swapImgRestore()"
								onmouseover="MM_swapImage('companyInfo','','./images/companyInfo_2.png',1)">
									<img src="./images/companyInfo_1.png" width="198" height="43"
									id="companyInfo" />
							</a></th>
						</tr>
						<tr>
							<th scope="row"><a href="#" onmouseout="MM_swapImgRestore()"
								onmouseover="MM_swapImage('studentInfo','','./images/studentInfo_2.png',1)">
									<img src="./images/studentInfo_1.png" width="198" height="43"
									id="studentInfo" />
							</a></th>
						</tr>
						<tr>
							<th scope="row"><a href="#" onmouseout="MM_swapImgRestore()"
								onmouseover="MM_swapImage('practiceInfo','','./images/practiceInfo_2.png',1)">
									<img src="./images/practiceInfo_1.png" width="198" height="43"
									id="practiceInfo" />
							</a></th>
						</tr>
						<tr>
							<th scope="row"><a href="#" onmouseout="MM_swapImgRestore()"
								onmouseover="MM_swapImage('messageBox','','./images/messageBox_2.png',1)">
									<img src="./images/messageBox_1.png" width="198" height="43"
									id="messageBox" />
							</a></th>
						</tr>
					</table>
				</form></td>
			<td width="47" align="center" valign="middle">&nbsp;</td>
			<td colspan="4" align="center" valign="middle" bgcolor="#FFFFFF">&nbsp;</td>
		</tr>
		<tr>
			<td colspan="6" align="center" valign="bottom" class="a1"><hr /></td>
		</tr>
		<tr>
			<td colspan="6" align="center" valign="top" class="a1">系统版权归属
				上海第二工业大学 copyrights 2015</td>
		</tr>
	</table>
</body>
</html>