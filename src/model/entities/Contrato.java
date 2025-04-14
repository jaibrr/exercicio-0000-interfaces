package model.entities;

import java.time.LocalDateTime;

public class Contrato {

    private Integer numeroContrato;
    private LocalDateTime dataContrato;
    private Double valorTotalContrato;
    private Parcela parcelas;

    public Contrato(Integer numeroContrato, LocalDateTime dataContrato, Double valorTotalContrato, Parcela parcelas) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorTotalContrato = valorTotalContrato;
        this.parcelas = parcelas;
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
    public Parcela getParcelas() {
        return parcelas;
    }
    public void setParcelas(Parcela parcelas) {
        this.parcelas = parcelas;
    }

    


}
