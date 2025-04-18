package model.entities;

import java.time.LocalDate;

public class Contrato {

    private Integer numeroContrato;
    private LocalDate dataContrato;
    private Double valorTotalContrato;


    public Contrato(Integer numeroContrato, LocalDate dataContrato, Double valorTotalContrato) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorTotalContrato = valorTotalContrato;

    }
    public Integer getNumero() {
        return numeroContrato;
    }
    public void setNumero(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }
    public LocalDate getDataContrato() {
        return dataContrato;
    }
    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }
    public Double getValorTotalContrato() {
        return valorTotalContrato;
    }
    public void setValorTotalContrato(Double valorTotalContrato) {
        this.valorTotalContrato = valorTotalContrato;
    }    


}
