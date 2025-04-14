package model.services;

import model.entities.Contrato;

public class ServicoPagamento {
    
    private double juroMensal;
    private double taxaPagamento;
    private ServicoPagamentoInterface servicoPagamentoInterface;


    public ServicoPagamento(double juroMensal, double taxaPagamento,
            ServicoPagamentoInterface servicoPagamentoInterface) {
        this.juroMensal = juroMensal;
        this.taxaPagamento = taxaPagamento;
        this.servicoPagamentoInterface = servicoPagamentoInterface;
    }

    public void processarPagamento(Contrato contrato){

        
    }
    

}
