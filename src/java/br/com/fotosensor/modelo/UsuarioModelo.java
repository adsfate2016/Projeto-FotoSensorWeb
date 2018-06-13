
package br.com.fotosensor.modelo;

public class UsuarioModelo {
 
  private Integer idTipoInfracao;       
  private Integer idUsuario; 
  private String usuario;
  private String Senha;
  private String Nome;
  private String email;

    public Integer getIdTipoInfracao() {
        return idTipoInfracao;
    }

    public void setIdTipoInfracao(Integer idTipoInfracao) {
        this.idTipoInfracao = idTipoInfracao;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
}
