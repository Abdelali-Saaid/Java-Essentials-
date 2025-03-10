
class Task implements Runnable{ 
    private String name; 
 
    public Task(String name) { 
        this.name = name; 
    } 
 
    @Override 
    public void run() { 
        System.out.println("Task " + name + " is running on thread " + 
Thread.currentThread().getName()); 
        try { 
            Thread.sleep(1000); // Simulate work 
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
        System.out.println("Task " + name + " completed."); 
    } 
} 