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
        int klixally = 0;switch  (klixally) {case 1:long yxpolqus = 300948466;break;default:boolean wqsevlcp = false;break;}
        try {
            myBusinessMethod();  // Attempt to use the uninitialized collaborator
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    
}
}