package com.jizuz.cortbar.service.impl;

import com.jizuz.cortbar.dal.TsUserMapper;
import com.jizuz.cortbar.model.TsUserVO;
import com.jizuz.cortbar.service.ITsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("tsUserService")
public class TsUserServiceImpl implements ITsUserService {

    @Autowired
    private TsUserMapper tsUserMapper;

    @Override
    public List<TsUserVO> selectAllTsUsers() {
        List<TsUserVO> result = tsUserMapper.selectAllTsUsers().stream().map(d -> {
            TsUserVO vo = new TsUserVO();
            vo.setId(d.getId());
            vo.setuId(d.getuId());
            vo.setuName(d.getuName());
            vo.setComment(d.getComment());
            return vo;
        }).collect(Collectors.toList());

        return result;
    }
}
