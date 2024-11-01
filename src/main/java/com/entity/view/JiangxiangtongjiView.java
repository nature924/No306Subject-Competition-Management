package com.entity.view;

import com.entity.JiangxiangtongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 奖项统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
@TableName("jiangxiangtongji")
public class JiangxiangtongjiView  extends JiangxiangtongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiangxiangtongjiView(){
	}
 
 	public JiangxiangtongjiView(JiangxiangtongjiEntity jiangxiangtongjiEntity){
 	try {
			BeanUtils.copyProperties(this, jiangxiangtongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
