import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private AtomicInteger count = new AtomicInteger(0);
    private boolean boo = false;

    public void incrementCount() {
        count.incrementAndGet();  
    }

    public synchronized void toggleBoo(){
        boo =!boo; 
    }

    public int showBug() {
        incrementCount();
        return count.get();
    }

    public void unreachableSwitch(){
        int x = 10; //non-final variable
        switch(x) { //the switch statement is unreachable since the variable x is non-final and can't be determined at runtime.
            case 5:
                break;
            case 10:
                System.out.println("This code is unreachable due to unreachable switch statement");
                break;
        }
        if(false){ //the if statement is unreachable since the condition is false
            System.out.println("This code is unreachable due to unreachable if statement");
        }
    }
}