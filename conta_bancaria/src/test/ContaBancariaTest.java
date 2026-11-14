package test;

import dominio.ContaBancaria;

public class ContaBancariaTest {
    static void main(String[] args) {
        ContaBancaria contaBancaria01 = new ContaBancaria();
        ContaBancaria contaBancaria02 = new ContaBancaria();

        //Criação da conta
        contaBancaria01.setTitular("bigode");
        contaBancaria01.setNumeroConta(123);

        //deposito e saque conta 01
        contaBancaria02.setTitular("lucas");
        contaBancaria02.setNumeroConta(456);

        contaBancaria01.depositar(1000);

        //tranferencia conta 02
        contaBancaria02.depositar(500);

        //tranferencia
        contaBancaria01.transferir(contaBancaria02, 200);

        //dados conta
        contaBancaria01.exibirDados();
        contaBancaria02.exibirDados();

    }
}
