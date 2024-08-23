package org.exemple.service.calculo.strategys;
import org.example.model.Pedido;
import org.example.service.calculo.strategys.DescontoFixo;
import org.example.service.calculo.strategys.DescontoPorcentagem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {

    @Test
    public void testDescontoFixo() {
        Pedido pedido = new Pedido(100.0);
        pedido.setDescontoStrategy(new DescontoFixo(20.0));
        assertEquals(0.00, pedido.calcularPrecoFinal());
    }

    @Test
    public void testDescontoPorcentagem() {
        Pedido pedido = new Pedido(100.0);
        pedido.setDescontoStrategy(new DescontoPorcentagem(15.0));
        assertEquals(85.0, pedido.calcularPrecoFinal());
    }
}