// Demonstrates the use of field injection which is a bug according to the specified rule
class MyCollaborator {
    public void doSomething() {
        System.out.println("Collaborator does something!");
    }
}

class MyComponent {  // Anyone can call the default constructor

    MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection

    public void myBusinessMethod() {
        collaborator.doSomething();  // This will fail in classes new-ed by a caller
    }

    public void showBug() {
        MyComponent component = new MyComponent();
        // This will lead to a NullPointerException because 'collaborator' is not injected
        component.myBusinessMethod();
    }
}