package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 赛项信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
@TableName("saixiangxinxi")
public class SaixiangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SaixiangxinxiEntity() {
		
	}
	
	public SaixiangxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 赛项名称
	 */
					
	private String saixiangmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiezhiriqi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：赛项名称
	 */
	public void setSaixiangmingcheng(String saixiangmingcheng) {
		this.saixiangmingcheng = saixiangmingcheng;
	}
	/**
	 * 获取：赛项名称
	 */
	public String getSaixiangmingcheng() {
		return saixiangmingcheng;
	}
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
