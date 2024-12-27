module ru.shelopugin.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shelopugin.task4 to javafx.fxml;
    exports ru.shelopugin.task4;
}