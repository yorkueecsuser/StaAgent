class ImpossibleCastExample {

    public Object getObject() {
        return new Integer(10);
    }
public void showBug() {
    Object obj = getObject();
    obj = getObject();
    String str =(String)obj;
    System.out.println(str);
}

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        example.showBug();
    }
}