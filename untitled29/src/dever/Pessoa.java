package dever;

public class Pessoa {
    private  String nome;
    private  int idade;

    public  void  exibir(String nome, int idade){
        System.out.println("Seu nome é: " + nome + " e sua idade é: " + idade);
        this.nome = nome;
        this.idade = idade;
    }

    public String nomeobtido(){
        return nome;
    }
    public int idadeobtida(){
        return idade;
    }
}

