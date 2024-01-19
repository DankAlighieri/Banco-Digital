import java.util.ArrayList;
import java.util.List;

public class Banco implements IBanco{
    private String nome;
    private List<Conta> contasList = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getContas() {
        return contasList;
    }
    public void setContas(List<Conta> contas) {
        this.contasList = contas;
    }
    @Override
    public String toString() {
        return "Contas do banco: \n" + contasList + '}';
    }

    @Override
    public void adicionarConta(Conta conta) {
        contasList.add(conta);
    }

    @Override
    public void imprimirListaContas() {
        System.out.println(String.format("O banco %s possui atualmente %d contas, que são, respectivamente:", this.nome, contasList.size()));
        for (Conta conta : contasList) {
            System.out.println(String.format("{Agencia: %d \nNumero: %d \nTitular: %s}", conta.getAgencia(), conta.getNumero(), conta.cliente.getNome()));
        }
    }
}
