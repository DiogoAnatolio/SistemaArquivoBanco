package ui;
import javax.swing.*;
import br.newtonpaiva.dominio.*;
import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String path = "D:\\ArquivoTesteBanco.txt";
        String path1 = "D:\\Total.txt";

        Cliente cliente1 = new Cliente();
        Conta conta1 = new Conta();
        Banco banco1 = new Banco();

        String nome = JOptionPane.showInputDialog("Informe seu nome");

        String nomeB = JOptionPane.showInputDialog("Informe o nome do banco");

        Serializacao.adicionarnaLista(path,banco1);
        Double saldoTotal = banco1.somaValores(banco1.getContas());

        Serializacao.escritor(path1, nomeB, saldoTotal);

    }
}