import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Empire {
    Stormtrooper stormtrooper = new Stormtrooper();
    Palpatine palpatine = new Palpatine();
    ManuelDuBonSith manuel = new ManuelDuBonSith();
    Order64 order64 = new Order64(manuel);
    Order66 order66 = new Order66(manuel);
    Order67 order67 = new Order67(manuel);
    private JButton order66Button;
    private JPanel panel1;
    private JButton order67Button;
    private JButton order64Button1;

    public Empire() {
        order66Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stormtrooper.Execute(order66);
            }
        });
        order67Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                palpatine.Execute(order67);
            }
        });

        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (
                    e.getID() == KeyEvent.KEY_PRESSED && e.getKeyCode() == KeyEvent.VK_NUMPAD6 ) {
                        stormtrooper.Execute(order66);
                } else if (
                    e.getID() == KeyEvent.KEY_PRESSED && e.getKeyCode() == KeyEvent.VK_NUMPAD7 ) {
                        palpatine.Execute(order67);
                }
                return false;
            }
        });
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("Empire");
        frame.setContentPane(new Empire().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
