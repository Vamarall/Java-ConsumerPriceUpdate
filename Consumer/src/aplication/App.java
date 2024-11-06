package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Código em Java que explora diferentes maneiras de implementar
         * uma operação sobre os elementos de uma lista usando expressões lambda,
         * referências a métodos e uma interface funcional personalizada.
         * 
         * Neste exemplo, uma lista de produtos é criada e quatro abordagens são
         * demonstradas
         * para atualizar o valor dos produtos multiplicando-os por um fator:
         * 
         * 1. Usando uma expressão lambda armazenada em uma variável do tipo Consumer.
         * 2. Usando uma expressão lambda inline.
         * 3. Usando uma referência ao método estático (Classe::nomeMetodo) para
         * atualizar o preço.
         * 4. Usando uma interface funcional personalizada, `UpdatePrice`, que define um
         * método abstrato
         * para atualizar o preço dos produtos.
         */

        List<Produto> list = new ArrayList<>();

        // Adicionando instancias de produtos a lista
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("NoteBook", 700.00));
        list.add(new Produto("Cabo HDMI", 90.00));
        list.add(new Produto("PlayStation 5", 3900.50));

        double factor = 1.1;
        // Expressao lambida declarada do tipo consumer que realiza a atualizacao do
        // valor
        Consumer<Produto> cons = p -> p.setValor(p.getValor() * factor);

        // list.forEach(cons);

        // list.forEach(new UptadePrice()) Interface funcional

        // Expressao lambida inline
        // list.forEach(p -> p.setValor(p.getValor() * factor))

        // Realizando uma referencia ao metodo estatico no formato (Classe::nomeMetodo)
        list.forEach(Produto::staticUpdatePrice);

        // Saida esperada : 990.00, 385,00, 770,00, 99,00, 4290,55
        list.forEach(System.out::println);
    }
}
