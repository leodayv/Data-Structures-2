package BinaryTree;

import java.util.Scanner;

public class TestArvoreBinInteiro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menu;

        ArvoreBinInteiro tree = new ArvoreBinInteiro();
        do {
            System.out.println("""
                    MENU
                    1.   Inserir um número
                    2.   Retornar o maior número
                    3.   Retornar o menor número
                    4.   Retornar a altura da árvore
                    5.   Listar números (percurso Pré-Ordem)
                    6.   Listar números (percurso Pós-Ordem)
                    7.   Listar números (percurso Simétrico)
                    8.   Listar números (percurso em níveis)
                    9.   Listar os números internos
                    10.  Listar folhas
                    11.  Exibir caminho da raiz a um número
                    12.  Retorna raiz
                    0.   Sair""");

            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Digite o número a ser inserido: ");
                    int insertedNumber = scanner.nextInt();
                    tree.inserir(insertedNumber);
                    break;
                case 2:
                    System.out.println("O maior número é: " + tree.higherNumber(tree.root) );
                    break;
                case 3:
                    System.out.println("O menor número é: ");
                    break;
                case 4:
                    System.out.println("A altura da árvore é: " + tree.deepestLevel(tree.root));
                    break;
                case 5:
                    System.out.println("Lista números em pré-ordem: ");
                    break;
                case 6:
                    System.out.println("Lista números em pós-ordem: ");
                    break;
                case 7:
                    System.out.println("Lista de números em ordem simpétrica: ");
                    break;
                case 8:
                    System.out.println("Lista de números em nível: ");
                    break;
                case 9:
                    System.out.println("Lista dos números internos: ");
                    break;
                case 10:
                    System.out.println("Lista de folhas da árvore: ");
                    break;
                case 11:
                    System.out.println("Caminho até o número: ");
                    break;
                case 12:
                    System.out.println("Raiz: " + tree.getRoot().getData());
                case 0:
                    break;
            }
        }
        while (menu != 0);
    }
}
