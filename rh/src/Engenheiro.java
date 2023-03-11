import java.math.BigDecimal;

public class Engenheiro extends Funcionario{

    protected Departamento departamento;
    protected String crea;

    public Engenheiro(int codigo, String nome, BigDecimal salario, Departamento departamento, String crea) {
        super(codigo, nome, salario);
        this.departamento = departamento;
        this.crea = crea;
    }

    @Override
    public BigDecimal calcularSalario() {
        return this.salario.multiply(new BigDecimal(1.5));
    }


    
}
