import java.awt.*;

public class Backgroung {
     private Color background;

     protected Backgroung() {
         this.background = new Color(
                 (int) (Math.random() * 255),
                 (int) (Math.random() * 255),
                 (int) (Math.random() * 255)
         );
     }

    public Color getBackground() {
         return background;
    }

}
