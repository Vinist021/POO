import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {

        int opcao;
        int numRA;
        double ntPrv1;
        double ntPrv2;
        double ntTrab1;
        double ntTrab2;

        //Instanciação da classe scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o RA do aluno: ");
        numRA = entrada.nextInt();

        System.out.println("Insira a nota da P1: ");
        ntPrv1 = entrada.nextDouble();

        System.out.println("Insira a nota da P2: ");
        ntPrv2 = entrada.nextDouble();

        System.out.println("Insira a nota do trabalho 1: ");
        ntTrab1 = entrada.nextDouble();

        System.out.println("Insira a nota do trabalho 2: ");
        ntTrab2 = entrada.nextDouble();

        //Instanciação de um objeto da classe Aluno
        Aluno aluno = new Aluno();

        aluno.setRA(numRA);
        aluno.setNtPrv1(ntPrv1);
        aluno.setNtPrv2(ntPrv2);
        aluno.setNtTrab1(ntTrab1);
        aluno.setNtTrab2(ntTrab2);

        do {
            System.out.println("\n\n1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("P1 - %.2f | P2 - %.2f | T1 - %.2f | T2 - %.2f",
                                      aluno.getNtPrv1(), aluno.getNtPrv2(), aluno.getNtTrab1(), aluno.getNtTrab2());
                    break;
                case 2:
                    System.out.printf("Média dos trabalhos - %.2f | Média das Provas - %.2f",
                                      aluno.calcMediaTrab(), aluno.calcMediaProva());
                    break;
                case 3:
                    System.out.printf("Média Final: %.2f", aluno.calcMediaFinal());
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 4);
    }
}


