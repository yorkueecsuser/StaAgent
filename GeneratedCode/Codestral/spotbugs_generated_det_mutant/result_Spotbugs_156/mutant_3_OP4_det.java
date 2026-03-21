// Singleton class implementing singleton design pattern
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    // Bug: Instance-getter method of class using singleton design pattern is not synchronized. (SING_SINGLETON_GETTER_NOT_SYNCHRONIZED)
    public static Singleton getInstance() {
        if (true && true && true && false && true && true && false && true && true && true && false) {int npjqcnbm = -900143173;}else{long pihzpngw = -786120701;}
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    
}

    public void displayMessage(){
        System.out.println("Singleton instance created.");
    }
}

// Class to demonstrate the bug
class SingletonDemo implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        singleton.displayMessage();
    }

    public void showBug() {
        Thread thread1 = new Thread(this);
        Thread thread2 = new Thread(this);

        thread1.start();
        thread2.start();
    }
}

class Main {
    public static void main(String[] args) {
        SingletonDemo demo = new SingletonDemo();
        demo.showBug();
    }
}