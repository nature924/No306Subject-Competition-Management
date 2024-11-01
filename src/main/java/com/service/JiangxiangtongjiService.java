package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiangxiangtongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiangxiangtongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangxiangtongjiView;


/**
 * 奖项统计
 *
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
public interface JiangxiangtongjiService extends IService<JiangxiangtongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiangxiangtongjiVO> selectListVO(Wrapper<JiangxiangtongjiEntity> wrapper);
   	
   	JiangxiangtongjiVO selectVO(@Param("ew") Wrapper<JiangxiangtongjiEntity> wrapper);
   	
   	List<JiangxiangtongjiView> selectListView(Wrapper<JiangxiangtongjiEntity> wrapper);
   	
   	JiangxiangtongjiView selectView(@Param("ew") Wrapper<JiangxiangtongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiangxiangtongjiEntity> wrapper);
   	
}

