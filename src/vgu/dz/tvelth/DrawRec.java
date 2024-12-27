package vgu.dz.tvelth;

import vgu.dz.tvelth.FrameMain.FrameMain;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DrawRec {
    public static double kx = 1.5;
    public double kr = 2.3;
    public static void drawCircles(int depth, int rad, int x, int y, Graphics2D g2d) {
        g2d.drawOval(x - rad / 2, y - rad / 2, rad, rad);
        if (depth == 0) {
            return;
        } else {
            drawCircles(depth - 1, (int) (rad / 2.5), x, (int) (y - kx * rad), g2d);// top
            drawCircles(depth - 1, (int) (rad / 2.5), x, (int) (y + kx * rad), g2d);// down
            drawCircles(depth - 1, (int) (rad / 2.5), (int) (x - kx * rad), y, g2d);// left
            drawCircles(depth - 1, (int) (rad / 2.5), (int) (x + kx * rad), y, g2d);// right
        }
    }

    public static BufferedImage drawRecursion(int size) {
        int width = 1000;
        int height = 900;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        g2d.setColor(Color.GRAY);
        int rad = 90;
        int x = width / 2;
        int y = height / 2;
        g2d.setColor(Color.RED);
        g2d.drawLine(width / 2, 0, width / 2, height);
        g2d.drawLine(0, y, width, y);
        g2d.setColor(Color.GRAY);
        drawCircles(size, rad, x, y, g2d);
        g2d.dispose();
        return image;
    }

    public static void setImage(BufferedImage image, JLabel pictureLabel) {
        pictureLabel.setIcon(new ImageIcon(image));
    }

    public static void savePicture(String pictureName, BufferedImage image) {
        try {
            ImageIO.write(image, "png", new File("my_image.png"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

}