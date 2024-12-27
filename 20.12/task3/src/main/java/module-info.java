module ru.shelopugin.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shelopugin.task3 to javafx.fxml;
    exports ru.shelopugin.task3;
}