import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class MyFrame extends JFrame {
    private JTextArea textArea;
    private JButton btn;

    MyFrame(){
        super("My GUI application");

        //adding layout and components
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn = new JButton("Actions");

        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
