import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main { 
    public static void main(String[] args) { 
        ExecutorService executor = Executors.newFixedThreadPool(2); // Thread pool with 2 threads 
 
        // Submit tasks to executor 
        executor.submit(new Task("1")); 
        executor.submit(new Task("2")); 
        executor.submit(new Task("3")); 
 
        executor.shutdown(); // Gracefully shut down the executor 
    } 
}