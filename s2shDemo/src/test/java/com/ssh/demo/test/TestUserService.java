package com.ssh.demo.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ssh.demo.entity.UserInfo;
import com.ssh.demo.service.UserInfoService;

/**
 * 创建时间：2015-2-13 下午3:31:07
 * 
 * @author andy
 * @version 2.2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
public class TestUserService {

	private static final Logger LOGGER = Logger
			.getLogger(TestUserService.class);

	@Autowired
	private UserInfoService userInfoService;

	@Test
	public void save() {
		UserInfo userInfo = new UserInfo();
		userInfo.setName("zty");
		userInfo.setAge(23);
		userInfo.setTelephone("132122213331");
		Integer id = userInfoService.save(userInfo);
		JSON.toJSONString(id);
	}

}