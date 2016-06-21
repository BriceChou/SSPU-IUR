
jQuery(document).ready(function() {
	
	
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
	
	$("#register").click(function(e){
		window.location="./jsp/register.jsp";
	});
	
    $('.page-container form').submit(function(){
        var username = $(this).find('.username').val();
        var password = $(this).find('.password').val();
        if(username == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '27px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.username').focus();
            });
            return false;
        }
        if(password == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '96px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.password').focus();
            });
            return false;
        }
    });

    $('.page-container form .username, .page-container form .password').keyup(function(){
        $(this).parent().find('.error').fadeOut('fast');
    });

});
