package model.services;

public class ServicoPagamentoInterfacePaypal implements ServicoPagamentoInterface{

	private static final double PERCENTUAL_TAXA = 0.02;
	private static final double JURO_MENSAL = 0.01;

    @Override
    public double juroMensal(double valor){
        return valor * JURO_MENSAL;
    }

    @Override
    public double taxaPagamento(double valor){
        return valor * PERCENTUAL_TAXA;
    }

}
