package br.edu.catolica.es.builder;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Pessoa {

    private String nome, cpf, rg;
    private int idade;
    private float altura, peso;

}
