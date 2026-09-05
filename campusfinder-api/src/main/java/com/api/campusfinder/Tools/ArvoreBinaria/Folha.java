package com.api.campusfinder.Tools.ArvoreBinaria;

import java.util.ArrayList;
import java.util.List;

import com.api.campusfinder.Entity.CampusEntity;

public class Folha {
    private final List<CampusEntity> campuses;

    public Folha(CampusEntity campus){
        this.campuses = new ArrayList<>();
        if (campus != null) this.campuses.add(campus);
    }

    public String getKeyName(){
        return campuses.isEmpty() ? null : campuses.get(0).getCampusNome();
    }

    public void add(CampusEntity campus){
        if (campus != null) this.campuses.add(campus);
    }

    public List<CampusEntity> getCampuses(){
        return campuses;
    }

}
