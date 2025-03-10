class SharedResource { 
    private int value; 
    private boolean available = false; 
 
    public synchronized void produce(int value) { 
        while (available) { 
            try { 
                wait(); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
        this.value = value; 
        available = true; 
        System.out.println("Produced: " + value); 
        notify(); 
    }
    public synchronized int consume() { 
        while (!available) { 
            try { 
                wait(); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
        available = false; 
        System.out.println("Consumed: " + value); 
        notify(); 
        return value; 
    }
}