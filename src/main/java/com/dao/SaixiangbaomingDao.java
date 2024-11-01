package com.dao;

import com.entity.SaixiangbaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaixiangbaomingVO;
import com.entity.view.SaixiangbaomingView;


/**
 * 赛项报名
 * 
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
public interface SaixiangbaomingDao extends BaseMapper<SaixiangbaomingEntity> {
	
	List<SaixiangbaomingVO> selectListVO(@Param("ew") Wrapper<SaixiangbaomingEntity> wrapper);
	
	SaixiangbaomingVO selectVO(@Param("ew") Wrapper<SaixiangbaomingEntity> wrapper);
	
	List<SaixiangbaomingView> selectListView(@Param("ew") Wrapper<SaixiangbaomingEntity> wrapper);

	List<SaixiangbaomingView> selectListView(Pagination page,@Param("ew") Wrapper<SaixiangbaomingEntity> wrapper);
	
	SaixiangbaomingView selectView(@Param("ew") Wrapper<SaixiangbaomingEntity> wrapper);
	
}
