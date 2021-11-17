package com.yz.yelp.mapper;

import com.yz.yelp.dataObject.userDO;

public interface userDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userDO record);

    int insertSelective(userDO record);

    userDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userDO record);

    int updateByPrimaryKey(userDO record);
}