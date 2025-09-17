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
                    String msgSituacao = livro.getSituacao() ? "Disponível" : "Emprestado";
                    System.out.printf("Identificação: %s | Título: %s | Situação: %s",
                                       livro.getIdentificacao(), livro.getTitulo(), msgSituacao);
                    break;
                case 2:
                    if(livro.getSituacao()){
                        livro.emprestar();
                    } else {
                        System.out.println("O livro está emprestado");
                        }
                    break;
                case 3:
                    if(!livro.getSituacao()){
                        System.out.println("Quantos dias de atraso possui o livro: ");
                        qtdDiasAtraso = sc.nextInt();
                        if(qtdDiasAtraso > 0){
                            System.out.println("Qual o valor da multa diária?");
                            livro.setValMultaDiaria(sc.nextDouble());
                        }
                        double multaTotal = livro.devolver(qtdDiasAtraso);
                    
                        System.out.println("Operação de devolução realizada com sucesso");
                    
                        if (multaTotal > 0){
                            System.out.printf("Valor de multa a ser pago: %.2f", multaTotal);
                        }
                    }
                    else {
                        System.out.println("O livro não se encotra emprestado!");
                    }

                    break;
            }
        } while(opcao != 4);   
    }
}
