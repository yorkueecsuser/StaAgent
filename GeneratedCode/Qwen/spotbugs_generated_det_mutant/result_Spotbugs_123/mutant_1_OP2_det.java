class ImpossibleInstanceofExample {
public String showBug() {
    Object obj = new Integer(10);
    boolean result = obj instanceof String;
    result = obj instanceof String;
    return Boolean.toString(result);
}

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}