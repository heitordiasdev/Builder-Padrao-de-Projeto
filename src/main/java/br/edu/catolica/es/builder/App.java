package br.edu.catolica.es.builder;

public class App {
    public static void main(String[] args) {

        var pessoa1 = new PessoaBuilder("Jose")
                .altura(1.70f)
                .cpf("9999999")
                .create();

        var pessoa2 = new PessoaBuilder("Hector")
                .rg("123123 SSPPB")
                .peso(75)
                .create();

        System.out.println("Pessoa 1:" +pessoa1);
        System.out.println("Pessoa 2:" +pessoa2);
    }
}
