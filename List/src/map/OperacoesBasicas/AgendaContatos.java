package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
          numeroPorNome = agendaContatoMap.get(nome);
          if (numeroPorNome == null) {
            System.out.println("Contato não encontrado na agenda.");
          }
        } else {
          System.out.println("A agenda de contatos está vazia.");
        }
        return numeroPorNome;
      }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Luan", 123456);
        agendaContatos.adicionarContato("Luan", 5665);
        agendaContatos.adicionarContato("Luan Dias", 1111111111);
        agendaContatos.adicionarContato("Luan DIO", 654987);
        agendaContatos.adicionarContato("Elisangela", 111111111);
        agendaContatos.adicionarContato("Luan", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Elisangela");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Luan DIO"));
    }
}
