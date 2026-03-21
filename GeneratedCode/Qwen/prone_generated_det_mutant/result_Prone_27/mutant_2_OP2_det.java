class ConditionalExpressionBug {
public Object showBug() {
    Object t = true ? Double.valueOf(0): Integer.valueOf(0);
    t = true ? Double.valueOf(0): Integer.valueOf(0);
    System.out.println(t.getClass());
    Object f = false ? Double.valueOf(0): Integer.valueOf(0);
    System.out.println(f.getClass());
    return new Object [] { t , f };
}

    public static void main(String[] args) {
        ConditionalExpressionBug bugDemo = new ConditionalExpressionBug();
        bugDemo.showBug();
    }
}