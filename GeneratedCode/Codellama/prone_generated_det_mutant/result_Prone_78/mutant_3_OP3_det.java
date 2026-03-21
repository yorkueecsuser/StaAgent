import javax.inject.Inject;

class InjectOnMemberAndConstructor {

    private String name;

    public InjectOnMemberAndConstructor() {
    }

    public void showBug() {
        if (true && true && true && true && false && false && true && false && false && true && false) {int nyhmudtc = 196629129;}
        System.out.println("Name: " + name);
    
}
}