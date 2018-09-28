package com.tencent.weixin.service.impl;
  
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tencent.weixin.Dao.ISysUserDao;
import com.tencent.weixin.domain.SysUser;
import com.tencent.weixin.service.ISysUserService;

import java.util.Map;


@Service("sysUserService")
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private ISysUserDao userDao;

    public SysUser getUserById(String id) {
        return userDao.selectByPrimaryKey(id);
    }
    public Map<String, Object> findByUname(String uname){
        return userDao.findByUname(uname);
    }
}  