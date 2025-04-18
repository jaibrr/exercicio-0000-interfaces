package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;

import model.services.ServicoPagamentoInterfacePaypal;
import model.services.ServicoPagamento;

public class App {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe os dados do Contrato");
        System.out.print("Numero do Contrato: ");
        Integer numeroContrato = sc.nextInt();
        System.out.print("Data do Contrato(dd/MM/yyy): ");
        LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor Total do Contrato: $ ");
        double valorTotalContrato = sc.nextDouble();
        System.out.print("Numero de Parcelas: ");
        Integer numeroParcelas = sc.nextInt();
        
        Contrato contrato = new Contrato(numeroContrato,dataContrato,valorTotalContrato);


        ServicoPagamento servicoPagamento = new ServicoPagamento(numeroParcelas, contrato, new ServicoPagamentoInterfacePaypal()) {};
        servicoPagamento.processarPagamento();
        sc.close();
    }
}
