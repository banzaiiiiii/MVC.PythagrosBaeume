import javafx.event.EventHandler;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class PythagorasController {

    private PythagorasModel theModel = new PythagorasModel();

    @FXML
    private Button exitBtn;
    @FXML
    private Button creationBtn;
    @FXML
    private Button downloadBtn;
    @FXML
    private TextField seiteAText;
    @FXML
    private TextField seiteBText;
    @FXML
    private TextField minimaleGroesseText;
    @FXML
    private TextField baumTiefeText;
    @FXML
    private TextField farbschemaBox;

    //test
    @FXML
    private Text outputTest;

    public void handleExit(){
        exitBtn.setOnAction(event ->
            Platform.exit()
        );
    }

    public void handleCreation(){}
    public void handleDownload(){}
    public void handleColorPick1(){}


    public void handleSeitenInput(){
        seiteAText.setOnAction(e ->
                theModel.setSeiteA(Double.parseDouble(seiteAText.getText()))
        );
        seiteBText.setOnAction(e ->
            theModel.setSeiteB(Double.parseDouble(seiteBText.getText()))
        );

    outputTest.setText(outputTest.getText() + theModel.getSeiteA());

    }

    public void handleMinimaleGroesseInput(){}
    public void handleBaumTiefeInput(){}
    public void handleFarbschemaInput(){}




}
