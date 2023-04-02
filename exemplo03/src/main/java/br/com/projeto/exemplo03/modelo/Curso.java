package br.com.projeto.exemplo03.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cursos")
@Getter
@Setter
public class Curso {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long codigo;
    private String curso;

    @ManyToMany(mappedBy = "cursos")//quando utilizado junto com o many to manym o spring entende q junto com o aluno n ira gerar nova tabela, por ja ter uma nova tabela pré definida para gerar em aluno
    private List<Aluno> alunos = new ArrayList<>();

}
