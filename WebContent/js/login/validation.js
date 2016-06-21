function notNumber(strValue) {
	if (strValue == "")
		return false;
	var pattern = /^\d*$/;
	if (pattern.test(strValue))
		return false;
	else
		return true;
}
/*
 * ================================================================== 是否为空
 * ==================================================================
 */
function isEmpty(strValue) {
	strValue = strValue.replace(/^\s+|\s+$/g, "");
	return (strValue == null || strValue == "");
}

/*
 * ================================================================== 是否为正有理数
 * ==================================================================
 */
function isPositive(strValue) {
	return isInt(strValue, "+") || isFloat(strValue, "+");
}

/*
 * ================================================================== 是否为负有理数
 * ==================================================================
 */
function isNegative(strValue) {
	return isInt(strValue, "-") || isFloat(strValue, "-");
}

/*
 * ==================================================================
 * 判断objStr是否为合法的Email地址
 * ==================================================================
 */
function isValidEmail(objStr) {
	if (objStr == "")
		return false;
	var reg = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/;
	objStr = objStr.toString();
	return (objStr.match(reg) != null);
}

/*
 * ==================================================================
 * 判断objStr是否为合法的日期(yyyy-MM-dd)或者(yy-MM-dd)
 * ==================================================================
 */
function isDate(objStr) {
	var reg = /^((\d{4})|(\d{2}))-(\d{1,2})-(\d{1,2})$/;

	if (trim(objStr) == "")
		return false;
	else
		objStr = objStr.toString();

	if (objStr.match(reg) == null)
		return false;

	var arrDate = objStr.split("-");

	var year = parseInt(arrDate[0], 10);
	var month = parseInt(arrDate[1], 10);
	var day = parseInt(arrDate[2], 10);

	if (year < 100)
		if (year < 50)
			year += 2000;
		else
			year += 1900;

	var date = new Date(year, month - 1, day);
	var y = parseInt(date.getYear(), 10);
	// 如果年份是19**，Date.getYear()返回的是末两位数字作为年份，所以一定要加上1900才是正确的年份
	if (y < 100)
		y += 1900;

	if ((y == year && parseInt(date.getMonth(), 10) == month - 1 && parseInt(
			date.getDate(), 10) == day)
			&& year >= 1900 && year <= 2049)
		return true;
	else
		return false;
}

/*
 * ================================================================== (测试字符串,
 * sign(+、-、empty)；zero(empty、1、true) 判断是否为整数、正整数、负整数、正整数+0、负整数+0
 * ==================================================================
 */
function isInt(objStr, sign, zero) {
	var reg;
	var bolzero;

	if (trim(objStr) == "")
		return false;
	else
		objStr = objStr.toString();

	if ((sign == null) || (trim(sign) == ""))
		sign = "+-";

	if ((zero == null) || (trim(zero) == ""))
		bolzero = false;
	else {
		zero = zero.toString();
		bolzero = (zero == "true" || zero == "1");
	}

	switch (sign) {
		case "+-" :
			// 整数
			reg = /(^-?|^\+?)\d+$/;
			break;
		case "+" :
			if (!bolzero)
				// 正整数
				reg = /^\+?[0-9]*[1-9][0-9]*$/;
			else {
				// 正整数+0
				// reg=/^\+?\d+$/;
				reg = /^\+?[0-9]*[0-9][0-9]*$/;
			}
			break;
		case "-" :
			if (!bolzero)
				// 负整数
				reg = /^-[0-9]*[1-9][0-9]*$/;
			else
				// 负整数+0
				// reg=/^-\d+$/;
				reg = /^-[0-9]*[0-9][0-9]*$/;
			break;
		default :
			alert("检查符号参数，只可为(空、+、-)");
			return false;
			break;
	}

	return (objStr.match(reg) != null);
}

/*
 * isFloat2(objStr, iDigit):判断objStr是否为浮点数，且小数位数小于等于vDigit
 */
