package com.itheima.service;

import com.itheima.domain.Items;

public interface ItemsService {


    /**
     * 根据id查询用户信息
     */
    Items findItemsById(int id);
}
