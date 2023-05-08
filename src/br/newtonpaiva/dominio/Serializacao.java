package br.newtonpaiva.dominio;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

import br.newtonpaiva.dominio.*;

public class Serializacao {

    public static void leitor(String path) throws Exception {
        BufferedReader leitor = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
            linha = leitor.readLine();
        }
        leitor.close();
    }

    public static void escritor(String path, String nomeBanco, Double saldoTotal) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        buffWrite.append("Banco " + nomeBanco + " " + "possui o saldo geral de contas de: " + saldoTotal);
        buffWrite.close();
    }

    public static void adicionarnaLista(String path, Banco banco) throws Exception {
        BufferedReader leitor = new BufferedReader(new FileReader(path));
        banco.setContas(new ArrayList<>());

        String linha;

        while ((linha = leitor.readLine()) != null) {

            Conta conta = new Conta();


            String[] textoSeparado = linha.split(";");
            //System.out.println(Arrays.toString(textoSeparado));

            String agencia = textoSeparado[0];
            String numero = textoSeparado[1];
            Double saldo = Double.parseDouble(textoSeparado[2]);

            conta.setAgencia(agencia);
            conta.setNumero(numero);
            conta.setSaldo(saldo);

            //System.out.println(conta.getAgencia());

            banco.getContas().add(conta);
        }
        System.out.println(banco.getContas().size());
        leitor.close();
    }
}
