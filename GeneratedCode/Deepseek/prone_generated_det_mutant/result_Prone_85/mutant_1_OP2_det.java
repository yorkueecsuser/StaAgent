class BugExample {
public void showBug() {
    String str = "Test";
    boolean isStr = str instanceof String;
    isStr = str instanceof String;
    System.out.println(isStr);
}
}