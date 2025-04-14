package model.services;

public class SerivcoPagamentoInterfacePaypal implements ServicoPagamentoInterface{

    @Override
    public double juroMensal(double valor){
        return valor * 0.01;
    }

    @Override
    public double taxaPagamento(double valor){
        return valor * 0.02;
    }
}
