package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;

import model.services.ServicoPagamentoInterface;
import model.services.SerivcoPagamentoInterfacePaypal;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe os dados do Contrato");
        System.out.print("Numero do Contrato: ");
        Integer numeroContrato = sc.nextInt();
        System.out.print("Data do Contrato(dd/MM/yyy): ");
        LocalDateTime dataContrato = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Valor Total do Contrato: $ ");
        double valorTotalContrato = sc.nextDouble();
        System.out.print("Numero de Parcelas: ");
        Integer numeroParcelas = sc.nextInt();
        
        Contrato contrato = new Contrato(numeroContrato,dataContrato,valorTotalContrato, new Parcela(dataContrato,valorTotalContrato/numeroParcelas) );


        ServicoPagamentoInterface servicoPagamento = new SerivcoPagamentoInterfacePaypal() {};
        servicoPagamento.processarFatura(contrato);
        
    }
}
