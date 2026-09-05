package com.api.campusfinder.Service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.campusfinder.DTO.CampusDTO;
import com.api.campusfinder.Entity.CampusEntity;
import com.api.campusfinder.Repository.CampusRepository;
import com.api.campusfinder.Tools.ArvoreBinaria.Arvore;
import java.util.List;

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



    //Teste para ver se os alunos sao listados
    @Transactional 
    public CampusEntity buscaId(Long id) throws Exception{
        CampusEntity campus = repository.findByIdWithAlunos(id)
        .orElseThrow(() -> new RuntimeException("Campus not found"));
        campus.getAluno().size();
        return campus;
    }
    
    @Transactional
    public CampusEntity buscaPorNome(String nome) throws Exception{
        if(nome == null) throw new IllegalArgumentException("Nome não pode ser nulo");
        List<CampusEntity> todos = repository.findAllWithAlunos();
        Arvore arvore = Arvore.buildFrom(todos);
        List<CampusEntity> encontrados = arvore.search(nome);
        if(encontrados == null || encontrados.isEmpty()) throw new RuntimeException("Campus not found");
        CampusEntity campus = encontrados.get(0);
        if(campus.getAluno() != null) campus.getAluno().size();
        return campus;
    }
    
    
}
