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


import com.dao.JiangxiangtongjiDao;
import com.entity.JiangxiangtongjiEntity;
import com.service.JiangxiangtongjiService;
import com.entity.vo.JiangxiangtongjiVO;
import com.entity.view.JiangxiangtongjiView;

@Service("jiangxiangtongjiService")
public class JiangxiangtongjiServiceImpl extends ServiceImpl<JiangxiangtongjiDao, JiangxiangtongjiEntity> implements JiangxiangtongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiangxiangtongjiEntity> page = this.selectPage(
                new Query<JiangxiangtongjiEntity>(params).getPage(),
                new EntityWrapper<JiangxiangtongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiangxiangtongjiEntity> wrapper) {
		  Page<JiangxiangtongjiView> page =new Query<JiangxiangtongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiangxiangtongjiVO> selectListVO(Wrapper<JiangxiangtongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiangxiangtongjiVO selectVO(Wrapper<JiangxiangtongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiangxiangtongjiView> selectListView(Wrapper<JiangxiangtongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiangxiangtongjiView selectView(Wrapper<JiangxiangtongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
