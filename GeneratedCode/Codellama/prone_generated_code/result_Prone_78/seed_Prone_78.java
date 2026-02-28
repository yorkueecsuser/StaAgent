import javax.inject.Inject;

class InjectOnMemberAndConstructor {

    private String name;

    public InjectOnMemberAndConstructor() {
    }

    public void showBug() {
        System.out.println("Name: " + name);
    }
}