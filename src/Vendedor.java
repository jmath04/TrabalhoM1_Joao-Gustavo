public class Vendedor extends Empregado{
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String telefone, float cod, double salarioBase, float imposto, double valorVendas, double comissao) {
        super(nome,telefone,cod,salarioBase,imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorProd(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcComicao(){
        return valorVendas * (comissao/100);
    }
    public double calculaSalario(){
        return (getSalarioBase() - getSalarioBase()*(getImposto()/100)) + calcComicao();
    }

    @Override
    public String toString() {
        return String.format("%sValor de vendas: %.2f%nComissão: %.2f%%%nValor da comissão: %.2f%nSalário: %.2f%n",
                super.toString(), getValorVendas(), getComissao(), calcComicao(), calculaSalario());
    }


}
