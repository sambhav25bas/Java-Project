public class Aircraft {

    double mass;
    double wingArea;
    double clMax;

    Aircraft(double mass, double wingArea, double clMax) {
        this.mass = mass;
        this.wingArea = wingArea;
        this.clMax = clMax;
    }

    double getWeight() {
        return mass * 9.81;
    }
}