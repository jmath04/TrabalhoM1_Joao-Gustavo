public class Operario extends Empregado {
        private double valorProd;
        private double comissao;

    public Operario(String nome, String telefone, float cod, double salarioBase, float imposto, double valorProd, double comissao) {
        super(nome,telefone,cod,salarioBase,imposto);
        this.valorProd = valorProd;
        this.comissao = comissao;
    }

    public double getValorProd() {
        return valorProd;
    }

    public void setValorProd(double valorProd) {
        this.valorProd = valorProd;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcComicao(){
        return valorProd * (comissao/100);
    }
    public double calculaSalario(){
        return (getSalarioBase() - getSalarioBase()*(getImposto()/100)) + calcComicao();
    }

    @Override
    public String toString() {
        return String.format("%sValor de produção: %.2f%nComissão: %.2f%%%nValor da comissão: %.2f%nSalário: %.2f%n",
                super.toString(), getValorProd(), getComissao(), calcComicao(), calculaSalario());
    }

}
