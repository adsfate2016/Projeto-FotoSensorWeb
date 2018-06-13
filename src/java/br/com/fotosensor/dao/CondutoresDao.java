package br.com.fotosensor.dao;

import br.com.fotosensor.conexao.ConexaoBD;
import br.com.fotosensor.modelo.CondutoresModelo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CondutoresDao {

    PreparedStatement pst;
    ResultSet rs;
    String sql;

    Connection conexao;

    public void salvar(CondutoresModelo cond) {
        sql = "insert into proprietario(nomeProprietario, cnhProprietario,"
                + "rgProprietario, cpfProprietario, dtNascimento, idEndereco, "
                + "idTelefone) values (?,?,?,?,?,?,?)";
//       idProprietario; 

        try {
            Connection conecta = ConexaoBD.conectar();
            pst = conecta.prepareStatement(sql);
            pst.setString(1, cond.getNomeProprietario());
            pst.setString(2, cond.getCnhProprietario());
            pst.setString(3, cond.getRgProprietario());
            pst.setString(4, cond.getCpfProprietario());
            pst.setDate(5, cond.getDtNascimento());
            pst.setInt(6, cond.getIdEndereco());
            pst.setInt(7, cond.getIdTelefone());

            pst.execute();
            ConexaoBD.conectar().close();
            System.out.println("Proprietário Cadastrado Com Sucesso!");
        } catch (Exception e) {
            System.out.println("Proprietário Não Cadastrado " + e);
        }
    }

    public List buscar() {
        List<CondutoresModelo> lista = new ArrayList<>();
        sql = "Select * from proprietario";
        try {
            conexao = ConexaoBD.conectar();
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {

                CondutoresModelo cond = new CondutoresModelo();

                cond.setIdProprietario(rs.getInt("idproprietario"));
                cond.setNomeProprietario(rs.getString("nomeproprietario"));
                cond.setCnhProprietario(rs.getString("CnhProprietario"));
                cond.setRgProprietario(rs.getString("rgProprietario"));
                cond.setCpfProprietario(rs.getString("cpfProprietario"));
                cond.setDtNascimento(rs.getDate("dtNascimento"));
                cond.setIdEndereco(rs.getInt("idEndereco"));
                cond.setIdTelefone(rs.getInt("idTelefone"));
                lista.add(cond);
            }
            ConexaoBD.conectar().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta do Proprietário!: " + e);
        }
        return lista;
    }

    public void alterar(CondutoresModelo dado) {
        sql = "update proprietario set NomeProprietario=?, CnhProprietario=?,"
                + " RgProprietario=?, CpfProprietario=?, DtNascimento=?, "
                + "IdEndereco=?, IdTelefone=? ";
        try {

            conexao = ConexaoBD.conectar();
            pst = conexao.prepareStatement(sql);
            pst.setString(1, dado.getNomeProprietario());
            pst.setString(2, dado.getCnhProprietario());
            pst.setString(3, dado.getRgProprietario());
            pst.setString(4, dado.getCpfProprietario());
            pst.setDate(5, dado.getDtNascimento());
            pst.setInt(6, dado.getIdEndereco());
            pst.setInt(7, dado.getIdTelefone());

            pst.execute();
            ConexaoBD.conectar().close();
            JOptionPane.showMessageDialog(null, "Proprietário Alterado com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar o Proprietário: " + e);
        }
    }

    public void deletar(CondutoresModelo cond) {
        sql = "delete from proprietario where idProprietario= ?";
        try {
            conexao = ConexaoBD.conectar();
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, cond.getIdProprietario());
            pst.execute();
            ConexaoBD.conectar().close();
            JOptionPane.showMessageDialog(null, "Proprietário Deletado com Sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar o Proprietário! " + e);
        }

    }

}
