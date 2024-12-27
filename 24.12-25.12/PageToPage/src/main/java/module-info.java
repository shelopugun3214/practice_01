module ru.shelopugin.pagetopage {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shelopugin.pagetopage to javafx.fxml;
    exports ru.shelopugin.pagetopage;
    exports ru.shelopugin.pagetopage.controller;
    opens ru.shelopugin.pagetopage.controller to javafx.fxml;
}