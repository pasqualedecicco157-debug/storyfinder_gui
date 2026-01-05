package com.storyfinder.gui;

import javax.swing.*;

public class StoryPage extends JFrame {
    private JPanel StoryPagePanel;

    public StoryPage() {
        setContentPane(StoryPagePanel);
        setTitle("Storia");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
