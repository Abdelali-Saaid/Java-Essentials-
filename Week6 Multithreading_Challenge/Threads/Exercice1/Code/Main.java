public class Main { 
    public static void main(String[] args) { 
        EvenCounter evenCounter = new EvenCounter(); // Creates an instance of the EvenCounter class, which extends Thread 
        OddCounter oddCounter = new OddCounter(); // Creates an instance of the OddCounter class, which extends Thread 
        evenCounter.start(); // Starts the execution of the evenCounter thread.
        oddCounter.start(); // Starts the execution of the oddCounter thread.
    } 
} 

