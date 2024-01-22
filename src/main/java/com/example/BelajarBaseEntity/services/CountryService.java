package com.example.BelajarBaseEntity.services;

import org.springframework.stereotype.Service;

import com.example.BelajarBaseEntity.models.Country;
import com.example.BelajarBaseEntity.services.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CountryService extends BaseService<Country, Integer> {

}
