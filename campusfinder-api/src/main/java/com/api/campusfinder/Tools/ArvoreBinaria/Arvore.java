package com.api.campusfinder.Tools.ArvoreBinaria;

import java.util.List;

import com.api.campusfinder.Entity.CampusEntity;

public class Arvore {
    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore(){
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }

    public boolean isEmpty(){
        return this.folha == null;
    }

    public void insert(CampusEntity campus){
        if(campus == null || campus.getCampusNome() == null) return;
        if(isEmpty()){
            this.folha = new Folha(campus);
            return;
        }
        String key = folha.getKeyName();
        if(key == null) return;
        int cmp = campus.getCampusNome().compareTo(key);
        if(cmp == 0){
            folha.add(campus);
        } else if(cmp < 0){
            if(this.esquerda == null) this.esquerda = new Arvore();
            this.esquerda.insert(campus);
        } else {
            if(this.direita == null) this.direita = new Arvore();
            this.direita.insert(campus);
        }
    }

    public List<CampusEntity> search(String nome){
        if(nome == null || isEmpty()) return null;
        String key = folha.getKeyName();
        if(key == null) return null;
        int cmp = nome.compareTo(key);
        if(cmp == 0) return folha.getCampuses();
        if(cmp < 0) return (esquerda == null) ? null : esquerda.search(nome);
        return (direita == null) ? null : direita.search(nome);
    }

    public static Arvore buildFrom(List<CampusEntity> list){
        Arvore root = new Arvore();
        if(list == null) return root;
        for(CampusEntity c : list) root.insert(c);
        return root;
    }

}
