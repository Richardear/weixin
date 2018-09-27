package com.tencent.service.impl;
  
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tencent.Dao.IUserDao;
import com.tencent.domain.User;
import com.tencent.service.IUserService;  
  
 
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
	 @Resource  
    private IUserDao userDao;  
    public User getUserById(String id) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(id);  
    }  
  
}  