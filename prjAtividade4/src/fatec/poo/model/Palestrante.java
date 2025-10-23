package fatec.poo.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 0030482523032
 */
public class Palestrante extends Pessoa {
    private String empresa;
    private double taxaCobranca;
    private List<Palestra> palestras = new ArrayList<>();
    
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
    
    public double calcTotalReceberPalestras() {
        return palestras.stream().mapToDouble(p -> p.getValor()).sum() * taxaCobranca;
    }
}
