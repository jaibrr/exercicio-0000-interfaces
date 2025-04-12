package model.entities;

import java.sql.Date;

public class Contrato {

    Integer numero;
    Date dataContrato;
    Double valorTotalContrato;
    Integer numeroParcelas;

    public Contrato(Integer numero, Date dataContrato, Double valorTotalContrato, Integer numeroParcelas) {
        this.numero = numero;
        this.dataContrato = dataContrato;
        this.valorTotalContrato = valorTotalContrato;
        this.numeroParcelas = numeroParcelas;
    }
    public Integer getNumber() {
        return numero;
    }
    public void setNumber(Integer numero) {
        this.numero = numero;
    }
    public Date getDataContrato() {
        return dataContrato;
    }
    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }
    public Double getValorTotalContrato() {
        return valorTotalContrato;
    }
    public void setValorTotalContrato(Double valorTotalContrato) {
        this.valorTotalContrato = valorTotalContrato;
    }

    


}
