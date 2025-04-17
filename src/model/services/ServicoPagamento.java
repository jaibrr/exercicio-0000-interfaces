package model.services;

import model.entities.Contrato;
import model.entities.Parcela;

public class ServicoPagamento {
    
    private Integer numeroParcelas;
    private Contrato contrato;
    private ServicoPagamentoInterface servicoPagamentoInterface;


    public ServicoPagamento(Integer numeroParcelas, Contrato contrato, ServicoPagamentoInterface servicoPagamentoInterface) {
        this.numeroParcelas = numeroParcelas;
        this.contrato = contrato;
        this.servicoPagamentoInterface = servicoPagamentoInterface;
    }

    

    public void processarPagamento(){

        double juroMensal = servicoPagamentoInterface.juroMensal(contrato.getValorTotalContrato());
        double taxaPagamento = servicoPagamentoInterface.taxaPagamento(contrato.getValorTotalContrato());
        double valorTotalJuroTaxa = contrato.getValorTotalContrato() + taxaPagamento + juroMensal;

        for(int i = 1; i <= numeroParcelas; i++){
            Parcela parcela = new Parcela(contrato.getDataContrato().plusMonths(i), valorTotalJuroTaxa/numeroParcelas);
            System.out.println(parcela);
        }
    }
    

}
