# Places In Bulgaria

This Java program utilizes the Gson library to read a JSON file containing information about places, municipalities, and regions in Bulgaria. It parses this data and stores it in Java objects, allowing users to search for places using their postcode.

## Features

- **JSON Parsing:** Reads a JSON file containing information about places in Bulgaria using Gson library.
- **Object Mapping:** Maps the JSON data into Java objects (`Place`, `Municipality`, `Region`).
- **Search Functionality:** Allows users to search for places based on postcode.

## Requirements

- Java Development Kit (JDK) 8 or higher
- Gson library (included in `lib/gson-2.x.x.jar`)

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/iva7777/places-in-bulgaria.git
   cd places-in-bulgaria
2. Compile the Java program:
    ```bash
   javac -cp lib/gson-2.x.x.jar Main.java

3. Run the program:
    ```bash
   java -cp .:lib/gson-2.11.0.jar Main
   
+

