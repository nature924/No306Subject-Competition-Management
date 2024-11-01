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
 * 奖项统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
@TableName("jiangxiangtongji")
public class JiangxiangtongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiangxiangtongjiEntity() {
		
	}
	
	public JiangxiangtongjiEntity(T t) {
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
	 * 院校名称
	 */
					
	private String yuanxiaomingcheng;
	
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
	 * 设置：院校名称
	 */
	public void setYuanxiaomingcheng(String yuanxiaomingcheng) {
		this.yuanxiaomingcheng = yuanxiaomingcheng;
	}
	/**
	 * 获取：院校名称
	 */
	public String getYuanxiaomingcheng() {
		return yuanxiaomingcheng;
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
