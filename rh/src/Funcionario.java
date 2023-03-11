import java.math.BigDecimal;

public abstract class Funcionario {
    
    protected int codigo;
    protected String nome;
    protected BigDecimal salario;

    public Funcionario(int codigo, String nome, BigDecimal salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public abstract BigDecimal calcularSalario();


}
