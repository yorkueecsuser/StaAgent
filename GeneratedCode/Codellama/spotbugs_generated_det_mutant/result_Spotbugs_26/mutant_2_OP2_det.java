public enum MyEnum {
    VALUE1,
    VALUE2,
    VALUE3
}

class Main {
public static void main(String [] args){
    MyEnum myEnum = MyEnum.VALUE1;
    MyEnum otherEnum = MyEnum.VALUE2;
    otherEnum = MyEnum.VALUE2;
    System.out.println(myEnum.equals(otherEnum));
}

    public static void showBug() {
        MyEnum myEnum = MyEnum.VALUE1;
        MyEnum otherEnum = MyEnum.VALUE2;
        System.out.println(myEnum.equals(otherEnum));
    }
}