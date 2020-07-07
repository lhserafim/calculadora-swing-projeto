package br.com.alvoradatec.calculadora.modelo;

@FunctionalInterface
public interface MemoriaObservador {

    public void valorAlterado(String novoValor);
}