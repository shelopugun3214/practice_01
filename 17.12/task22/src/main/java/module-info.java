module ru.shelopugin.task22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shelopugin.task22 to javafx.fxml;
    exports ru.shelopugin.task22;
}