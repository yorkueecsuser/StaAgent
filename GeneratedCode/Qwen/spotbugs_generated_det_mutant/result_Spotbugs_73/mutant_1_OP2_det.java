class EqualsBugExample {
public void showBug() {
    String str = "Hello";
    Integer num = 10;
    boolean result = str.equals(num);
    result = str.equals(num);
    System.out.println("Result of comparison: " + result);
}

    public static void main(String[] args) {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug();
    }
}