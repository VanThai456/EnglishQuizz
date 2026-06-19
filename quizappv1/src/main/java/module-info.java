module com.nvt.quizappv1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nvt.quizappv1 to javafx.fxml;
    exports com.nvt.quizappv1;
}
