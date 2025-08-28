
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
       double medAlt, medBase;
       int opcao;
        
        //Instanciação da classe scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a medida da altura do triângulo: ");
        medAlt = entrada.nextDouble();
        
        System.out.println("Digite a medida da base do triângulo: ");
        medBase = entrada.nextDouble();
        
        //Instanciação de um objeto da classe retângulo
        Retangulo objRet = new Retangulo();
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do {
            System.out.println("\n\n1 - Consultar medida da área");
            System.out.println("2 - Consultar medida do perímetro");
            System.out.println("3 - Consultar medida da diagonal");
            System.out.println("4 - Encerrar");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1) {
                System.out.printf("Medida da área: " + objRet.calcArea());
            } else if (opcao == 2) {
                System.out.printf("Medida do perímetro: " + objRet.calcPerimetro());
            } else if (opcao == 3) {
                System.out.printf("Medida da diagonal: " + objRet.calcDiagonal());
            } else {
                System.exit(0);
            }
            
        } while(opcao < 4);
    }
}
