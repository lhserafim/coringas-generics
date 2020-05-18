package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String args[]) {
        // Não é possível fazer a atribuição abaixo, necessário usar o coringa <?>
        //List<Object> myObj= new ArrayList<>();
        // coringa
        List<?> myObj = new ArrayList<>();
        List<Integer> myInt = new ArrayList<>();
        myObj = myInt;

        // Listas de 2 tipos
        List<Integer> myInts = Arrays.asList(5,2,3,4);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Luiz", "Henrique", "Sanches","Serafim");
        printList(myStrs);
        }

    // Criando um método recebendo um coringa
    // classes static requerem métodos static
    // não é permitido adicionar itens a uma lista coringa
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
