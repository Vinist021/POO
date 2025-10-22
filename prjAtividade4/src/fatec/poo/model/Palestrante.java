package fatec.poo.model;

/**
 *
 * @author 0030482523032
 */
public class Palestrante extends Pessoa {
    private String empresa;
    private double taxaCobranca;
    
    public Palestrante(String cpf, String nome, String empresa) {
        super(cpf, nome);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getTaxaCobranca() {
        return taxaCobranca;
    }

    public void setTaxaCobranca(double taxaCobranca) {
        this.taxaCobranca = taxaCobranca;
    }
    
    // Realizar associação com palestra
    public double calcTotalReceberPalestras() {
        return 0;
    }
    
}
