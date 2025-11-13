package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author 0030482523032
 */
public class Medico extends Pessoa{
    private String crm;
    private String especialidade;
    private ArrayList<Consulta> consultas;  // 0..*
    
    public Medico(String cpf, String nome, String crm, String especialidade) {
        super(cpf, nome);
        this.crm = crm;
        this.especialidade = especialidade;
        consultas = new ArrayList<Consulta>();
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
