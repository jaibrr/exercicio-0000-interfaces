package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.ServicoPagamento;

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
        
        Contrato loc = new Contrato();

        System.out.print("Insira o preço por hora: $ ");
        double precoHora = sc.nextDouble();
        System.out.print("Insira o preço por dia: $ ");
        double precoDia = sc.nextDouble();
        ServicoLocacao servicoLocacao = new ServicoLocacao(precoHora, precoDia, new ServicoTributoBrasil());
        servicoLocacao.processarFatura(loc);
        
    }
}
