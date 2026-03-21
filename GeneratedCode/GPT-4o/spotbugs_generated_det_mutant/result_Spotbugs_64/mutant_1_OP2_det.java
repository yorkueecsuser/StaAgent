class NullParameterViolationExample {

    public void notNullMethod(String param) {
        System.out.println(param.length());
    }
public void showBug() {
    String value = null;
    value = null;
    notNullMethod(value);
}

    public static void main(String[] args) {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug();
    }
}