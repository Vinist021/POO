package fatec.poo.model;

/**
 *
 * @author 0030482523032
 */
public class Palestra {
    private String data;
    private String tema;
    private double valor;
    
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
        
    }
}