package org.example.service.calculo.strategys;
import org.example.service.calculo.interfaces.DescontoStrategy;

public class DescontoFixo implements DescontoStrategy {
    private double valorDesconto;

    public DescontoFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double calcularDesconto(double preco) {
        return preco - valorDesconto;
    }
}
