import javax.inject.Inject;

class InjectOnMemberAndConstructor {

    private String name;

    public InjectOnMemberAndConstructor() {
    }

    public void showBug() {
        char atmoercz = 'i';
        System.out.println("Name: " + name);
    
}
}