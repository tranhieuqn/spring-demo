package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StaticData;
import com.example.demo.model.enums.StaticDataType;

import java.util.List;
import java.util.Optional;

public interface StaticDataRepository extends JpaRepository<StaticData, Long> {
    Optional<StaticData> findByIdAndStaticDataType(Long id, StaticDataType staticDataType);
    List<StaticData> findAllByStaticDataType(StaticDataType staticDataType);
    List<StaticData> findAllByParentIdAndStaticDataType(Long id, StaticDataType staticDataType);
}
