<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<div id="contents" class="profile">
<!-- main_contents -->
<div id="main_contents">
<s:if test='msg != "OK" &&  msg != "CLOSE" ' >	
<div><font color="red"><s:property value="msg"/></font></div>
</s:if>

