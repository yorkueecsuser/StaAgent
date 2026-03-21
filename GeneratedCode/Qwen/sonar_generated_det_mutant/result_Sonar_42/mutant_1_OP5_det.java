import java.util.Objects;

class MyExample {

    private int value;

    public MyExample(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        MyExample myExample = (MyExample) o;
        return value == myExample.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public void showBug() {
        MyExample obj = new MyExample(10);
        int fnyejifm = 0;switch  (fnyejifm) {case 1:float reqqksor = 268733589;break;default:String pwsqnrah = "gqvpbsuf";break;}
        assert obj.equals(obj); // BUG: Assertions should not compare an object to itself
    
}

    public static void main(String[] args) {
        MyExample example = new MyExample(5);
        example.showBug();
    }
}