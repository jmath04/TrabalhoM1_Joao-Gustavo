public abstract class Empregado extends Pessoa{
    private float cod;
    private double salarioBase;
    private float imposto;

    public Empregado(String nome, String telefone, float cod, double salarioBase, float imposto){
        super(nome,telefone);
        this.cod = cod;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public void setCod(float cod) {
        this.cod = cod;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public float getCod() {
        return cod;
    }

    public float getImposto() {
        return imposto;
    }

    public abstract double calculaSalario();
    @Override
    public String toString() {
        return String.format("%sSalário base: %.2f%nImposto: %.2f%%%nCódigo: %.0f%n", super.toString(), getSalarioBase(), getImposto(), getCod());
    }

}
