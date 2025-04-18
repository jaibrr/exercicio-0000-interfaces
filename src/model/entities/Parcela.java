package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {

    LocalDate dataPagamentoParcela;
    Double valorParcela;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Parcela(LocalDate dataPagamentoParcela, Double valorParcela) {
        this.dataPagamentoParcela = dataPagamentoParcela;
        this.valorParcela = valorParcela;
    }
    public LocalDate getDataPagamentoParcela() {
        return dataPagamentoParcela;
    }
    public void setDataPagamentoParcela(LocalDate dataPagamentoParcela) {
        this.dataPagamentoParcela = dataPagamentoParcela;
    }
    public Double getValorParcela() {
        return valorParcela;
    }
    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }
    @Override
    public String toString() {
        return getDataPagamentoParcela() + " - " + getValorParcela();
    }

    
    
}
