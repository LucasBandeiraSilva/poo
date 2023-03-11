import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        Presidente joao = new Presidente(
                12, 
                "Joao", 
                new BigDecimal(5), 
                new BigDecimal(100000)
            );

        joao.calcularSalario();
        if (joao instanceof Presidente) {
            System.out.println("João é presidente");
        }

        Engenheiro pedro = new Engenheiro(
                22, 
                "Pedro", 
                new BigDecimal(5), 
                Departamento.COMERCIAL,
                "234567"
        );

        Engenheiro maria = new Engenheiro(
            23, 
            "Maria", 
            new BigDecimal(5), 
            Departamento.COMERCIAL,
            "3216548"
        );

        Gerente marcia = new Gerente(
            25,
            "Marcia",
            new BigDecimal(5000),
            "Producao",
            new BigDecimal(3000)
        );

        var folhaDePagamento = new FolhaDePagamento();
        folhaDePagamento.registrar(joao);
        folhaDePagamento.registrar(pedro);
        folhaDePagamento.registrar(maria);
        folhaDePagamento.registrar(marcia);

        folhaDePagamento.login(marcia);
        folhaDePagamento.login(joao);
        folhaDePagamento.login(new Auditor());
        //folhaDePagamento.login(pedro);


        System.out.println(folhaDePagamento.getTotalDaFolhaDePagamento());
    }
}
