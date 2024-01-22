package com.example.BelajarBaseEntity.repositories;

import org.springframework.stereotype.Repository;

import com.example.BelajarBaseEntity.models.Country;
import com.example.BelajarBaseEntity.repositories.base.BaseRepository;

@Repository
public interface CountryRepository extends BaseRepository<Country, Integer> {
    public boolean existsByName(String name);
}
