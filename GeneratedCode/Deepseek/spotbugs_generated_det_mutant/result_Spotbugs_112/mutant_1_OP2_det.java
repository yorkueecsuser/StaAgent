class BuggyCode {

    private String field;
public void showBug() {
    String field = "This is a local variable";
    field = "This is a local variable";
    System.out.println(field);
}
}