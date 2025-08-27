public class Aplic {
    public static void main(String[] args) {
        //Definição do ponteiro
        Retangulo objRet;
        
        //Instanciação(alocação) de um objeto da classe Retangulo
        objRet = new Retangulo();
        
        //Passagem de mensagens
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
                
        System.out.println("Medida da altura do retângulo: " + objRet.getAltura());
        System.out.println("Medida da base do retângulo: " + objRet.getBase());
        System.out.println("Medida da área: " + objRet.calcArea());
        System.out.println("Medida do perímetro: " + objRet.calcPerimetro());
    }
    
}
