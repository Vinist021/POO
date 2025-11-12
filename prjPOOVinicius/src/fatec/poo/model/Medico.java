
package fatec.poo.model;

/**
 *
 * @author 0030482523032
 */
public class Medico extends Pessoa{
    private String crm;
    private String especialidade;
    
    public Medico(String cpf, String nome, String crm, String especialidade) {
        super(cpf, nome);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
