<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>
	<meta charset="utf-8">
	<title>实践管理系统</title>
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="robots" content="" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0">
	<link rel=stylesheet href=css/style.css>
		<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
	<link href="css/templatemo_style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="testing">
<header class="main">

	<h1><strong>上海第二工业大学</strong> 实践管理系统</h1>
	<input type="text"  value="信息搜索" />
</header>
<section class="user">
	<div class="profile-img">
		<p><img src="images/manager_icon.png" alt="" height="40" width="40" />欢迎您的尊敬的BriceChou管理员：</p>
	</div>
	<div class="buttons">
		<button class="ico-font">&#9206;</button>
		<span class="button dropdown">
			<a href="#">消息提醒 <span class="pip">4</span></a>
		</span> 
		<span class="button dropdown">
			<a href="#">收件箱 <span class="pip">6</span></a>
		</span> 
		<span class="button">账户</span>
		<span class="button">帮助</span>
		<span class="button blue"><a href="login.jsp">退出</a></span>
	</div>
</section>
</div>
<nav>
	<ul>
		<li class="section"><a href="#"><span class="icon"></span> 管理员主页</a></li>
		<li>
		<a href="companyJobs"><span class="icon"></span> 企业信息</a>
		</li>
		<li>
			<a href="jobsDetail"><span class="icon"></span> 学生信息<span class="pip">7</span></a>
		</li>
		<li>
			<a href="jobsEdit"><span class="icon"></span> 实习培训 <span class="pip">2</span></a>
		</li>
		<li><a href="studentInfo"><span class="icon"></span> 数据统计</a></li>
		<li><a href="jobsDetele"><span class="icon"></span> 邮件系统 <span class="pip">3</span></a></li>
		<li>
			<a href="jobsManager"><span class="icon"></span> 其他接口</a>
		</li>
	</ul>
</nav>

<section class="alert">
	<div class="green">	
		<p>尊敬的BriceChou你有 <a href="#">3个新的任务提醒</a> 和<a href="#">16个新实践申请</a> 请求，请及时处理！</p>
		<span class="close">&#10006;</span>
	</div>
</section>
<section class="content">
<section class="widget">
			<header> 
				<span class="icon">&#128318;</span>
				<hgroup>
					<h1>请点击企业信息管理，查看数据库内容！</h1>
				<h2>（每5分钟自动更新一次）</h2>
				</hgroup>
				<aside>
							<a href="#"><span class="alert">详细信息</span></a>
				</aside>
			</header>
			
			<div class="content">
			
			<form class="form-horizontal templatemo-contact-form-1" role="form" action="#" method="post">
		        <div class="form-group">
		          <div class="col-md-12">		          	
		            <label for="name" class="control-label">公司名称 *</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-user"></i>
		            	<input type="text" class="form-control" id="name" placeholder="">
		            </div>		            		            		            
		          </div>              
		    
		          <div class="col-md-12">
		            <label for="email" class="control-label">公司邮箱*</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-envelope-o"></i>
		            	<input type="email" class="form-control" id="email" placeholder="">
		            </div>
		          </div>
		          <div class="col-md-12">
		            <label for="website" class="control-label">公司主页（选填）</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-globe"></i>
		            	<input type="text" class="form-control" id="website" placeholder="">
		            </div>
		          </div>
		          <div class="col-md-12">
		            <label for="subject" class="control-label">招聘职位 *</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-info-circle"></i>
		            	<input type="text" class="form-control" id="subject" placeholder="">
		            </div>
		          </div>
		          <div class="col-md-12">
		            <label for="message" class="control-label">职位描述 *</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-pencil-square-o"></i>
		            	<textarea rows="8" cols="50" class="form-control" id="message" placeholder=""></textarea>
		            </div>
		          </div>
		          <div class="col-md-12">
		            <div class="checkbox">
		                <label>
		                  <input type="checkbox">保存实习需求信息
		                </label>
		            </div>		            
		          </div>
		          <div class="col-md-12">
		            <input type="submit" value="Send message" class="btn btn-success pull-right">
		          </div>
		        </div>		    	
		      </form>		
			
			</div>
		</section>
</section>


<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
<script src="../js/jquery.wysiwyg.js"></script>
<script src="../js/custom.js"></script>
<script src="../js/cycle.js"></script>
<script src="../js/jquery.checkbox.min.js"></script>
<script src="../js//flot.js"></script>
<script src="../js/flot.resize.js"></script>
<script src="../js/flot-time.js"></script>
<script src="../js/flot-pie.js"></script>
<script src="../js/flot-graphs.js"></script>
<script src="../js/jquery.tablesorter.min.js"></script>
<script type="text/javascript">
// Feature slider for graphs
$('.cycle').cycle({
	fx: "scrollHorz",
	timeout: 0,
    slideResize: 0,
    prev:    '.left-btn', 
    next:    '.right-btn'
});
</script>
</body>
</html>