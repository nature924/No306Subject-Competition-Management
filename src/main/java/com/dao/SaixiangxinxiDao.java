package com.dao;

import com.entity.SaixiangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaixiangxinxiVO;
import com.entity.view.SaixiangxinxiView;


/**
 * 赛项信息
 * 
 * @author 
 * @email 
 * @date 2021-03-26 17:35:20
 */
public interface SaixiangxinxiDao extends BaseMapper<SaixiangxinxiEntity> {
	
	List<SaixiangxinxiVO> selectListVO(@Param("ew") Wrapper<SaixiangxinxiEntity> wrapper);
	
	SaixiangxinxiVO selectVO(@Param("ew") Wrapper<SaixiangxinxiEntity> wrapper);
	
	List<SaixiangxinxiView> selectListView(@Param("ew") Wrapper<SaixiangxinxiEntity> wrapper);

	List<SaixiangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<SaixiangxinxiEntity> wrapper);
	
	SaixiangxinxiView selectView(@Param("ew") Wrapper<SaixiangxinxiEntity> wrapper);
	
}
