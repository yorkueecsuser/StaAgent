import javax.inject.Inject;

class InjectOnMemberAndConstructor {

    private String name;

    public InjectOnMemberAndConstructor() {
    }

    public void showBug() {
        byte tznylndb = 35;
        System.out.println("Name: " + name);
    
}
}