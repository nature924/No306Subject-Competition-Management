package com.entity.vo;

import com.entity.JiangxiangtongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 奖项统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
public class JiangxiangtongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 数学
	 */
	
	private Integer shuxue;
		
	/**
	 * 物理
	 */
	
	private Integer wuli;
		
	/**
	 * 化学
	 */
	
	private Integer huaxue;
		
	/**
	 * 生物
	 */
	
	private Integer shengwu;
		
	/**
	 * 信息学
	 */
	
	private Integer xinxixue;
		
	/**
	 * 总数
	 */
	
	private Integer zongshu;
				
	
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
	 * 设置：数学
	 */
	 
	public void setShuxue(Integer shuxue) {
		this.shuxue = shuxue;
	}
	
	/**
	 * 获取：数学
	 */
	public Integer getShuxue() {
		return shuxue;
	}
				
	
	/**
	 * 设置：物理
	 */
	 
	public void setWuli(Integer wuli) {
		this.wuli = wuli;
	}
	
	/**
	 * 获取：物理
	 */
	public Integer getWuli() {
		return wuli;
	}
				
	
	/**
	 * 设置：化学
	 */
	 
	public void setHuaxue(Integer huaxue) {
		this.huaxue = huaxue;
	}
	
	/**
	 * 获取：化学
	 */
	public Integer getHuaxue() {
		return huaxue;
	}
				
	
	/**
	 * 设置：生物
	 */
	 
	public void setShengwu(Integer shengwu) {
		this.shengwu = shengwu;
	}
	
	/**
	 * 获取：生物
	 */
	public Integer getShengwu() {
		return shengwu;
	}
				
	
	/**
	 * 设置：信息学
	 */
	 
	public void setXinxixue(Integer xinxixue) {
		this.xinxixue = xinxixue;
	}
	
	/**
	 * 获取：信息学
	 */
	public Integer getXinxixue() {
		return xinxixue;
	}
				
	
	/**
	 * 设置：总数
	 */
	 
	public void setZongshu(Integer zongshu) {
		this.zongshu = zongshu;
	}
	
	/**
	 * 获取：总数
	 */
	public Integer getZongshu() {
		return zongshu;
	}
			
}
