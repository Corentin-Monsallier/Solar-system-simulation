public class CelestialBody {
    public static final double GRAVITATIONAL_CONSTANT = 6.67e-11;

    public String name;
    public double mass;
    public double distanceSun;
    public int circleDistanceSun;
    public double radius;
    public int circleRadius;
    public int positionX;
    public int positionY;
    public double velocityX;
    public double velocityY;
    public double accelerationX;
    public double accelerationY;

    CelestialBody() {
    }
    CelestialBody(String name, double mass, double distanceSun, int circleDistanceSun, double radius, int circleRadius, int positionX, int positionY, double velocityX, double velocityY, double accelerationX, double accelerationY) {
        this.name = name;
        this.mass = mass;
        this.distanceSun = distanceSun;
        this.circleDistanceSun = circleDistanceSun;
        this.radius = radius;
        this.circleRadius = circleRadius;
        this.positionX = positionX;
        this.positionY = positionY;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.accelerationX = accelerationX;
        this.accelerationY = accelerationY;
    }

    public void updatePosition(int updatePositionX, int updatePositionY) {
        this.positionX = updatePositionX;
        this.positionY = updatePositionY;
    }
    public void updateVelocity(double updateVelocityX, double updateVelocityY) {
        this.velocityX = updateVelocityX;
        this.velocityY = updateVelocityY;
    }
    public void updateAcceleration(double updateAccelerationX, double updateAccelerationY) {
        this.accelerationX = updateAccelerationX;
        this.accelerationY = updateAccelerationY;
    }
    public void update() {
        double force = GRAVITATIONAL_CONSTANT;
    }

    public String toString() {
        return name + " {Mass = " + mass + " - Radius = " + radius + " - Displayed radius = " + circleRadius + " - Current position = (x = " + positionX + ", y = " + positionY + ") - Current velocity = (x = " + velocityX + ", y = " + velocityY + ") - Current acceleration = (x = " + accelerationX + ", y = " + accelerationY + ") }";
    }
}
