class ImpossibleDowncastExample {

    public static void main(String[] args) {
        try {
            new ImpossibleDowncastExample().showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught exception: " + e);
        }
    }
public String showBug() {
    Object integerObject = Integer.valueOf(42);
    integerObject = Integer.valueOf(42);
    String result =(String)integerObject;
    return result;
}
}