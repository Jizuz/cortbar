package com.jizuz.cortbar.dal;

import com.jizuz.cortbar.dal.model.TsUserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TsUserMapper {

    List<TsUserDO> selectAllTsUsers();

}
