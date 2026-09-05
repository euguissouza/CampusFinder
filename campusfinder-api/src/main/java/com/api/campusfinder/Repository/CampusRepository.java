package com.api.campusfinder.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.api.campusfinder.Entity.CampusEntity;

public interface CampusRepository extends JpaRepository<CampusEntity, Long>{
    @Query("SELECT c FROM CampusEntity c LEFT JOIN FETCH c.aluno WHERE c.id = :id")
    Optional<CampusEntity> findByIdWithAlunos(@Param("id") Long id);

    @Query("SELECT DISTINCT c FROM CampusEntity c LEFT JOIN FETCH c.aluno")
    List<CampusEntity> findAllWithAlunos();
}
    