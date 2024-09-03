import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int input;
        ArrayList<Pessoa> industria = new ArrayList<Pessoa>();
        do{

            Scanner scan = new Scanner(System.in);
            System.out.printf(" 1. incluir fonecedor %n " +
                    "2. Incluir um operario %n " +
                    "3. Incluir um vendendor %n " +
                    "4. listar fucionarios %n " +
                    "5. listar fornecedores %n " +
                    "6. Sair %n" +
                    "digite uma opção: ");
            input = scan.nextInt();
            switch (input){
                case 1:
                    criaFornecedor(industria);
                    break;
                case 2:
                    criaOperario(industria);
                    break;
                case 3:
                    criaVendedor(industria);
                    break;
                case 4:
                    folhaPag(industria);
                    break;
                case 5:
                    contasaPagar(industria);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("opção invalida");
                    break;

            }

        }while(input != 6);


    }
    public static void criaOperario(ArrayList<Pessoa> industria){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o nome do seu empregado: ");
        String nome = scan.nextLine();
        System.out.println("digite o telefone: ");
        String telefone = scan.nextLine();
        System.out.println("digite o salario base: ");
        double salarioBase = scan.nextDouble();
        System.out.println("digite o codigo: ");
        float cod = scan.nextFloat();
        System.out.println("digite o imposto: ");
        float imposto = scan.nextFloat();
        System.out.println("digite o valor de producao: ");
        double valorProd = scan.nextDouble();
        System.out.println("digite o valor de comissao: ");
        double comissao = scan.nextDouble();
        Operario operario = new Operario(nome,telefone,cod,salarioBase,imposto,valorProd,comissao);
        industria.add(operario);
    }

    public static void criaVendedor(ArrayList<Pessoa> industria){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o nome do seu empregado: ");
        String nome = scan.nextLine();
        System.out.println("digite o telefone: ");
        String telefone = scan.nextLine();
        System.out.println("digite o salario base: ");
        double salarioBase = scan.nextDouble();
        System.out.println("digite o codigo: ");
        float cod = scan.nextFloat();
        System.out.println("digite o imposto: ");
        float imposto = scan.nextFloat();
        System.out.println("digite o valor de producao: ");
        double valorVenda = scan.nextDouble();
        System.out.println("digite o valor de comissao: ");
        double comissao = scan.nextDouble();
        Vendedor vendedor = new Vendedor(nome,telefone,cod,salarioBase,imposto,valorVenda,comissao);
        industria.add(vendedor);
    }

    public static void criaFornecedor(ArrayList<Pessoa> industria){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o nome do seu fornecedor: ");
        String nome = scan.nextLine();
        System.out.println("digite o telefone: ");
        String telefone = scan.nextLine();
        System.out.println("digite o valor de credito: ");
        double valorCredito = scan.nextDouble();
        System.out.println("digite o valor da divida: ");
        double valorDiv = scan.nextDouble();
        Fornecedor fonecedor = new Fornecedor(nome,telefone,valorCredito, valorDiv);
        industria.add(fonecedor);
    }

    public static void folhaPag(ArrayList<Pessoa> industria){
        for(int i = 0; i < industria.size(); i++){
            Pessoa aux = industria.get(i);
            if(aux instanceof Operario){
                Operario empregado = (Operario) aux;
                System.out.println(empregado.toString());
            }else if (aux instanceof Vendedor){
                Vendedor empregado = (Vendedor) aux;
                System.out.println(empregado.toString());
            }
        }
    }
    public static void contasaPagar(ArrayList<Pessoa> industria){
        for(int i = 0; i < industria.size(); i++){
            Pessoa aux = industria.get(i);
            if(aux instanceof Fornecedor){
                Fornecedor fornecedor = (Fornecedor) aux;
                System.out.println(fornecedor);
            }
        }
    }
}