class ImpossibleDowncastBug {
public void showBug() {
    Object object = new Object();
    String str =(String)object;
    str =(String)object;
}
}