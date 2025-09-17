public class Livro {
    
    private int identificacao;
    private String titulo;
    private boolean situacao; // disponivel = true | emprestado = false
    private double valMultaDiaria;
    
    public Livro(int identificacao, String titulo){
        this.identificacao = identificacao;
        this.titulo = titulo;
        this.situacao = true;
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
        situacao = false;
    }
    
    public double devolver(int qtdDiasAtraso) {
        situacao = true;
        return valMultaDiaria * qtdDiasAtraso;
    }
}
