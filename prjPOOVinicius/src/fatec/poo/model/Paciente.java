
package fatec.poo.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author vinicius
 */
public class Paciente extends Pessoa {
    private LocalDate dataNascimento;
    private double altura;
    private double peso;
          
    public Paciente(String cpf, String nome, LocalDate dataNascimento) {
        super(cpf, nome);
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
        
    public double calcIMC() {
        return peso / Math.pow(altura, 2);
    }
    
    public int calcIdade() {
        Period periodo = Period.between(dataNascimento, LocalDate.now());
        return periodo.getYears();
    }
}
