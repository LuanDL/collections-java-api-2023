package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item novoItem = new Item(nome, preco, quantidade);
        itemList.add(novoItem);
    }

    public void removerItem(String nome) {
        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemList.remove(item);
                break;
            }
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0.00;
        for (Item item: itemList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        } 
        return valorTotal;
    }

    public void exibirItens(){
        for (Item item: itemList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Coca Cola", 10.00, 2);
        carrinhoDeCompras.adicionarItem("Arroz", 12.90, 1);
        carrinhoDeCompras.adicionarItem("Feijão", 8.00, 1);
        carrinhoDeCompras.adicionarItem("Alcatra", 35.50, 1);
        carrinhoDeCompras.adicionarItem("Alcatra", 35.50, 1);

        carrinhoDeCompras.removerItem("Alcatra");

        carrinhoDeCompras.exibirItens();
        double valorTotal = carrinhoDeCompras.calcularValorTotal();
        System.out.println("O Valor total da compra é de: R$ " + valorTotal);

        
    }
    
}
