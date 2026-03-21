class ImpossibleDowncastBug {
public void showBug() {
    Object object = new Object();
    object = new Object();
    String str =(String)object;
}
}