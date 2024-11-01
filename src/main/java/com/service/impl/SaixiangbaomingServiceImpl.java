package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.SaixiangbaomingDao;
import com.entity.SaixiangbaomingEntity;
import com.service.SaixiangbaomingService;
import com.entity.vo.SaixiangbaomingVO;
import com.entity.view.SaixiangbaomingView;

@Service("saixiangbaomingService")
public class SaixiangbaomingServiceImpl extends ServiceImpl<SaixiangbaomingDao, SaixiangbaomingEntity> implements SaixiangbaomingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaixiangbaomingEntity> page = this.selectPage(
                new Query<SaixiangbaomingEntity>(params).getPage(),
                new EntityWrapper<SaixiangbaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaixiangbaomingEntity> wrapper) {
		  Page<SaixiangbaomingView> page =new Query<SaixiangbaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaixiangbaomingVO> selectListVO(Wrapper<SaixiangbaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaixiangbaomingVO selectVO(Wrapper<SaixiangbaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaixiangbaomingView> selectListView(Wrapper<SaixiangbaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaixiangbaomingView selectView(Wrapper<SaixiangbaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
