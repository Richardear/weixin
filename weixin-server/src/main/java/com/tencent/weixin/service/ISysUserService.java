package com.tencent.weixin.service;

import com.tencent.weixin.domain.SysUser;

import java.util.Map;

public interface ISysUserService {
        SysUser getUserById(String userId);

        Map<String, Object> findByUname(String uname);
    }
