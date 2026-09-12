public class Report {

    void display(
            Aircraft aircraft,
            Atmosphere atmosphere,
            double stallSpeed) {

        System.out.println();
        System.out.println(
            "================================"
        );

        System.out.println(
            "   AIRCRAFT STALL SPEED REPORT"
        );

        System.out.println(
            "================================"
        );

        System.out.printf(
            "Aircraft Mass   : %.2f kg%n",
            aircraft.mass
        );

        System.out.printf(
            "Wing Area       : %.2f m²%n",
            aircraft.wingArea
        );

        System.out.printf(
            "Maximum CL      : %.2f%n",
            aircraft.clMax
        );

        System.out.printf(
            "Altitude        : %.2f m%n",
            atmosphere.altitude
        );

        System.out.printf(
            "Temperature     : %.2f K%n",
            atmosphere.getTemperature()
        );

        System.out.printf(
            "Air Density     : %.4f kg/m³%n",
            atmosphere.getDensity()
        );

        System.out.printf(
            "Aircraft Weight : %.2f N%n",
            aircraft.getWeight()
        );

        System.out.printf(
            "Stall Speed     : %.2f m/s%n",
            stallSpeed
        );

        System.out.printf(
            "Stall Speed     : %.2f km/h%n",
            stallSpeed * 3.6
        );

        System.out.println(
            "================================"
        );
    }
}