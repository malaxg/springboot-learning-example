package org.springfarmework.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springfarmework.springboot.domain.City;
import org.springfarmework.springboot.service.CityService;

// 注册为  服务
@Service public class CityServiceImpl implements CityService {

	public City findCityByName(String cityName) {
		return new City(1L, 2L, "温岭", "是我的故乡");
	}
}