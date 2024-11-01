package com.entity.view;

import com.entity.SaixiangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 赛项信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
@TableName("saixiangxinxi")
public class SaixiangxinxiView  extends SaixiangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SaixiangxinxiView(){
	}
 
 	public SaixiangxinxiView(SaixiangxinxiEntity saixiangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, saixiangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
