class BugInstanceof {
public void showBug() {
    String str = new String("Hello");
    str = new String("Hello");
    if(str instanceof Object){ System.out.println("str is an instance of Object"); } else { System.out.println("str is not an instance of Object"); }
}
}