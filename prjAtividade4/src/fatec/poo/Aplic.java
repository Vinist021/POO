package fatec.poo;

import fatec.poo.model.Palestra;
import fatec.poo.model.Palestrante;
import fatec.poo.model.Participante;

public class Aplic {
    public static void main(String[] args) {
        Palestrante palestrante = new Palestrante
        ("111.111.111-11", "José da Silva", "Empresa X");

        Participante p1 = new Participante("1", "a", 'C');
        Participante p2 = new Participante("2", "b", 'E');
        Participante p3 = new Participante("3", "c", 'I');
        Participante p4 = new Participante("4", "d", 'C');
        Participante p5 = new Participante("5", "e", 'E');

        Palestra palestra1 = new Palestra("Tema 1", 250);
        Palestra palestra2 = new Palestra("Tema 2", 300);
        Palestra palestra3 = new Palestra("Tema 3", 350);

        

    }
}
