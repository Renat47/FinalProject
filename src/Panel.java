import java.awt.*;
import javax.swing.*;
public class Panel {
    public JPanel createPane(Color color) {
        JPanel pane = new JPanel(){

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(50, 50);
            }

        };
        pane.setBackground(color);
        return pane;
    }
}
