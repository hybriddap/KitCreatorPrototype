import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
    private static int selection=0;
    public static void main(String[] args) {
        //Swing
        SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame("Kit Creator");
            frame.setSize(500,500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//            JPanel panel=new JPanel(new FlowLayout());
//            panel.add(new JButton("Button 1"));
//            panel.add(new JButton("Button 2"));
//            panel.add(new JButton("Button 3"));

            // Load the image
            int imageHeight=400;
            int imageWidth=400;
            ImageIcon icon1 = new ImageIcon("C:\\Users\\danie\\IdeaProjects\\KitCreatorPrototype\\src\\Imgs\\jersey1.png");
            ImageIcon icon2 = new ImageIcon("C:\\Users\\danie\\IdeaProjects\\KitCreatorPrototype\\src\\Imgs\\jersey2.png");
            ImageIcon icon3 = new ImageIcon("C:\\Users\\danie\\IdeaProjects\\KitCreatorPrototype\\src\\Imgs\\jersey3.png");
            ImageIcon icon4 = new ImageIcon("C:\\Users\\danie\\IdeaProjects\\KitCreatorPrototype\\src\\Imgs\\jersey4.png");
            ImageIcon img1 = new ImageIcon(icon1.getImage().getScaledInstance(imageWidth, imageHeight,  Image.SCALE_SMOOTH));
            ImageIcon img2 = new ImageIcon(icon2.getImage().getScaledInstance(imageWidth, imageHeight,  Image.SCALE_SMOOTH));
            ImageIcon img3 = new ImageIcon(icon3.getImage().getScaledInstance(imageWidth, imageHeight,  Image.SCALE_SMOOTH));
            ImageIcon img4 = new ImageIcon(icon4.getImage().getScaledInstance(imageWidth, imageHeight,  Image.SCALE_SMOOTH));
            ImageIcon[] imgs={img1,img2,img3,img4};
            JLabel imageLabel = new JLabel(imgs[0]);
            frame.add(imageLabel,BorderLayout.CENTER);

            Button rightBtn=new Button(">");
            Button leftBtn=new Button("<");
            frame.add(rightBtn, BorderLayout.EAST);
            frame.add(leftBtn, BorderLayout.WEST);

            leftBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(selection<1)
                    {
                        return;
                    }
                    selection--;
                    imageLabel.setIcon(imgs[selection]);
                }
            });
            rightBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(selection>=imgs.length-1)
                    {
                        return;
                    }
                    selection++;
                    imageLabel.setIcon(imgs[selection]);
                }
            });

            frame.setVisible(true);
        });
    }
}