package model.services;

public class SerivcoPagamentoPaypal implements ServicoPagamentoInterface{

    @Override
    public Double juroMensal(double valor){
        return valor * 0.2;
    }

    @Override
    public Double taxaPagamento(double valor){
        return valor * 0.2;
    }
}
