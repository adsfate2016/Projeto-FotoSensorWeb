
package br.com.fotosensor.modelo;

import java.sql.Date;


public class CondutoresModelo {

private Integer idProprietario;
private String nomeProprietario;
private String cnhProprietario;
private String rgProprietario;
private String cpfProprietario;
private Date dtNascimento;
private Integer idEndereco;
private String logradouro;
private String complemento;
private String numero;
private String municipio;
private String UF;
private String bairro;
private Integer idTelefone;
private String celular;
private String residencial;
private String comercial;

    public Integer getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(Integer idProprietario) {
        this.idProprietario = idProprietario;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getCnhProprietario() {
        return cnhProprietario;
    }

    public void setCnhProprietario(String cnhProprietario) {
        this.cnhProprietario = cnhProprietario;
    }

    public String getRgProprietario() {
        return rgProprietario;
    }

    public void setRgProprietario(String rgProprietario) {
        this.rgProprietario = rgProprietario;
    }

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(Integer idTelefone) {
        this.idTelefone = idTelefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getResidencial() {
        return residencial;
    }

    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }

    public String getComercial() {
        return comercial;
    }

    public void setComercial(String comercial) {
        this.comercial = comercial;
    }

}

//private String logradouro;
//private String complemento;
//private String numero;
//private String municipio;
//private String UF;
//private String bairro;
//private String celular;
//private String residencial;
//private String comercial;