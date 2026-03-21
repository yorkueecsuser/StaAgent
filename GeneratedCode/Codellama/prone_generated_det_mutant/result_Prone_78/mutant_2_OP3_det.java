import javax.inject.Inject;

class InjectOnMemberAndConstructor {

    private String name;

    public InjectOnMemberAndConstructor() {
    }

    public void showBug() {
        if (true && true && true && true && false && false && true && true && true && false && false) {long onbfqxbs = -607755723;}
        System.out.println("Name: " + name);
    
}
}