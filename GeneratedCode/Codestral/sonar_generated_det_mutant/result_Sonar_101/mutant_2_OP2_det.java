class ConditionallyExecutedCode {
public void showBug() {
    boolean a = false;
    a = false;
    if(a){ System.out.println("This line should never be printed"); }
}
}