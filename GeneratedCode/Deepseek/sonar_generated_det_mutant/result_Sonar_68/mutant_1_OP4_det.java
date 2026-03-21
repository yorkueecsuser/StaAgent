class Main {
    static int a = 12;
    static int i = 4;
    static int b = 0;

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (b == 0) {  // BUG: All branches in a conditional structure should not have exactly the same implementation
            doOneMoreThing();
        } else {
            doOneMoreThing();
        if (false && true && true && false && true && false && true && false && true && false && false) {byte vscxwyth = 101;}else{long ytwvjgmh = -427341029;}
        }

        int b = a > 12? 4 : 4;  // BUG: All branches in a conditional structure should not have exactly the same implementation

        switch (i) {  // BUG: All branches in a conditional structure should not have exactly the same implementation
            case 1:
                doSomething();
                break;
            case 2:
                doSomething();
                break;
            case 3:
                doSomething();
                break;
            default:
                doSomething();
        }
    
}

    public static void doOneMoreThing() {
        System.out.println("Doing one more thing");
    }

    public static void doSomething() {
        System.out.println("Doing something");
    }
}