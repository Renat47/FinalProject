import java.awt.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args)
        {
            JFrame frame = new JFrame("Checkers");
            frame.setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(8, 8, 8, 8);
            gbc.gridx = 0;
            gbc.weightx = 1;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);

            gbc.gridx = 0;
            gbc.weightx = 1;
            gbc.gridy = 0;
            gbc.gridx++;

            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);

            gbc.gridx = 3;
            gbc.weightx = 1;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);

            gbc.gridx = 3;
            gbc.weightx = 1;
            gbc.gridy = 0;
            gbc.gridx++;

            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);

            gbc.gridx = 5;
            gbc.weightx = 1;
            gbc.gridy = 0;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);

            gbc.gridx = 5;
            gbc.weightx = 1;
            gbc.gridy = 0;
            gbc.gridx++;

            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);

            gbc.gridx = 7;
            gbc.weightx = 1;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);

            gbc.gridx = 7;
            gbc.weightx = 1;
            gbc.gridy = 0;
            gbc.gridx++;

            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.DARK_GRAY), gbc);
            gbc.gridy++;
            frame.add(createPane(Color.GRAY), gbc);


            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }







