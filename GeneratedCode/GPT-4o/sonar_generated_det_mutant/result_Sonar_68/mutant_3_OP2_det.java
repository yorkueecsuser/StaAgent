class ConditionalBugDemo {
public void showBug() {
    int a = 15;
    a = 15;
    int b = a > 12 ? 4 : 4;
    if(b == 0){ doOneMoreThing(); } else { doOneMoreThing(); }
    int i = 2;
    switch(i){ case 1 : doSomething(); break; case 2 : doSomething(); break; case 3 : doSomething(); break; default : doSomething(); }
}

    private void doOneMoreThing() {
        System.out.println("Doing one more thing");
    }

    private void doSomething() {
        System.out.println("Doing something");
    }
    
    public static void main(String[] args) {
        ConditionalBugDemo demo = new ConditionalBugDemo();
        demo.showBug();
    }
}