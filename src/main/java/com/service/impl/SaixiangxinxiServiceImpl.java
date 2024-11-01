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


import com.dao.SaixiangxinxiDao;
import com.entity.SaixiangxinxiEntity;
import com.service.SaixiangxinxiService;
import com.entity.vo.SaixiangxinxiVO;
import com.entity.view.SaixiangxinxiView;

@Service("saixiangxinxiService")
public class SaixiangxinxiServiceImpl extends ServiceImpl<SaixiangxinxiDao, SaixiangxinxiEntity> implements SaixiangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaixiangxinxiEntity> page = this.selectPage(
                new Query<SaixiangxinxiEntity>(params).getPage(),
                new EntityWrapper<SaixiangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaixiangxinxiEntity> wrapper) {
		  Page<SaixiangxinxiView> page =new Query<SaixiangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaixiangxinxiVO> selectListVO(Wrapper<SaixiangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaixiangxinxiVO selectVO(Wrapper<SaixiangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaixiangxinxiView> selectListView(Wrapper<SaixiangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaixiangxinxiView selectView(Wrapper<SaixiangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
