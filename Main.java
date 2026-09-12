import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
            "AIRCRAFT STALL SPEED CALCULATOR"
        );

        System.out.println();

        System.out.print(
            "Enter aircraft mass (kg): "
        );

        double mass = sc.nextDouble();

        System.out.print(
            "Enter wing area (m²): "
        );

        double wingArea = sc.nextDouble();

        System.out.print(
            "Enter maximum lift coefficient: "
        );

        double clMax = sc.nextDouble();

        System.out.print(
            "Enter altitude (m): "
        );

        double altitude = sc.nextDouble();

        if (mass <= 0 ||
            wingArea <= 0 ||
            clMax <= 0 ||
            altitude < 0) {

            System.out.println(
                "Invalid input!"
            );

            sc.close();
            return;
        }

        Aircraft aircraft =
            new Aircraft(
                mass,
                wingArea,
                clMax
            );

        Atmosphere atmosphere =
            new Atmosphere(altitude);

        StallCalculator calculator =
            new StallCalculator();

        double stallSpeed =
            calculator.calculateStallSpeed(
                aircraft,
                atmosphere
            );

        Report report =
            new Report();

        report.display(
            aircraft,
            atmosphere,
            stallSpeed
        );

        sc.close();
    }
}