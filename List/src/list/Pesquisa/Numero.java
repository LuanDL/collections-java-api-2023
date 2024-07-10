package list.Pesquisa;

public class Numero {
    private int  numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero{");
        sb.append(numero);
        sb.append('}');
        return sb.toString();
    }


}
