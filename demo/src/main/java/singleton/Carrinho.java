package padroescriacao.singleton;

public class Carrinho {

    
    private Carrinho() {}

   
    private static Carrinho instance = new Carrinho();

    
    public static Carrinho getInstance() {
        return instance;
    }

    
    private String nomeProduto;
    private int quantidade;

    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}