package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fatec.poo.model.Projeto;

public class DaoProjeto {
	
    private Connection conn;

    public DaoProjeto(Connection conn) {
         this.conn = conn;
    }

    public void inserir(Projeto projeto) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tbProjeto(Cod_Proj, Desc_Proj, DataInicio_Proj, DataFim_Proj) VALUES(?,?,?,?)");
            ps.setInt(1, projeto.getCodigo());
            ps.setString(2, projeto.getDescricao());
            ps.setString(3, projeto.getDtInicio());
            ps.setString(4, projeto.getDtTermino());

            ps.execute();
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());  
        }
    }

    public void alterar(Projeto projeto) {
        PreparedStatement ps = null;
     
        try {
        	ps = conn.prepareStatement("UPDATE tbProjeto SET Desc_Proj = ?, DataInicio_Proj = ?, DataTermino_Proj = ?" +
        			           "WHERE Cod_Proj = ?");

            ps.setString(1, projeto.getDescricao());
            ps.setString(2, projeto.getDtInicio());
            ps.setString(3, projeto.getDtTermino());
            ps.setInt(4, projeto.getCodigo());

            ps.execute();
        }
        catch (SQLException ex) {
            System.out.println(ex.toString()); 
        }
    }

     public Projeto consultar(int codigo) {
        Projeto p = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbProjeto WHERE Cod_Proj = ?");

            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p = new Projeto(rs.getInt("Cod_Proj"), rs.getString("Desc_Proj"));
                p.setDtInicio(rs.getString("DataInicio_Proj"));
                p.setDtTermino(rs.getString("DataTermino_Proj"));
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.toString()); 
        }
        
        return p;
    }

     public void excluir(Projeto projeto) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("DELETE FROM tbProjeto WHERE Cod_Proj = ?");

            ps.setInt(1, projeto.getCodigo());

            ps.execute();
        }
        catch (SQLException ex) {
              System.out.println(ex.toString()); 
        }
    }
}
