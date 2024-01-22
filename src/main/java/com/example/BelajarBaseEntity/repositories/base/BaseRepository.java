package com.example.BelajarBaseEntity.repositories.base;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BelajarBaseEntity.models.base.BaseEntity;

@Primary
@Repository
public interface BaseRepository <E extends BaseEntity, T> extends JpaRepository<E, T> {

}
