public class Produto {

    private String nome;
    private Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Reference method com metodo estatico
    // Pelo fato de ser um metodo estatico ele deve recer um obj como parametro
    public static void staticUpdatePrice(Produto p) {
        p.setValor(p.getValor() * 1.1);
    }

    // Reference method com metodo nao estatico
    // Pelo fato de ser nao estatico ele nao necessita de parametro
    public void nonStaticUptadePrice() {
        setValor(getValor() * 1.1);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", valor=" + String.format("%.2f", valor) + "]";
    }

}
