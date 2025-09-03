import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        double medRaio;
        int opcao;

        //Instanciação da classe scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a medida do raio do círculo: ");
        medRaio = entrada.nextDouble();

        //Instanciação de um objeto da classe circulo
        Circulo circulo = new Circulo();
        circulo.setRaio(medRaio);

        do {
            System.out.println("\n\n1 - Consultar medida do raio");
            System.out.println("2 - Consultar medida do perímetro");
            System.out.println("3 - Consultar medida da área");
            System.out.println("4 - Encerrar");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Medida do raio: " + circulo.getRaio());
                    break;
                case 2:
                        System.out.printf("Medida do perímetro: " + circulo.calcPerimetro());
                        break;
                case 3:
                    System.out.printf("Medida da area: " + circulo.calcArea());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Insira um opção válida");
            }

        } while(opcao != 4);
    }
    
}
