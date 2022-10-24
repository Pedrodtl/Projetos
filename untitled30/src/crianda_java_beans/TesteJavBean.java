package crianda_java_beans;

public class TesteJavBean {
    public static void main(String[] args) {
        PessoaBean pessoa = new PessoaBean();
        pessoa.setNome("Maria");
        pessoa.setIdade(27);

        System.out.println(pessoa.getNome() + "tem " + pessoa.getIdade() + " anos");
    }
}
