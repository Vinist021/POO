package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author vinicius
 */
public class Consulta {
    private int codigo;
    private String data;
    private double valor;
    private Medico medico;
    private ArrayList<Medicacao> medicacoes;  // 0..*
    private ArrayList<Exame> exames;

    public Consulta(int codigo, String data) {
        this.codigo = codigo;
        this.data = data;
        medicacoes = new ArrayList<Medicacao>();
        exames = new ArrayList<Exame>();
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
    
    public double calcValorTotalPagar() { 
        double total = this.valor;
        if (exames != null) {
            for (Exame e : exames) {
                if (e != null) {
                    total += e.getValor();
                }
            }
        }
        return total;
    }
}
