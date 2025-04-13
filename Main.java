import java.util.List;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gravity Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setVisible(true);

        VisualPanel list = new VisualPanel();
        List<CelestialBody> bodies = list.addBodies();

        for (CelestialBody body : bodies) {
            System.out.println(body);
        }
    }
}
