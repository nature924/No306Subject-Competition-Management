package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaixiangbaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaixiangbaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaixiangbaomingView;


/**
 * 赛项报名
 *
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
public interface SaixiangbaomingService extends IService<SaixiangbaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaixiangbaomingVO> selectListVO(Wrapper<SaixiangbaomingEntity> wrapper);
   	
   	SaixiangbaomingVO selectVO(@Param("ew") Wrapper<SaixiangbaomingEntity> wrapper);
   	
   	List<SaixiangbaomingView> selectListView(Wrapper<SaixiangbaomingEntity> wrapper);
   	
   	SaixiangbaomingView selectView(@Param("ew") Wrapper<SaixiangbaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaixiangbaomingEntity> wrapper);
   	
}

