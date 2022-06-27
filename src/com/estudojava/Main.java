package com.estudojava;

import java.util.Scanner;

public class Main {

        public static void FuncaoTabuada() {
            Scanner teclado = new Scanner(System.in);
            System.out.println("******* Você escolheu o operador (1) Tabuada ******* \n" +
                    "Qual tabuada você quer efetuar?");
            int TabuadaRealizar = teclado.nextInt();
            int contador = 1;

            while (contador <= 10) {
                System.out.println(TabuadaRealizar + " x " + contador + " = " + TabuadaRealizar * contador);
                contador++;
            }
        }

        public static void FuncaoParImpar() {
            Scanner teclado = new Scanner(System.in);
            System.out.println("******* Você escolheu o operador (2) Verificação de Par ou Ímpar ******* \n" +
                    "Qual número você quer verificar se é par ou ímpar?");
            int numVerificar = teclado.nextInt();

            if (numVerificar % 2 == 0) {
                System.out.println(" O número " + numVerificar + " é par. ");
            } else {
                System.out.println(" O número " + numVerificar + " é ímpar. ");
            }
        }

        public static void FuncaoPar() {
            Scanner teclado = new Scanner(System.in);
            System.out.println("******* Você escolheu o operador (3) Números Pares ******* \n" +
                    "Até qual número será a sequência  de números pares?");
            int numAte = teclado.nextInt();
            int numMinimo = 1;

            while (numMinimo <= numAte) {
                if (numMinimo % 2 == 0) {
                    System.out.println(" O número " + numMinimo + " é par. ");
                }
                numMinimo++;
            }
        }

        public static void FuncaoPrimo() {
            Scanner teclado = new Scanner(System.in);
            System.out.println("******* Você escolheu o operador (4) Números Primos ******* \n" +
                    "Até qual número será a sequência  de números primos?");
            int numVerificar = teclado.nextInt();
            int numMinimo = 2;

            while (numMinimo <= numVerificar) {
                int divisor = 1;
                boolean isPrimo = true;
                while (divisor <= numMinimo) {
                    if (numMinimo % divisor == 0 && divisor != numMinimo && divisor != 1) {
                        isPrimo = false;
                    }
                    divisor++;
                }
                if (isPrimo) {
                    System.out.println(" O número " + numMinimo + " é primo. ");
                }
                numMinimo++;
            }
        }

        public static void FuncaoFibonacci() {
            Scanner teclado = new Scanner(System.in);

            System.out.println("******* Você escolheu o operador (5) Sequência Fibonacci ******* \n" +
                    "Até qual número será a sequência Fibonacci?");
            int numAte = teclado.nextInt();
            int ultimo = 1;
            int atual = 1;
            int temp;

            System.out.println(atual);
            System.out.println(ultimo);

            while (atual <= numAte) {
                System.out.println(ultimo + atual);
                temp = atual;
                atual = atual + ultimo;
                ultimo = temp;
            }
        }

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int op = 1;

            while (op >= 1) {
                System.out.println("\n Olá, abaixo temos as opções do Menu: \n");
                System.out.println(" ~~~~~~~~ M E N U ~~~~~~~~ \n");
                System.out.println(" (1) Tabuada");
                System.out.println(" (2) Verificação de Par ou Ímpar");
                System.out.println(" (3) Números Pares");
                System.out.println(" (4) Números Primos");
                System.out.println(" (5) Sequência Fibonacci");
                System.out.println(" (0) Fechar o programa \n");
                System.out.println("Selecione uma opção abaixo: ");
                op = teclado.nextInt();

                if (op == 1) {
                    FuncaoTabuada();
                } else if (op == 2) {
                    FuncaoParImpar();
                } else if (op == 3){
                    FuncaoPar();
                } else if (op == 4) {
                    FuncaoPrimo();
                } else if (op == 5) {
                    FuncaoFibonacci();
                }
            }
            System.out.println("Fim do programa. Obrigada!");
        }
    }

