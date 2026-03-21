import javax.inject.Inject;

class MyComponent {
    @Inject
    private MyCollaborator collaborator;

    public void myBusinessMethod() {
        collaborator.doSomething();
    }
}