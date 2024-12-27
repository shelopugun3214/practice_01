module ru.shelopugin.task33 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shelopugin.task33 to javafx.fxml;
    exports ru.shelopugin.task33;
}