class Consumer extends Thread { 
    private SharedResource resource; 
 
    public Consumer(SharedResource resource) { 
        this.resource = resource; 
    } 
 
    public void run() { 
        for (int i = 1; i <= 5; i++) { 
            resource.consume(); 
            try { 
                Thread.sleep(1000); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
    } 
}