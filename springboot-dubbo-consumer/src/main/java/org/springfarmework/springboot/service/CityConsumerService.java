package org.springfarmework.springboot.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springfarmework.springboot.domain.City;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by admin on 2018/5/3.
 */
@Component
public class CityConsumerService {
	@Reference CityService cityDubboService;

	public void printCity() {
		String cityName = "温岭";
		City city = cityDubboService.findCityByName(cityName);
		System.out.println(city.toString());
	}
}
