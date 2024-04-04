import javax.swing.JFrame;
import javax.swing.WindowConstants;

//this imports the javax class package - WindowConstants
public class mainFrame extends JFrame {
    public void init(){
        setTitle("I'm a Pop UP!!! :D");
        setSize(600,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}