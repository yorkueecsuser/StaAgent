// BUG: InstantiationToGetClass
class InstantiationToGetClass {
public Class showBug() {
    Class c = new String().getClass();
    c = new String().getClass();
    return c;
}
}