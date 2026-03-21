class ImpossibleDowncastExample {
public void showBug() {
    Object obj = new Integer(10);
    String str =(String)obj;
    str =(String)obj;
    System.out.println(str);
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}