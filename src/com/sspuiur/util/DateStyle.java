/** 
 *@author 周明亮
 *@datetime  2016年3月28日 上午9:22:06
 *
 *1、不允许复的日期风格。例如：yyyy-MM-dd和yyyy-M-d，表现出的风格是相同的。只有当两个日期风格含有不同的字符时，才会看成是不相同的日期风格。例如：yyyy-MM-dd和yyyy-M-d EEE。当含有重复的日期风格时，可以通过isShowOnly=true来区分，isShowOnly=true表示该风格只是“格式化Date类型的日期”用，而不用作“自动判断String类型的日期”。
2、日期必须含有完整年份信息。例如：MM-dd。没有年份的话，判断MM-dd是不准确的，因为无法识别出闰年（2-29）。其实MM-dd等类似的风格，我们日常习惯上，将其看作是“今年的M月d日”，而SimpleDateFormat中的parse方法中默认的年份为1970年。
3、添加顺序为：由简到繁。目的在于2012-12和2012-12-1是等价的，虽然日期风格不一样，但默认会看成是一样的且以DateStyle匹配到的最后一个为主。因此最好将详细的日期风格写在后面。
 *
 */

package com.sspuiur.util;

public enum DateStyle {

	YYYY_MM("yyyy-MM", false), YYYY_MM_DD("yyyy-MM-dd", false), YYYY_MM_DD_HH_MM(
			"yyyy-MM-dd HH:mm", false), YYYY_MM_DD_HH_MM_SS(
			"yyyy-MM-dd HH:mm:ss", false),

	YYYY_MM_EN("yyyy/MM", false), YYYY_MM_DD_EN("yyyy/MM/dd", false), YYYY_MM_DD_HH_MM_EN(
			"yyyy/MM/dd HH:mm", false), YYYY_MM_DD_HH_MM_SS_EN(
			"yyyy/MM/dd HH:mm:ss", false),

	YYYY_MM_CN("yyyy年MM月", false), YYYY_MM_DD_CN("yyyy年MM月dd日", false), YYYY_MM_DD_HH_MM_CN(
			"yyyy年MM月dd日 HH:mm", false), YYYY_MM_DD_HH_MM_SS_CN(
			"yyyy年MM月dd日 HH:mm:ss", false),

	HH_MM("HH:mm", true), HH_MM_SS("HH:mm:ss", true),

	MM_DD("MM-dd", true), MM_DD_HH_MM("MM-dd HH:mm", true), MM_DD_HH_MM_SS(
			"MM-dd HH:mm:ss", true),

	MM_DD_EN("MM/dd", true), MM_DD_HH_MM_EN("MM/dd HH:mm", true), MM_DD_HH_MM_SS_EN(
			"MM/dd HH:mm:ss", true),

	MM_DD_CN("MM月dd日", true), MM_DD_HH_MM_CN("MM月dd日 HH:mm", true), MM_DD_HH_MM_SS_CN(
			"MM月dd日 HH:mm:ss", true);

	private String value;

	private boolean isShowOnly;

	DateStyle(String value, boolean isShowOnly) {
		this.value = value;
		this.isShowOnly = isShowOnly;
	}

	public String getValue() {
		return value;
	}

	public boolean isShowOnly() {
		return isShowOnly;
	}
}
