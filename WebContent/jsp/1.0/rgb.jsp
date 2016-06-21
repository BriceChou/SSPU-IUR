
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>RGB颜色查询对照表</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"></meta>
<style type="text/css">
<!--
body { margin: 0; background: #FFFFF3; font: 12px/18px Verdana; color: #666; }
-->
</style>
</head>
<body>
<table width="600" border="0" align="center" cellpadding="0" cellspacing="0" class="infotable">
  <tr>
    <td align="left">　</td>
  </tr>
  <tr>
    <td width="364" height="26" align="left" valign="bottom"><h2>RGB颜色查询对照表</h2></td>
  </tr>
  
  <tr>
    <td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="infotable">
        <tr>
          <td valign="top">
          <table cellspacing="0" cellpadding="0" border="0">
              <tr>
                <td valign="top" width="593" colspan="2"></td>
              </tr>
              <tr>
                <td width="593" height="71%" colspan="2" align="middle" bgcolor="#FFFFF3"></td>
              </tr>
              <tr>
                <td width="593" height="71%" colspan="2" align="middle" bgcolor="#FFFFF3"><p class="style2">
                </tr>
                </table>
                </td>
                </tr>
                </table>
                
                    <script language="JavaScript" type="text/javascript">
var SelRGB = '';
var DrRGB = '';
var SelGRAY = '120';

var hexch = new Array('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F');

function ToHex(n)
{	var h, l;

	n = Math.round(n);
	l = n % 16;
	h = Math.floor((n / 16)) % 16;
	return (hexch[h] + hexch[l]);
}

function DoColor(c, l)
{ var r, g, b;

  r = '0x' + c.substring(1, 3);
  g = '0x' + c.substring(3, 5);
  b = '0x' + c.substring(5, 7);
  
  if(l > 120)
  {
    l = l - 120;

    r = (r * (120 - l) + 255 * l) / 120;
    g = (g * (120 - l) + 255 * l) / 120;
    b = (b * (120 - l) + 255 * l) / 120;
  }else
  {
    r = (r * l) / 120;
    g = (g * l) / 120;
    b = (b * l) / 120;
  }

  return '#' + ToHex(r) + ToHex(g) + ToHex(b);
}

function EndColor()
{ var i;

  if(DrRGB != SelRGB)
  {
    DrRGB = SelRGB;
    for(i = 0; i <= 30; i ++)
      GrayTable.rows(i).bgColor = DoColor(SelRGB, 240 - i * 8);
  }

  SelColor.value = DoColor(RGB.innerText, GRAY.innerText);
  ShowColor.bgColor = SelColor.value;
}
</script>
                    <script language="JavaScript" type="text/javascript" for="ColorTable" event="onclick">
  SelRGB = event.srcElement.bgColor;
  EndColor();
</script>
                    <script language="JavaScript" type="text/javascript" for="ColorTable" event="onmouseover">
  RGB.innerText = event.srcElement.bgColor;
  EndColor();
</script>
                    <script language="JavaScript" type="text/javascript" for="ColorTable" event="onmouseout">
  RGB.innerText = SelRGB;
  EndColor();
</script>
                    <script language="JavaScript" type="text/javascript" for="GrayTable" event="onclick">
  SelGRAY = event.srcElement.title;
  EndColor();
</script>
                    <script language="JavaScript" type="text/javascript" for="GrayTable" event="onmouseover">
  GRAY.innerText = event.srcElement.title;
  EndColor();
</script>
                    <script language="JavaScript" type="text/javascript" for="GrayTable" event="onmouseout">
  GRAY.innerText = SelGRAY;
  EndColor();
</script>
                    <script language="JavaScript" type="text/javascript" for="Ok" event="onclick">
  window.returnValue = SelColor.value;
  window.close();
</script>
                  </p>
</body>
</html>