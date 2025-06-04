package com.pedro.first_project_spring.Missoes;

import com.pedro.first_project_spring.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tb_missao")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String rank;

    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

    public MissoesModel() {}

    public MissoesModel(String nome, String rank) {
        this.nome = nome;
        this.rank = rank;
    }
}
