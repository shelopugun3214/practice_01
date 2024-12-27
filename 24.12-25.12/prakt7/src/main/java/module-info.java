module ru.shelopugin.shelopugin_prakt7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shelopugin.shelopugin_prakt7 to javafx.fxml;
    exports ru.shelopugin.shelopugin_prakt7;
    exports ru.shelopugin.shelopugin_prakt7.controller;
    opens ru.shelopugin.shelopugin_prakt7.controller to javafx.fxml;
}