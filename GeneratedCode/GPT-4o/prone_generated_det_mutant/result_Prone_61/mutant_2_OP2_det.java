class GetClassOnClassExample {
public String showBug() {
    Class < ? > clazz = String.class;
    String className = clazz.getClass().getName();
    className = clazz.getClass().getName();
    return className;
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}