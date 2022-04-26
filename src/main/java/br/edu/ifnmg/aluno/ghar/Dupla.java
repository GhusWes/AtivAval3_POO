package br.edu.ifnmg.aluno.ghar;

public class Dupla<T, U> {

    private T valorA;
    private U valorB;

    public Dupla() {
    }

    public Dupla(T valorA, U valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public T getValorA() {
        return valorA;
    }

    public void setValorA(T valorA) {
        this.valorA = valorA;
    }

    public U getValorB() {
        return valorB;
    }

    public void setValorB(U valorB) {
        this.valorB = valorB;
    }
    
    @Override
    public String toString() {
        return '<' + valorA.toString()
                + ", " + valorB.toString() + '>';
    }
}