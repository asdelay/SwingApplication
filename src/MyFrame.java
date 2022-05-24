import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;

public class MyFrame extends JFrame {
    private JTextArea textArea;
    private JButton btn;

    public static int i = 0;
    public int array(int a){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        return arr[a];
    }


    MyFrame(){
        super("My GUI application");

        setLayout(new BorderLayout()); //adding layout and components

        textArea = new JTextArea();
        btn = new JButton("Actions");

        add(textArea, BorderLayout.CENTER);     //добавляем текстовое поле, расположенное в центре
        add(btn, BorderLayout.SOUTH);       //добавляем кнопку внизу окна

        btn.addActionListener(new ActionListener(){     //adding action
            @Override       //аннотация
            public void actionPerformed(ActionEvent arg0){      //переопределяем метод
//                textArea.append("Button was pressed!\n");   //код обработки события (реакция на нажатие)


                textArea.append(array(i)+"");
                i++;

            }
        });


        setSize(600, 400);      //размер окна (ш, в)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //реакция на кнопку закрытия
        setVisible(true);       //делаем окно видимым
    }
}
