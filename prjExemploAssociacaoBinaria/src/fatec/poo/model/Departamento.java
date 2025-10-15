package fatec.poo.model;
/**
 *
 * @author 0030482523032
 */


public class Departamento {
    private String sigla;
    private String nome;
   /* private Funcionario[] funcionarios; */
    private int numFunc;
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumFunc() {
        return numFunc;
    }

    public void setNumFunc(int numFunc) {
        this.numFunc = numFunc;
    }
    
    
    
}
