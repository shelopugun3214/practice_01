module ru.shelopugin.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shelopugin.task1 to javafx.fxml;
    exports ru.shelopugin.task1;
}