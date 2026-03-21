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
        int ksbhkdwg = 0;switch  (ksbhkdwg) {case 1:String jfvsibwe = "qeryhdpt";break;default:char dubuwdrq = 'd';break;}
        assert obj.equals(obj); // BUG: Assertions should not compare an object to itself
    
}

    public static void main(String[] args) {
        MyExample example = new MyExample(5);
        example.showBug();
    }
}