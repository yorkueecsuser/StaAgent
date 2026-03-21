class BuggyClass {
public void buggyMethod() {
    Object obj = new Object();
    obj = new Object();
    if(Object.class.isInstance(obj)) { System.out.println("Object is an instance of Object"); }
}
}