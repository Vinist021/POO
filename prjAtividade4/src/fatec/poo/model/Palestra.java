package fatec.poo.model;

import java.util.List;

/**
 *
 * @author 0030482523032
 */
public class Palestra {
    private String data;
    private String tema;
    private double valor;
    private Palestrante palestrante;
    private List<Participante> participantes;
    
    public Palestra(String tema, double valor) {
        this.tema = tema;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
    }

    public String getTema() {
        return tema;
    }

    public double getValor() {
        return valor;
    }
    
    public double calcTotalFaturado() {
        double total = 0;
        for(Participante p: participantes) {
            if(p.getTipo() == 'C') {
                total += this.valor;
            }
            else if(p.getTipo() == 'E') {
                total += this.valor * 0.85;
            }
            else {
                total += this.valor * 0.8;
            }

        }
        return total;
    }
}