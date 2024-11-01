package com.dao;

import com.entity.JiangxiangtongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiangxiangtongjiVO;
import com.entity.view.JiangxiangtongjiView;


/**
 * 奖项统计
 * 
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
public interface JiangxiangtongjiDao extends BaseMapper<JiangxiangtongjiEntity> {
	
	List<JiangxiangtongjiVO> selectListVO(@Param("ew") Wrapper<JiangxiangtongjiEntity> wrapper);
	
	JiangxiangtongjiVO selectVO(@Param("ew") Wrapper<JiangxiangtongjiEntity> wrapper);
	
	List<JiangxiangtongjiView> selectListView(@Param("ew") Wrapper<JiangxiangtongjiEntity> wrapper);

	List<JiangxiangtongjiView> selectListView(Pagination page,@Param("ew") Wrapper<JiangxiangtongjiEntity> wrapper);
	
	JiangxiangtongjiView selectView(@Param("ew") Wrapper<JiangxiangtongjiEntity> wrapper);
	
}
