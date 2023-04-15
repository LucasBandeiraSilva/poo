module br.edu.senac {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.senac to javafx.fxml;
    exports br.edu.senac;
}
