package com.api.campusfinder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.campusfinder.Entity.CampusEntity;

public interface CampusRepository extends JpaRepository<CampusEntity, Long>{

}
