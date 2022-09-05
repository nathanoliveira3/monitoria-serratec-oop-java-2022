package vendedor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fixo fixo = new Fixo("Jo�o", "123456789", 1000.0, 0.10);
        Fixo fixo2 = new Fixo("Paulo", "123456778", 2000.0, 0.15);
        FreeLancer freeLancer = new FreeLancer("Maria", "789456123", 15, 90.0);
        
        Scanner scan = new Scanner(System.in);
        
        String condicao = "N";
        while(condicao.equalsIgnoreCase("N")) {        
        
            System.out.println("Vendedores: \n"
                    + "1 - Jo�o \n"
                    + "2 - Paulo \n");
            
            System.out.println("Escolha o vendedor:");
            int opcao = scan.nextInt();
            
            System.out.println("Digite o valor da venda:");
            double venda =  scan.nextDouble();
            
            if(opcao == 1) {
                fixo.calcularSalario(venda);
            }else if(opcao == 2) {
                fixo2.calcularSalario(venda);
            }
            
            System.out.println("Deseja encerrar o programa: (S/N)");
            scan.nextLine();
            String encerrar = scan.nextLine();
            
            if(encerrar.equalsIgnoreCase("S")) {
                condicao = encerrar;
            }          
        }  
        
        System.out.println("Nome: " + fixo.getNome());
        System.out.println("Sal�rio bruto: " + fixo.getSalarioBruto());
        
        System.out.println("Nome: " + fixo2.getNome());
        System.out.println("Sal�rio bruto: " + fixo2.getSalarioBruto());
            
        scan.close();
    }
}
