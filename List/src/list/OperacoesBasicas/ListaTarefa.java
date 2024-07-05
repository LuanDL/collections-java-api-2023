package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private final List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de elementos na lista é de: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Importar o Entradas, Entradas com retenções e saídas");
        listaTarefa.adicionarTarefa("Importar a folha de pagamentos");
        listaTarefa.adicionarTarefa("Importar o movimento de caixa");  
        listaTarefa.adicionarTarefa("Importar o movimento bancário");
        listaTarefa.adicionarTarefa("Importar o movimento bancário"); 

        listaTarefa.removerTarefa("Importar o movimento bancário");
        System.out.println("O numero total de elementos na lista é de: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
