import java.math.BigDecimal;

public class Gerente extends Funcionario implements Autenticavel{
    
    protected String area;
    protected BigDecimal bonus;
    
    public Gerente(int codigo, String nome, BigDecimal salario, String area, BigDecimal bonus) {
        super(codigo, nome, salario);
        this.area = area;
        this.bonus = bonus;
    }

    @Override
    public BigDecimal calcularSalario() {
        return this.salario.add(bonus);
    }

    @Override
    public void autenticar() {
        System.out.println("Gerente logado");
    }

}
