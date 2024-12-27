module ru.shelopugin.task {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shelopugin.task to javafx.fxml;
    exports ru.shelopugin.task;
}