function isFloat2(objStr, iDigit, num) {
	num = num ? ("{0," + num + "}") : "*"
	var strReg = "^(-?|\\+?)([0-9]\\d" + num + "?)(\\.\\d{1,";
	// var reg=/^(-?|\+?)(0|[1-9]\d*?)(\.\d{1,10})?$/;
	strReg += iDigit;
	strReg += "})?$";

	if (trim(objStr) == "")
		return false;
	else
		objStr = objStr.toString();

	var reg = new RegExp(strReg);
	return (objStr.match(reg) != null);
}

/*
 * ================================================================== (测试字符串,
 * sign(+、-、empty)；zero(empty、1、true) 判断是否为浮点数、正浮点数、负浮点数、正浮点数+0、负浮点数+0
 * ==================================================================
 */
function isFloat(objStr, sign, zero) {
	var reg;
	var bolzero;

	if (trim(objStr) == "")
		return false;
	else
		objStr = trim(objStr.toString());

	if ((sign == null) || (trim(sign) == ""))
		sign = "+-";

	if ((zero == null) || (trim(zero) == ""))
		bolzero = false;
	else {
		zero = zero.toString();
		bolzero = (zero == "true" || zero == "1");
	}

	switch (sign) {
		case "+-" :
			// 浮点数
			reg = /^((-?|\+?)\d+)(\.\d+)?$/;
			break;
		case "+" :
			if (!bolzero) {
				// 正浮点数
				reg = /^\+?(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*))$/;
			} else {
				// 正浮点数+0
				reg = /^\+?\d+(\.\d+)?$/;
			}
			break;
		case "-" :
			if (!bolzero) {
				// 负浮点数
				reg = /^-(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*))$/;
			} else {
				// 负浮点数+0
				reg = /^((-\d+(\.\d+)?)|(0+(\.0+)?))$/;
			}
			break;
		default :
			alert("检查符号参数，只可为(空、+、-)");
			return false;
			break;
	}

	return (objStr.match(reg) != null);
}
/*
 * ==================================================================
 * 将srcStr四舍五入到nAfterDot位小数
 * ==================================================================
 */
function FormatNumber(srcStr, nAfterDot) {
	var srcStr, nAfterDot;
	var resultStr, nTen;
	srcStr = "" + srcStr + "";
	strLen = srcStr.length;
	dotPos = srcStr.indexOf(".", 0);
	if (dotPos == -1) {
		resultStr = srcStr + ".";
		for (i = 0; i < nAfterDot; i++) {
			resultStr = resultStr + "0";
		}
	} else {
		if ((strLen - dotPos - 1) >= nAfterDot) {
			nAfter = dotPos + nAfterDot + 1;
			nTen = 1;
			for (j = 0; j < nAfterDot; j++) {
				nTen = nTen * 10;
			}
			resultStr = Math.round(parseFloat(srcStr) * nTen) / nTen;
		} else {
			resultStr = srcStr;
			for (i = 0; i < (nAfterDot - strLen + dotPos + 1); i++) {
				resultStr = resultStr + "0";
			}

		}
	}
	return resultStr;

}

/*
 * ================================================================== 字符输入控制
 * ==================================================================
 */
function regInput(obj, reg, inputStr) {
	/**
	 * 任意数字：/^[0-9]*$/ 限2位小数：/^\d*\.?\d{0,2}$/ 小写英文：/^[a-z]*$/ 大写英文：/^[A-Z]*$/ 日
	 * 期：/^\d{1,4}([-\/](\d{1,2}([-\/](\d{1,2})?)?)?)?$/ 任意中文：input： /^$/ paste
	 * or drop： /^[\u4E00-\u9FA5]*$/
	 */
	var docSel = document.selection.createRange()

	if (docSel.parentElement().tagName != "INPUT")
		return false
	oSel = docSel.duplicate()
	oSel.text = ""

	var srcRange = obj.createTextRange()

	oSel.setEndPoint("StartToStart", srcRange)

	var str = oSel.text + inputStr + srcRange.text.substr(oSel.text.length)

	return reg.test(str)
}

