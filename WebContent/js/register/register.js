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
	//点击注册按钮
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