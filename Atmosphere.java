public class Atmosphere {

    double altitude;

    Atmosphere(double altitude) {
        this.altitude = altitude;
    }

    double getTemperature() {

        return 288.15 - (0.0065 * altitude);
    }

    double getPressure() {

        double temperature = getTemperature();

        return 101325 *
                Math.pow(
                    temperature / 288.15,
                    9.80665 / (287.05 * 0.0065)
                );
    }

    double getDensity() {

        double pressure = getPressure();
        double temperature = getTemperature();

        return pressure / (287.05 * temperature);
    }
}