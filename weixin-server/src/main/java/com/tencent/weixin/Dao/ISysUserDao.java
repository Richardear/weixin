package com.tencent.weixin.Dao;

import com.tencent.weixin.domain.SysUser;

import java.util.Map;

public interface ISysUserDao {
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    Map<String, Object> findByUname(String uname);
}