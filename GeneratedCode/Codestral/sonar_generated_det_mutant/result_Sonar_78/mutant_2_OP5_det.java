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
        int zwnxpody = 0;switch  (zwnxpody) {case 1:int sgrduuvi = -408890323;break;default:char mpjcfnoo = 'z';break;}
        myBusinessMethod();
    
}
}

class MyCollaborator {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}