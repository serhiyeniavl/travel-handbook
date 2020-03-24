package com.uladzislau.travel_handbook.service.city;

import com.uladzislau.travel_handbook.dto.CityDto;
import com.uladzislau.travel_handbook.model.City;
import com.uladzislau.travel_handbook.service.Service;

public interface CityService extends Service<City> {

    CityDto readById(long id);
}
