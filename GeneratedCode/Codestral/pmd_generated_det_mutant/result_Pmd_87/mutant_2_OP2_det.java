class Foo {
public void showBug() {
    ClassLoader cl = Bar.class.getClassLoader();
    cl = Bar.class.getClassLoader();
    System.out.println(cl);
}

    public static class Bar { }
}