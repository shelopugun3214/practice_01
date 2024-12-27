module ru.shelopugin.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shelopugin.task2 to javafx.fxml;
    exports ru.shelopugin.task2;
}