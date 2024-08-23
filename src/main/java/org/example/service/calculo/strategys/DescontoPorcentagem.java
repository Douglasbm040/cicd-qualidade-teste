package org.example.service.calculo.strategys;
import org.example.service.calculo.interfaces.DescontoStrategy;

public class DescontoPorcentagem implements DescontoStrategy {
    private double percentualDesconto;

    public DescontoPorcentagem(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularDesconto(double preco) {
        return preco * (1 - percentualDesconto / 100);
    }
}