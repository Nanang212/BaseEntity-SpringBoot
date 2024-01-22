package com.example.BelajarBaseEntity.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.BelajarBaseEntity.models.Region;
import com.example.BelajarBaseEntity.repositories.base.BaseRepository;

@Repository
public interface RegionRepository extends BaseRepository<Region, Integer> {
    public Optional<Region> findByName(String name);
}
