package model.services;

public interface ServicoPagamentoInterface {

    double juroMensal (double valorParcela, int parcelas);
    double taxaPagamento (double valorParcela);

}
