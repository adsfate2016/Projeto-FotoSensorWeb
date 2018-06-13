package br.com.fotosensor.controle;

import br.com.fotosensor.dao.CondutoresDao;
import br.com.fotosensor.modelo.CondutoresModelo;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "condutoresBean")
@SessionScoped
public class CondutoresBean {

    private CondutoresModelo conduMode = new CondutoresModelo();
    private CondutoresDao condutoresdao = new CondutoresDao();
    private List<CondutoresModelo> lista = new ArrayList<>();

//    private NavegacaoController navegacaoController;
    PreparedStatement pst;
    ResultSet rs;
    String sql;
    Connection conexao;

    public CondutoresBean() {
        buscar();
    }

    public CondutoresModelo getConduMode() {
        return conduMode;
    }

    public void setCondiMode(CondutoresModelo conduMode) {
        this.conduMode = conduMode;
    }

    public CondutoresDao getFornecedordao() {
        return condutoresdao;
    }

    public void setFornecedordao(CondutoresDao fornecedordao) {
        this.condutoresdao = fornecedordao;
    }

    public List<CondutoresModelo> getLista() {
        return lista;
    }

    public void setLista(List<CondutoresModelo> lista) {
        this.lista = lista;
    }

    public PreparedStatement getPst() {
        return pst;
    }

    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public void salvarDados() {
        if (conduMode.getIdProprietario() == null) {
            condutoresdao.salvar(conduMode);
            conduMode = new CondutoresModelo();
            buscar();
        } else {

        }
    }

    public void buscar() {
        lista = condutoresdao.buscar();
    }

    public void alterar(CondutoresModelo condu) {
        conduMode = condu;
    }

    public void excluir(CondutoresModelo condutores) {
        conduMode = condutores;
        condutoresdao.deletar(conduMode);
        conduMode = new CondutoresModelo();
        buscar();
    }

}
