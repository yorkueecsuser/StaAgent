class MyCollaborator {
    void doSomething() {
        System.out.println("I'm doing something");
    }
}

class MyComponent {
    private final MyCollaborator collaborator;

    public MyComponent(MyCollaborator collaborator) { // BUG: Constructor injection should be used instead of field injection
        this.collaborator = collaborator;
    }

    public void myBusinessMethod() {
        collaborator.doSomething(); // this will throw NullPointerException
    }

    public void showBug() {
        myBusinessMethod();
    }
}