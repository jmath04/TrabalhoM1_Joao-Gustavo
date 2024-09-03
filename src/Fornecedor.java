public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDiv;

    public Fornecedor(String nome, String telefone, double valorCredito,double valorDiv){
        super(nome,telefone);
        this.valorCredito = valorCredito;
        this.valorDiv = valorDiv;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDiv(double valorDiv) {
        this.valorDiv = valorDiv;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public double getValorDiv() {
        return valorDiv;
    }

    public double obterSaldo(){
        return valorDiv - valorCredito;
    }

    public String toString(){
        return String.format("%s Valor de credito: %.2f%nValor divida: %.2f%n", super.toString(), getValorCredito(), getValorDiv());
    }

}
