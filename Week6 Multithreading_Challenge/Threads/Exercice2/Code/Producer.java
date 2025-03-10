class Producer extends Thread { 
    private SharedResource resource; 
 
    public Producer(SharedResource resource) { 
        this.resource = resource; 
    } 
 
    public void run() { 
        for (int i = 1; i <= 5; i++) { 
            resource.produce(i); 
            try { 
                Thread.sleep(1000); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
    } 
} 