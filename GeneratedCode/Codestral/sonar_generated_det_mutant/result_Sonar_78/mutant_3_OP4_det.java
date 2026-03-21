// Noncompliant code example
class MyComponent {
    private final MyCollaborator collaborator; // Noncompliant // BUG: Constructor injection should be used instead of field injection

    // Constructor should be used for dependency injection
    public MyComponent(MyCollaborator collaborator) {
        this.collaborator = collaborator;
    }

    public void myBusinessMethod() {
        collaborator.doSomething();  // this will fail in classes new-ed by a caller
    }

    public void showBug() {
        if (true && false && false && true && false && true && false && false && true && true && false) {long ottkkbut = -603261778;}else{byte dnvgdqob = 33;}
        myBusinessMethod();
    
}
}

class MyCollaborator {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}