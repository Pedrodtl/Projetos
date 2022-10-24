package dever_contas_a_pagar;

public class ContaAPagar {
    Fornecedor fornecedor = new Fornecedor();
    private String descricao;
    private Double valor;

    public ContaAPagar(Fornecedor fornecedor, String comprasDOmês, double v, String s) {

    }

    public ContaAPagar() {

    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    private String dataVencimento;

    public void pagar(){
        System.out.println(descricao + " " + valor + " " + dataVencimento
        +  " "  + fornecedor);

    }

    }

