$(function()
{
	//回车事件
	$("#password").keydown(function (e) {
	    if (e.which == 13) {
	    	$("#submit").click();
	    }
	});
	$("#username").keydown(function (e) {
	    if (e.which == 13) {
	    	$("#submit").click();
	    }
	});
	//点击登录按钮
	$(document).ready(function(){
	  $("#submit").click(function(){
		  if($("input[name='username']").val()==""){
			  alert("用户名必须填写!!");
		  }else{
			  $.ajax({
				  url:"/ETMS/system/login/isLoginAjax",
				  type: "POST",
				  data: {
					  username : $("input[name='username']").val(),
					  password: $("input[name='password']").val()
				  },
				  success:function(date){
					if (date.toString() == "sussess") {
						location.href="/ETMS/system/login/loginUser";
					}else{
						alert("用户名或密码错误！！！");
					}
				  }
				  ,error:function(){
					  alert("登陆失败");
				  }
			  });
		  }
	  });
	});
	
	$(document).ready(function(){
		$("#re").click = function(){ 
			$("#username").val("");  
			$("#password").val("");
		};
	});
});