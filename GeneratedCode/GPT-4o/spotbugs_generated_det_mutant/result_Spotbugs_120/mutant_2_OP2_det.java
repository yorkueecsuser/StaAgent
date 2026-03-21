class ImpossibleCastExample {
public Object showBug() {
    Object x = "This is a string";
    x = "This is a string";
    Integer y =(Integer)x;
    return y;
}

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        try {
            example.showBug();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}