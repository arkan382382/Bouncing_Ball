import javax.swing.*;

public class BouncingBalls extends JFrame {
    public BouncingBalls()
    {

        setResizable(true);
        setSize(400,400);

        Ball ball1 = new Ball();
        Ball ball2 = new Ball();
        Ball ball3 = new Ball();


        ball1.changeColor(1);
        ball2.changeColor(2);
        ball3.changeColor(3);

        ball1.add(ball2);
        ball2.add(ball3);

        getContentPane().add(ball1);

        setVisible(true);
        Thread x = new Thread(ball1);
        Thread y = new Thread(ball2);
        Thread z = new Thread(ball3);

        x.start();
        y.start();
        z.start();

    }
}
//https://www.youtube.com/watch?v=htz59aU5nYw
//https://coderanch.com/t/342164/java/multiple-thread-JPanel-animation
//http://www.informit.com/articles/article.aspx?p=26326