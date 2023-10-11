package br.edu.catolica.es.builder;

public class PessoaBuilder implements Builder<PessoaBuilder, Pessoa>{

    private final String nome;
    private int idade;
    private String cpf, rg;
    private float peso, altura;


    public PessoaBuilder(String nome) {
        this.nome = nome;
    }

    @Override
    public PessoaBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    @Override
    public PessoaBuilder rg(String rg) {
        this.rg = rg;
        return this;
    }

    @Override
    public PessoaBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    @Override
    public PessoaBuilder altura(float altura) {
        this.altura = altura;
        return this;
    }

    @Override
    public PessoaBuilder peso(float peso) {
        this.peso = peso;
        return this;
    }

    @Override
    public Pessoa create() {
        var pessoa = new Pessoa();
        pessoa.setRg(this.rg);
        pessoa.setCpf(this.cpf);
        pessoa.setPeso(this.peso);
        pessoa.setAltura(this.altura);
        pessoa.setNome(this.nome);

        return pessoa;
    }
}
