# Aircraft Stall Speed Calculator

1.Problem Statement

-Aircraft stall speed is an important parameter in aircraft performance and flight safety. Stall speed depends on factors such as aircraft weight, wing area, maximum lift coefficient, and air density.

-Calculating stall speed manually can take time and may lead to calculation errors, especially when atmospheric conditions such as altitude are also considered.

-The purpose of this project is to develop a simple Java-based Aircraft Stall Speed Calculator that allows the user to enter basic aircraft and flight parameters and calculates the stall speed using the standard aerodynamic stall-speed equation.

-The project also calculates atmospheric temperature and air density based on altitude using a simplified International Standard Atmosphere (ISA) model.

2.Project Scope

The project focuses on calculating the stall speed of an aircraft under different input conditions.

The user provides:

* Aircraft mass in kilograms
* Wing area in square metres
* Maximum lift coefficient (CLmax)
* Altitude in metres

The program then calculates:

* Aircraft weight
* Atmospheric temperature
* Atmospheric pressure
* Air density
* Stall speed in m/s
* Stall speed in km/h

The project is intended for basic aircraft performance analysis and educational use. It does not represent a complete aircraft flight-performance or flight-planning system.

3.Target Users

The main target users of this project are:

* Aerospace engineering students
* Aviation students
* Beginners learning aircraft performance calculations
* Students learning Java programming through engineering applications
* Users who want to perform basic stall-speed calculations

4.High-Level Features

A) Aircraft Data Module

The user enters the basic aircraft parameters:

* Mass
* Wing area
* Maximum lift coefficient

The module also calculates aircraft weight using:

Weight = Mass × Gravity

B). Atmosphere Module

The user enters the aircraft altitude.

The program calculates:

* Temperature
* Pressure
* Air density

The atmospheric calculations are based on a simplified ISA model for the lower atmosphere.

C) Stall Speed Calculation Module

The program calculates stall speed using:

Vs = √(2W / (ρ × S × CLmax))

Where:

* Vs = Stall speed in m/s
* W = Aircraft weight in N
* ρ = Air density in kg/m³
* S = Wing area in m²
* CLmax = Maximum lift coefficient
