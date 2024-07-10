package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Numero> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public double calcularSoma(){
        double valorTotal = 0.00;
        for(Numero n : numeroList){
            valorTotal += n.getNumero();
        }
        return valorTotal;
    }


    public int encontrarMaiorNumero() {
        int maiorValor = Integer.MIN_VALUE;
        for (Numero n : numeroList) {
            if (n.getNumero() > maiorValor) {
                maiorValor = n.getNumero();
            }
        }
        return maiorValor;
    }

    public int encontrarMenorNumero() {
        int menorValor = Integer.MAX_VALUE;
        for (Numero n : numeroList) {
            if (n.getNumero() < menorValor) {
                menorValor = n.getNumero();
            }
        }
        return menorValor;
    }


    public String exibirNumeros(){
       return numeroList.toString();
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(-10);

        System.out.println("A soma dos valores é igual a: " + somaNumeros.calcularSoma());
        System.out.println("O maior numero é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor numero é: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Os numeros da lista são: " + somaNumeros.exibirNumeros());

        

    }

}
