# OnlineCabBookingLLD
LLD code for online cab booking app

# Online Cab Booking System

🚖 A Low-Level Design (LLD) for an online cab booking application developed in Java using the Strategy Design Pattern.

## Table of Contents

- [Overview](#overview)
- [Core Components](#core-components)
- [Design Patterns](#design-patterns)
- [Trip Lifecycle](#trip-lifecycle)
- [Getting Started](#getting-started)
- [Technologies Used](#technologies-used)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview

This project provides a modular and scalable architecture for an online cab booking system. It includes essential functionalities like managing riders and drivers, handling trip creation, and applying different pricing strategies for fare calculation.

## Core Components

1. **RiderManager**: 
   - Manages the collection of riders and ensures centralized access through the Singleton design pattern.
   
2. **DriverManager**: 
   - Handles the collection of drivers, ensuring efficient management of driver availability and assignments.

3. **TripManager**: 
   - Responsible for creating trips by pairing available drivers with riders. It calculates the trip price using a chosen pricing strategy.

## Design Patterns

### Pricing Strategy Pattern

- **PriceStrategy Interface**: 
  - A flexible interface that allows for different pricing implementations.
  
- **Implementations**:
  - **BasicPricingStrategy**: Calculates trip costs based on distance.
  - **SurgePricingStrategy**: Adjusts pricing based on demand or other factors.

## Trip Lifecycle

1. A trip is initiated in `TripManager` by finding an available driver.
2. The final trip price is calculated using the selected pricing strategy.
3. The trip is then assigned to the rider and driver.

This design provides modularity and scalability, allowing easy addition of new features such as promotional pricing or driver ratings in the future.

## Getting Started

To get a copy of this project up and running on your local machine for development and testing purposes, follow these steps:

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven or Gradle (for dependency management)

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/arnabi_62/OnlineCabBookingLLD.git
   cd OnlineCabBookingLLD
   ```
2. **Run the application:**

    Ensure your IDE is set up to run Java applications or use the command line to execute the main class.  

## Technologies Used

- **Java**: The primary programming language used for developing the application.
- **Design Patterns**: Implementation of the Singleton and Strategy design patterns for efficient management and modularity.
- **IDE**: Developed using Eclipse or IntelliJ IDEA.
- **Version Control**: Managed using Git for tracking changes and collaboration.

## Usage

- **Adding a Rider**: Use the `RiderManager` to add new riders.
- **Adding a Driver**: Use the `DriverManager` to add new drivers.
- **Creating a Trip**: Use the `TripManager` to initiate trips based on rider requests.
- **Changing Pricing Strategy**: You can easily implement new pricing strategies by creating classes that implement the `PriceStrategy` interface.

## Contributing

Contributions are welcome! Please read the [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Thank you to all the contributors who helped build this project!
- Inspiration from various online resources and design patterns.

