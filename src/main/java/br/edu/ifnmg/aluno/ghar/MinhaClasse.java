package br.edu.ifnmg.aluno.ghar;

import java.util.List;

public class MinhaClasse {

    public static Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs) {
        
        Integer e = 2000;
        Double lr = 0.025;

        return metodo(ins, outs, e, lr);
    }

    public static Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs, Integer e) {
        
        Double lr = 0.025;

        return metodo(ins, outs, e, lr);
    }

    public static Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs, Integer e, Double lr) {
        
        Double w0 = 0.0;
        Double w1 = 0.0;
        Double p;
        Double dif;
        Integer count = 0;

        for (int i = 0; i < e; i++) {
            for (int j = 0; j < ins.size(); j++) {
                p = w1 * ins.get(j) + w0;
                dif = outs.get(j) - p;
                w0 += dif * lr;
                w1 += dif * lr * ins.get(j);
            }
            if (count % 10 == 0) {
                System.out.printf("e: %d / w1: %.3f / w0: %.3f\n", i, w1, w0);
            }
            count++;
        }

        return new Dupla<Double, Double>(w1, w0);
    }
}
