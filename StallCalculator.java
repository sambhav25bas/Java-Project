public class StallCalculator {

    double calculateStallSpeed(
            Aircraft aircraft,
            Atmosphere atmosphere) {

        double weight = aircraft.getWeight();

        double density =
                atmosphere.getDensity();

        double area =
                aircraft.wingArea;

        double clMax =
                aircraft.clMax;

        double stallSpeed =
                Math.sqrt(
                    (2 * weight) /
                    (density * area * clMax)
                );

        return stallSpeed;
    }
}