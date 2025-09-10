public class Livro {
    
    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;
    
    public Livro(int identificacao, String titulo){
        
    }
    
    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }    
    
    public int getIdentificacao() {
        return identificacao;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public boolean getSituacao() {
        return situacao;
    }
    
    public void emprestar() {
        situacao = true;
    }
    
    public double devolver(int qtdDiasAtraso) {
        situacao = false;
        return valMultaDiaria * qtdDiasAtraso;
    }
}
