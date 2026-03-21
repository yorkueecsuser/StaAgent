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
        int jjtxlrxi = 0;switch  (jjtxlrxi) {case 1:int dklxbglh = 514892679;break;default:float umsvfhhy = 640114641;break;}
        myBusinessMethod();
    
}
}

class MyCollaborator {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}