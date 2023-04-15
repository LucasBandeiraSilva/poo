package br.edu.senac;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField textMarca;
    @FXML TextField textAno;
    @FXML TextField textPreco;
    @FXML TextArea lista;

    List<Carro> carros = new ArrayList<>();

    public void cadastrar(){
        var carro = new Carro(
            textMarca.getText(), 
            Integer.valueOf(textAno.getText()), 
            new BigDecimal(textPreco.getText())
        );
        carros.add(carro);

        mostrarCarros();
    }

    private void mostrarCarros() {
        lista.clear();
        carros.forEach(c -> lista.appendText(c.toString() + "\n"));
    }

}


