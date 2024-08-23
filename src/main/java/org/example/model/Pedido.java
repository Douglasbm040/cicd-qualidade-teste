package org.example.model;

import org.example.service.calculo.interfaces.DescontoStrategy;

public class Pedido {
    private double precoOriginal;
    private DescontoStrategy descontoStrategy;

    public Pedido(double precoOriginal) {
        this.precoOriginal = precoOriginal;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularPrecoFinal() {
        return descontoStrategy.calcularDesconto(precoOriginal);
    }
}
