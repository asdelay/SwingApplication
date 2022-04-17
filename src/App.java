import javax.swing.*;
import static javax.swing.SwingUtilities.*;

public class App {
    public static void main(String[] args) {
//        JFrame frame = new JFrame("My First GUI Application");
//        frame.setSize(600, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
        invokeLater(new Runnable(){     //в метод передаем параметр имлементирующий анон обьект класса
            @Override       //  интерфейс
            public void run() {
                JFrame frame = new JFrame("My First GUI Application");
                frame.setSize(600, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
