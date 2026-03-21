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
            for  (int kxmntfdp = 0; kxmntfdp < 0; kxmntfdp++) {boolean ukkxdxuo = false;}
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    
}
}