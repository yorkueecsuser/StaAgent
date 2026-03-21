class Main {
    static int a = 12;
    static int i = 4;
    static int b = 0;

    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    if(b == 0){ doOneMoreThing(); } else { doOneMoreThing(); }
    int b = a > 12 ? 4 : 4;
    b = a > 12 ? 4 : 4;
    switch(i){ case 1 : doSomething(); break; case 2 : doSomething(); break; case 3 : doSomething(); break; default : doSomething(); }
}

    public static void doOneMoreThing() {
        System.out.println("Doing one more thing");
    }

    public static void doSomething() {
        System.out.println("Doing something");
    }
}