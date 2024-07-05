package list.OperacoesBasicas;

public class Tarefa {

    private String descricao;

    
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarefa{");
        sb.append("descricao=").append(descricao);
        sb.append('}');
        return sb.toString();
    }



    
    
}