/*
 * ==================================================================
 * 只能输入整数，使用时在form中加入该脚本即可,可以输入负数
 * ==================================================================
 */
function enableAllIntOnly(obj) {
	var reg = /^(-?)[0-9]*$/
	obj.onkeypress = function() {
		return regInput(this, reg, String.fromCharCode(event.keyCode))
	}
	obj.onpaste = function() {
		return regInput(this, reg, window.clipboardData.getData('Text'))
	}
	obj.ondrop = function() {
		return regInput(this, reg, event.dataTransfer.getData('Text'))
	}
}

/*
 * ==================================================================
 * 模糊查询时,不允许输入'符号
 * ==================================================================
 */
function enableQuery(obj) {
	var reg = /^[^']+$/
	obj.onkeypress = function() {
		return regInput(this, reg, String.fromCharCode(event.keyCode))
	}
	obj.onpaste = function() {
		return regInput(this, reg, window.clipboardData.getData('Text'))
	}
	obj.ondrop = function() {
		return regInput(this, reg, event.dataTransfer.getData('Text'))
	}
}

/*
 * ==================================================================
 * 只能输入整数，使用时在form中加入该脚本即可
 * ==================================================================
 */
function enableIntOnly(obj) {
	var reg = /^[0-9]*$/
	obj.onkeypress = function() {
		return regInput(this, reg, String.fromCharCode(event.keyCode))
	}
	obj.onpaste = function() {
		return regInput(this, reg, window.clipboardData.getData('Text'))
	}
	obj.ondrop = function() {
		return regInput(this, reg, event.dataTransfer.getData('Text'))
	}
}

function enableNumber2Only(obj) {
	obj.onkeypress = function() {
		return regInput(this, /^\d*\.?\d{0,2}$/, String
						.fromCharCode(event.keyCode))
	}
	obj.onpaste = function() {
		return regInput(this, /^\d*\.?\d{0,2}$/, window.clipboardData
						.getData('Text'))
	}
	obj.ondrop = function() {
		return regInput(this, /^\d*\.?\d{0,2}$/, event.dataTransfer
						.getData('Text'))
	}
}

function enableAllNumber2Only(obj) {
	obj.onkeypress = function() {
		return regInput(this, /^(-?)\d*\.?\d{0,2}$/, String
						.fromCharCode(event.keyCode))
	}
	obj.onpaste = function() {
		return regInput(this, /^(-?)\d*\.?\d{0,2}$/, window.clipboardData
						.getData('Text'))
	}
	obj.ondrop = function() {
		return regInput(this, /^(-?)\d*\.?\d{0,2}$/, event.dataTransfer
						.getData('Text'))
	}
}

function enableNumber4Only(obj) {
	obj.onkeypress = function() {
		return regInput(this, /^\d*\.?\d{0,4}$/, String
						.fromCharCode(event.keyCode))
	}
	obj.onpaste = function() {
		return regInput(this, /^\d*\.?\d{0,4}$/, window.clipboardData
						.getData('Text'))
	}
	obj.ondrop = function() {
		return regInput(this, /^\d*\.?\d{0,4}$/, event.dataTransfer
						.getData('Text'))
	}
}
/**
 * 允许输入整数加分隔符,
 */
function enableIntWithSplit(obj) {
	var reg = /^[0-9,]*$/
	obj.onkeypress = function() {
		return regInput(this, reg, String.fromCharCode(event.keyCode))
	}
	obj.onpaste = function() {
		return regInput(this, reg, window.clipboardData.getData('Text'))
	}
	obj.ondrop = function() {
		return regInput(this, reg, event.dataTransfer.getData('Text'))
	}
}

/**
 * 允许输入浮点数加分隔符,
 */
function enableFloatWithSplit(obj, type) {
	if (type == null)
		reg = /^[0-9]*$/
	else if (type == 2)
		reg = /^[0-9,]*\.?\d{0,2}$/
	else if (type == 4)
		reg = /^[0-9,]*\.?\d{0,4}$/
	else if (type == 6)
		reg = /^[0-9,]*\.?\d{0,6}$/
	else
		return;
	obj.onkeypress = function() {
		if (event.keyCode != 13) {
			return regInput(this, reg, String.fromCharCode(event.keyCode))
		} else {
			if (typeof(textForward) != 'undefined') {
				textForward(obj);
			}
		}
	}
	obj.onpaste = function() {
		return regInput(this, reg, window.clipboardData.getData('Text'))
	}
	obj.ondrop = function() {
		return regInput(this, reg, event.dataTransfer.getData('Text'))
	}
}

/*
 * ==================================================================
 * 使用时在form中加入该脚本即可，type为空时，即只能输入整数 type为2,4时，表示2,4位小数，为'a'表示小写，为'A'表示大写，为
 * 'date'表示只能输入日期
 * ==================================================================
 */
function enableOnly(obj, type) {
	var reg;
	if (type == null)
		reg = /^[0-9]*$/
	else if (type == 2)
		reg = /^\d*\.?\d{0,2}$/
	else if (type == 4)
		reg = /^\d*\.?\d{0,4}$/
	else if (type == 'a')
		reg = /^[a-z]*$/
	else if (type == 'A')
		reg = /^[A-Z]*$/
	else if (type == 'date')
		reg = /^\d{1,4}([-\/](\d{1,2}([-\/](\d{1,2})?)?)?)?$/
	else
		return;
	obj.onkeypress = function() {

		if (event.keyCode != 13) {
			return regInput(this, reg, String.fromCharCode(event.keyCode))
		} else {
			if (typeof(textForward) != 'undefined') {
				textForward(obj);
			}
		}
	}
	obj.onpaste = function() {
		return regInput(this, reg, window.clipboardData.getData('Text'))
	}
	obj.ondrop = function() {
		return regInput(this, reg, event.dataTransfer.getData('Text'))
	}
}

/**
 * 比较两个时间
 * @param {} d1
 * @param {} d2
 * @return {} 前者大返回1，后者大返回-1，相同返回0，非时间返回false
 */
function compareDate(d1, d2) {
	var reg = /^(\d{4})-(\d{1,2})-(\d{1,2})$/;
	if (reg.test(d1) && reg.test(d2)) {
		var day1 = d1.split("-"), day2 = d2.split("-"), date1 = new Date(), date2 = new Date();
		date1.setFullYear(parseInt(day1[0], 10), parseInt(day1[1], 10) - 1,
				parseInt(day1[2], 10));
		date2.setFullYear(parseInt(day2[0], 10), parseInt(day2[1], 10) - 1,
				parseInt(day2[2], 10));
		return date1 > date2 ? 1 : (date1 < date2 ? -1 : 0);
	} else {
		return NaN;
	}
}


function CheckDateTime(str)  

{   
//yyyy-mm-dd hh:mi
    var reg = /^(\d{4})-(\d{2})-(\d{2}) (\d{2}):(\d{2})$/;   

    var r = str.match(reg);   

    if(r==null)return false;   

    r[2]=r[2]-1;   

    var d= new Date(r[1],r[2],r[3],r[4],r[5]);   

    if(d.getFullYear()!=r[1])return false;   

    if(d.getMonth()!=r[2])return false;   

    if(d.getDate()!=r[3])return false;   

    if(d.getHours()!=r[4])return false;   

    if(d.getMinutes()!=r[5])return false;   

   // if(d.getSeconds()!=r[6])return false;   

    return true;   

}   

function isNum(s) {
 //var regu = "^([0-9]*)$";
 var regu = "^([0-9]*[.0-9])$"; // 小数测试
 var re = new RegExp(regu);
 if (s.search(re) != -1)
 return true;
 else
 return false;
}

