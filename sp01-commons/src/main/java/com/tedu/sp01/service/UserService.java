package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//根据用户id获取用户信息
	User getUser(Integer id);
	//获取用户id增加用户积分
	void addScore(Integer id, Integer score);
}