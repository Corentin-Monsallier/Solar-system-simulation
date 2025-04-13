import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class VisualPanel extends JPanel {
    public List<CelestialBody> addBodies() {
        CelestialBody sun = new CelestialBody("Sun", 1.989e30, 0, 0, 6.963e8, 20, 400, 300, 0, 0, 0, 0);
        CelestialBody mercury = new CelestialBody("Mercury", 3.285e23, 5.791e10, 40, 2.44e6, 3, 400, 300, 0, 0, 0, 0);
        CelestialBody venus = new CelestialBody("Venus", 4.867e24, 1.082e11, 80, 6.052e6, 6, 400, 300, 0, 0, 0, 0);
        CelestialBody earth = new CelestialBody("Earth", 5.973e24, 1.496e11, 120, 6.378e6, 6, 400, 300, 0, 0, 0, 0);
        CelestialBody mars = new CelestialBody("Mars", 6.39e23, 2.279e11, 160, 3.39e6, 4, 400, 300, 0, 0, 0, 0);
        CelestialBody jupiter = new CelestialBody("Jupiter", 1.989e27, 7.785e11, 200, 6.991e7, 12, 400, 300, 0, 0, 0, 0);
        CelestialBody saturn = new CelestialBody("Saturn", 5.683e26, 1.434e12, 240, 5.823e7, 10, 400, 300, 0, 0, 0, 0);
        CelestialBody uranus = new CelestialBody("Uranus", 8.681e25, 2.871e12, 280, 2.536e7, 7, 400, 300, 0, 0, 0, 0);
        CelestialBody neptune = new CelestialBody("Neptune", 1.024e26, 4.495e12, 320, 2.462e7, 7, 400, 300, 0, 0, 0, 0);

        List<CelestialBody> bodies = new ArrayList<>();
        bodies.add(sun);
        bodies.add(mercury);
        bodies.add(venus);
        bodies.add(earth);
        bodies.add(mars);
        bodies.add(jupiter);
        bodies.add(saturn);
        bodies.add(uranus);
        bodies.add(neptune);

        return (bodies);
    }
}
