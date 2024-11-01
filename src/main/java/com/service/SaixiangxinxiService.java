package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaixiangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaixiangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaixiangxinxiView;


/**
 * 赛项信息
 *
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
public interface SaixiangxinxiService extends IService<SaixiangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaixiangxinxiVO> selectListVO(Wrapper<SaixiangxinxiEntity> wrapper);
   	
   	SaixiangxinxiVO selectVO(@Param("ew") Wrapper<SaixiangxinxiEntity> wrapper);
   	
   	List<SaixiangxinxiView> selectListView(Wrapper<SaixiangxinxiEntity> wrapper);
   	
   	SaixiangxinxiView selectView(@Param("ew") Wrapper<SaixiangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaixiangxinxiEntity> wrapper);
   	
}

