package vgu.dz.tvelth;

import vgu.dz.tenth.Student;
import vgu.dz.tvelth.FrameMain.FrameMain;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawRec {
    public static List<Color> getAllColors(){
        List<Color> colors = new ArrayList<Color>();
        for (int i = 0 ; i < 256; i++){
            for (int j = 0 ; j < 256 ; j++){
                for (int k = 0 ; k < 256 ; k++){
                    colors.add(new Color(i,j,k));
                }
            }
        }
        return colors;
    }
    public static Color randomColor(List<Color> colors){
        Random randomizer = new Random();
        return colors.get(randomizer.nextInt(colors.size()));
    }
    public static void drawCircles(int depth, int rad, int x, int y, Graphics2D g2d,List<Color> colors,double kx,double kr) {
        g2d.setColor(randomColor(colors));
        g2d.drawOval(x - rad / 2, y - rad / 2, rad, rad);
        if (depth == 0) {
            return;
        } else {
            drawCircles(depth - 1, (int) (rad / kr), x, (int) (y - kx * rad), g2d,colors,kx,kr);// top
            drawCircles(depth - 1, (int) (rad / kr), x, (int) (y + kx * rad), g2d,colors,kx,kr);// down
            drawCircles(depth - 1, (int) (rad / kr), (int) (x - kx * rad), y, g2d,colors,kx,kr);// left
            drawCircles(depth - 1, (int) (rad / kr), (int) (x + kx * rad), y, g2d,colors,kx,kr);// right
        }
    }
    public static void drawXLine(Graphics2D g2d, int width, int height) {
        g2d.setColor(Color.RED);
        g2d.drawLine(width / 2, 0, width / 2, height);
        g2d.drawLine(0, height / 2, width, height / 2);
    }
    public static BufferedImage drawRecursion(int size,boolean randomColor,boolean xLine,int radius,double kx,double kr) {
        int width = 1000;
        int height = 900;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        g2d.setColor(Color.GRAY);
        if (xLine) {
            drawXLine(g2d, width, height);
        }
        List<Color> colors = new ArrayList<Color>();
        if (randomColor) {
            colors= getAllColors();
        }
        else {
            colors.add(new Color(192,192,192));
        }
        System.out.println("рисовка");
        drawCircles(size, radius, width / 2, height/2, g2d,colors,kx,kr);
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
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

}