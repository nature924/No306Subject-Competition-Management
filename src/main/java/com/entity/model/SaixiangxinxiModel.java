package com.entity.model;

import com.entity.SaixiangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 赛项信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
public class SaixiangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 比赛地点
	 */
	
	private String bisaididian;
		
	/**
	 * 赛项内容
	 */
	
	private String saixiangneirong;
		
	/**
	 * 级别
	 */
	
	private String jibie;
		
	/**
	 * 参加人数
	 */
	
	private Integer canjiarenshu;
		
	/**
	 * 报名费用
	 */
	
	private Integer baomingfeiyong;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 截至日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiezhiriqi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：比赛地点
	 */
	 
	public void setBisaididian(String bisaididian) {
		this.bisaididian = bisaididian;
	}
	
	/**
	 * 获取：比赛地点
	 */
	public String getBisaididian() {
		return bisaididian;
	}
				
	
	/**
	 * 设置：赛项内容
	 */
	 
	public void setSaixiangneirong(String saixiangneirong) {
		this.saixiangneirong = saixiangneirong;
	}
	
	/**
	 * 获取：赛项内容
	 */
	public String getSaixiangneirong() {
		return saixiangneirong;
	}
				
	
	/**
	 * 设置：级别
	 */
	 
	public void setJibie(String jibie) {
		this.jibie = jibie;
	}
	
	/**
	 * 获取：级别
	 */
	public String getJibie() {
		return jibie;
	}
				
	
	/**
	 * 设置：参加人数
	 */
	 
	public void setCanjiarenshu(Integer canjiarenshu) {
		this.canjiarenshu = canjiarenshu;
	}
	
	/**
	 * 获取：参加人数
	 */
	public Integer getCanjiarenshu() {
		return canjiarenshu;
	}
				
	
	/**
	 * 设置：报名费用
	 */
	 
	public void setBaomingfeiyong(Integer baomingfeiyong) {
		this.baomingfeiyong = baomingfeiyong;
	}
	
	/**
	 * 获取：报名费用
	 */
	public Integer getBaomingfeiyong() {
		return baomingfeiyong;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：截至日期
	 */
	 
	public void setJiezhiriqi(Date jiezhiriqi) {
		this.jiezhiriqi = jiezhiriqi;
	}
	
	/**
	 * 获取：截至日期
	 */
	public Date getJiezhiriqi() {
		return jiezhiriqi;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
