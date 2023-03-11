import java.math.BigDecimal;

public final class Presidente extends Funcionario implements Autenticavel{

    protected BigDecimal valorDaCotaDeAcoes;

    public Presidente(int codigo, String nome, BigDecimal salario, BigDecimal valorDaCotaDeAcoes) {
        super(codigo, nome, salario);
        this.valorDaCotaDeAcoes = valorDaCotaDeAcoes;
    }

    @Override
    public BigDecimal calcularSalario() {
        return this.salario.add(valorDaCotaDeAcoes);
    }

    @Override
    public void autenticar() {
        System.out.println("Presidente logado");
    }
    
    
}
