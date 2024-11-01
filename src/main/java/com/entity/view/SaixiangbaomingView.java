package com.entity.view;

import com.entity.SaixiangbaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 赛项报名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
@TableName("saixiangbaoming")
public class SaixiangbaomingView  extends SaixiangbaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SaixiangbaomingView(){
	}
 
 	public SaixiangbaomingView(SaixiangbaomingEntity saixiangbaomingEntity){
 	try {
			BeanUtils.copyProperties(this, saixiangbaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
