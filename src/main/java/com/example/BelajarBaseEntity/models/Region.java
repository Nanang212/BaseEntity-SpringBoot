package com.example.BelajarBaseEntity.models;

import java.util.List;

import com.example.BelajarBaseEntity.models.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_region")
public class Region extends BaseEntity {
    private String name;

    @OneToMany(mappedBy = "region")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Country> countries;
}
