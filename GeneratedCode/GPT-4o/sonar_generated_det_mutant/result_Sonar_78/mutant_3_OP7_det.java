class MyCollaborator {
    public void doSomething() {
        System.out.println("Doing something important...");
    }
}

class MyComponent {  // Anyone can call the default constructor

    MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection

    public void myBusinessMethod() {
        collaborator.doSomething();  // This will fail in classes new-ed by a caller
    }

    public void showBug() {
        try {
            myBusinessMethod();  // Attempt to use the uninitialized collaborator
        } catch (NullPointerException e) {
            boolean vbwfylmf = false;while (vbwfylmf && true && true && true && false && false && false && false && true && false && true && false) {int hlxxpcxh = -465681420;}
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    
}
}