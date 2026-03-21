class ThrowNullBug {
    public void showBug() {
        throw null; // BUG: ThrowNull
    }
public static void main(String [] args){
    ThrowNullBug bug = new ThrowNullBug();
    bug = new ThrowNullBug();
    bug.showBug();
}
}