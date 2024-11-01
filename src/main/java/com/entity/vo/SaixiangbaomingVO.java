package com.entity.vo;

import com.entity.SaixiangbaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 赛项报名
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
public class SaixiangbaomingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 级别
	 */
	
	private String jibie;
		
	/**
	 * 报名费用
	 */
	
	private Integer baomingfeiyong;
		
	/**
	 * 报名日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baomingriqi;
		
	/**
	 * 申报材料
	 */
	
	private String shenbaocailiao;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：报名日期
	 */
	 
	public void setBaomingriqi(Date baomingriqi) {
		this.baomingriqi = baomingriqi;
	}
	
	/**
	 * 获取：报名日期
	 */
	public Date getBaomingriqi() {
		return baomingriqi;
	}
				
	
	/**
	 * 设置：申报材料
	 */
	 
	public void setShenbaocailiao(String shenbaocailiao) {
		this.shenbaocailiao = shenbaocailiao;
	}
	
	/**
	 * 获取：申报材料
	 */
	public String getShenbaocailiao() {
		return shenbaocailiao;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
