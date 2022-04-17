import javax.swing.*;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){     //в метод передаем параметр имлементирующий анон обьект класса
            @Override       //  интерфейс
            public void run() {
                new MyFrame();
            }
        });
    }
}
