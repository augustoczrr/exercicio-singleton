package padroescriacao.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {

    @Test
    public void deveRetornarNomeProdutoAdicionado() {
        o
        Carrinho.getInstance().setNomeProduto("Playstation 5");
        
        
        assertEquals("Playstation 5", Carrinho.getInstance().getNomeProduto());
    }

    @Test
    public void deveRetornarQuantidadeAdicionada() {
        
        Carrinho.getInstance().setQuantidade(2);
        
        
        assertEquals(2, Carrinho.getInstance().getQuantidade());
    }
}