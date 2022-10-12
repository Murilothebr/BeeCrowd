import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Produto produto;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        produto = new Produto();
    }

    public void executar() {
        produto.setCodigo(entrada.nextInt());
        produto.setQuantidade(entrada.nextInt());

        System.out.println(String.format("Total: R$ %.2f", produto.getPrecoTotal()));
    }
}

class Produto {
    private int codigo;
    private int quantidade;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float preco() {
        Hashtable<Integer, Float> numbers = new Hashtable<Integer, Float>();
        numbers.put(1, 4.0f);
        numbers.put(2, 4.5f);
        numbers.put(3, 5.0f);
        numbers.put(4, 2.0f);
        numbers.put(5, 1.50f);
        return numbers.getOrDefault(codigo, 0f);
    }

    public float getPrecoTotal() {
        return preco() * quantidade;
    }
}
