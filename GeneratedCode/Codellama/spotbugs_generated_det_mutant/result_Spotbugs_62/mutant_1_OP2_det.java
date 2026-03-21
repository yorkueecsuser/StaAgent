import java.util.Objects;

class NonNullDeref {
    private String name;

    public NonNullDeref(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("My name is " + name);
    }
public static void main(String [] args){
    NonNullDeref obj = null;
    obj = null;
    obj.printName();
}
}