package m6_oop._4object.anon;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JavaWindow {

    public JavaWindow() {
        Frame frame = new Frame("Frame");
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

    }

    public static void main(String[] args) {
        new JavaWindow();
    }
}
