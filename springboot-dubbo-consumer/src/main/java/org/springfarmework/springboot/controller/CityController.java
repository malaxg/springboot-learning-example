package org.springfarmework.springboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springfarmework.springboot.domain.City;
import org.springfarmework.springboot.service.CityService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/5/3.
 */
@Component @RestController public class CityController {

	@Reference CityService cityService;

	@RequestMapping("/city/{sss}") public City getCity(@PathVariable String sss) {
		City cityByName = cityService.findCityByName(sss);
		return cityByName;
	}
}
