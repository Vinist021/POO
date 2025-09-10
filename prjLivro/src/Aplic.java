/**
 * @author Vinicius Teixeira
 */

import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        int id;
        String titulo;
        int opcao;
        int qtdDiasAtraso;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a identificação do livro: ");
        id = sc.nextInt();
        
        System.out.println("Digite o título do livro: ");
        titulo = sc.next();
        
        Livro livro = new Livro(id, titulo);
       
        do{
            System.out.println("\n\n1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("\n\t\tDigite a opção: ");
            opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println(livro.getTitulo());
                    break;
                case 2:
                    livro.emprestar();
                    break;
                case 3:
                    System.out.println("Quantos dias de atraso possui o livro: ");
                    qtdDiasAtraso = sc.nextInt();
                    livro.devolver(qtdDiasAtraso);
                    break;
            }
        } while(opcao != 4);   
    }
}
