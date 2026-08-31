package com.api.campusfinder.Service;

import org.springframework.stereotype.Service;

import com.api.campusfinder.DTO.CampusDTO;
import com.api.campusfinder.Entity.CampusEntity;
import com.api.campusfinder.Repository.CampusRepository;

@Service
public class CampusService {

    private CampusRepository repository;

    public CampusService(CampusRepository repository) {
        this.repository = repository;
    }

    public void CadastraCampus(CampusDTO dto){
        CampusEntity campus = new CampusEntity();
        campus.setCampusNome(dto.getCampusNome());
        campus.setAluno(dto.getAluno());
        repository.save(campus);
    }
}
