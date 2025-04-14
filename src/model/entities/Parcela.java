package model.entities;

import java.time.LocalDateTime;

public class Parcela {

    LocalDateTime dataPagamentoParcela;
    Double valorParcela;

    public Parcela(LocalDateTime dataPagamentoParcela, Double valorParcela) {
        this.dataPagamentoParcela = dataPagamentoParcela;
        this.valorParcela = valorParcela;
    }
    public LocalDateTime getDataPagamentoParcela() {
        return dataPagamentoParcela;
    }
    public void setDataPagamentoParcela(LocalDateTime dataPagamentoParcela) {
        this.dataPagamentoParcela = dataPagamentoParcela;
    }
    public Double getValorParcela() {
        return valorParcela;
    }
    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    
}
