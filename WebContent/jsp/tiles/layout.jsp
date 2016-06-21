<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<head>
<meta name="robots" content="noindex,nofollow" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link href="${pageContext.request.contextPath}/css/format.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery/jquery-1.8.2.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/json/json2/form2json.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-validation/1.9.0/jquery.validate.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-validation/1.9.0/messages_cn.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-validation/1.9.0/jquery.metadata.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/erp-common.js"></script>
<link href="${pageContext.request.contextPath}/js/jquery-validation/1.9.0/validate.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/table.css" type="text/css" rel="stylesheet" />
<script type="text/javascript">
<!--
jQuery.validator.addMethod("notStartWithZero", function(value, element) {    
    var tel = /^0/;
    if (value == "0" ) 
    	return true;
    return this.optional(element) || (!tel.test(value));
}, "不能以0做为数字的开头");
jQuery.validator.addMethod("intMultiple", function(value, element, param) {    
    return this.optional(element) || (value % param[0] == 0);
}, "请输入{0}的整数倍");
jQuery.validator.addMethod("lessThan", function(value, element, param) { 
	var other = param;
    return value - other < 0 || !param;
}, $.validator.format("请输入小于{0}的数字"));
jQuery.validator.addMethod("greaterThan", function(value, element, param) {    
	var other = param;
    return value - other > 0 || !param;
}, $.validator.format("请输入大于{0}的数字"));
//匹配integer
jQuery.validator.addMethod("isInteger", function(value, element) {       
     return this.optional(element) || (/^[-\+]?\d+$/.test(value) );       
}, "请输入数字"); 

function closepop() {
	// parent._returnvalue = 1;
	parent.jQuery.fancybox.close(); 
}
//-->
</script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery/jquery.mousewheel.pack.js?v=3.1.3"></script>

<!-- Add fancyBox main JS and CSS files -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/fancybox/jquery.fancybox.pack.js?v=2.1.5"></script>
<link rel="stylesheet" type="text/css" href="./js/fancybox/jquery.fancybox.css?v=2.1.5" media="screen" />

<!-- Add Button helper (this is optional) -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/fancybox/helpers/jquery.fancybox-buttons.css?v=1.0.5" />
<script type="text/javascript" src="./js/fancybox/helpers/jquery.fancybox-buttons.js?v=1.0.5"></script>

<!-- Add Thumbnail helper (this is optional) -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/fancybox/helpers/jquery.fancybox-thumbs.css?v=1.0.7" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/fancybox/helpers/jquery.fancybox-thumbs.js?v=1.0.7"></script>

<!-- Add Media helper (this is optional) -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/fancybox/helpers/jquery.fancybox-media.js?v=1.0.6"></script>
</head>
<body>

<tiles:insertAttribute name="header" />  
<tiles:insertAttribute name="body" />
<tiles:insertAttribute name="footer" /> 
</body>
</html>