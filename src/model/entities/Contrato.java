package model.entities;

import java.time.LocalDateTime;

public class Contrato {

    private Integer numeroContrato;
    private LocalDateTime dataContrato;
    private Double valorTotalContrato;

    public Contrato(Integer numeroContrato, LocalDateTime dataContrato, Double valorTotalContrato) {
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
    public LocalDateTime getDataContrato() {
        return dataContrato;
    }
    public void setDataContrato(LocalDateTime dataContrato) {
        this.dataContrato = dataContrato;
    }
    public Double getValorTotalContrato() {
        return valorTotalContrato;
    }
    public void setValorTotalContrato(Double valorTotalContrato) {
        this.valorTotalContrato = valorTotalContrato;
    }    


}
