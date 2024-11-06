import java.util.function.Consumer;

//Classe que implementa uma interface funcional(Consumer)
public class UptadePrice implements Consumer<Produto> {

    @Override
    public void accept(Produto p) {
        p.setValor(p.getValor() * 1.1); // Aumenta o valor do produto em 10%
    }

}
