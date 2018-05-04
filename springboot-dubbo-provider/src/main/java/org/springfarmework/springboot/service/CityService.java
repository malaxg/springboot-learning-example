package org.springfarmework.springboot.service;

import org.springfarmework.springboot.domain.City;

/**
 * Created by admin on 2018/5/3.
 */
public interface CityService {
	public City findCityByName(String cityName);
}
