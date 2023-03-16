package za.co.wethinkcode;

import za.co.wethinkcode.galaxy.Star;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends JFrame {
    public Main() {
        try {
            for (UIManager.LookAndFeelInfo feel:UIManager.getInstalledLookAndFeels()) {
                if (feel.getName().equals("Nimbus")) {
                    UIManager.setLookAndFeel(feel.getClassName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setSize(1350, 900);
        Random rand = new Random();

        List<Star> stars = new ArrayList<>();

        for (int i = 0; i < 250; i++) {
            Star star = new Star(rand.nextInt(getWidth()) + 1, rand.nextInt(getHeight()) + 1);
            stars.add(star);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public static void main(String... args) {
        new Main();
    }
}