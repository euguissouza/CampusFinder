package com.api.campusfinder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.campusfinder.Entity.AlunoEntity;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Integer> {

}
