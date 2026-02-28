class Singleton {

    private static Singleton singleton = new Singleton();
    private boolean condition = false;
    private boolean conditionFor = false;
    private boolean shouldRun = true;
    private int value = 1;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj) {
        Singleton singleton = (Singleton) obj;
        return singleton; // BUG: SingleMethodSingleton
    }

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }

    public void unreachableIfStatement() {
        if (false) {
            System.out.println("This is an unreachable If statement mutant.");
        }
    }

    public void unreachableWhileLoop() {
        while (false) {
            System.out.println("This is an unreachable While loop mutant.");
        }
    }

    public void unreachableForLoop() {
        for (int i = 0; false; i++) {
            System.out.println("This is an unreachable For loop mutant.");
        }
    }

    public void unreachableIfElseStatement() {
        if (false) {
            System.out.println("This is an unreachable If-Else statement mutant.");
        } else {
            System.out.println("This is an unreachable If-Else statement mutant.");
        }
    }

    public void unreachableSwitchStatement() {
        switch (0) {
            case 1:
                System.out.println("This is an unreachable Switch statement mutant.");
                break;
        }
    }

    public void unreachableGeneralRule() {
        if (condition) {
            System.out.println("This is an unreachable general rule mutant.");
        }
        while (conditionFor) {
            System.out.println("This is an unreachable general rule mutant.");
        }
        if (shouldRun) {
            System.out.println("This is an unreachable general rule mutant.");
        } else {
            System.out.println("This is an unreachable general rule mutant.");
        }
        switch (value) {
            case 1:
                System.out.println("This is an unreachable general rule mutant.");
                break;
        }
    }
}