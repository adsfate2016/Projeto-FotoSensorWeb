
package br.com.fotosensor.modelo;

import java.sql.Date;


public class InfracoesModelo {
  private Integer idProprietario;
  private Integer idInfracao;
  private Integer idVeiculo;       
  private Integer idTipoInfracao;       
  private String Local;        
  private Date Data;       
  private String observacao;   
  private Integer codigo;  
  private Integer pontuacao;
  private float valor;

    public Integer getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(Integer idProprietario) {
        this.idProprietario = idProprietario;
    }

    public Integer getIdInfracao() {
        return idInfracao;
    }

    public void setIdInfracao(Integer idInfracao) {
        this.idInfracao = idInfracao;
    }

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Integer getIdTipoInfracao() {
        return idTipoInfracao;
    }

    public void setIdTipoInfracao(Integer idTipoInfracao) {
        this.idTipoInfracao = idTipoInfracao;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
          
          
}
