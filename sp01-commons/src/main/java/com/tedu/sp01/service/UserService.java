package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//�����û�id��ȡ�û���Ϣ
	User getUser(Integer id);
	//��ȡ�û�id�����û�����
	void addScore(Integer id, Integer score);
}