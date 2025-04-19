package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcela;

public class ServicoPagamento {
    
    private ServicoPagamentoInterface servicoPagamentoInterface;


    public ServicoPagamento(ServicoPagamentoInterface servicoPagamentoInterface) {
        this.servicoPagamentoInterface = servicoPagamentoInterface;
    }


    public void processarPagamento(Contrato contrato, int numeroParcelas){

        double parcelaBasica = contrato.getValorTotalContrato()/numeroParcelas;

        for(int i = 1; i <= numeroParcelas; i++){
            LocalDate dataPagamentoParcela = contrato.getDataContrato().plusMonths(i);
            double juroMensal = servicoPagamentoInterface.juroMensal(parcelaBasica, i);
            double taxaPagamento = servicoPagamentoInterface.taxaPagamento(parcelaBasica + juroMensal);
            double parcelaFinal = parcelaBasica + juroMensal + taxaPagamento;
            contrato.getParcelas().add(new Parcela(dataPagamentoParcela, parcelaFinal));
        }
    }
    

}
