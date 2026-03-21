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
        int ihnhbwef = 0;switch  (ihnhbwef) {case 1:byte spskhtzg = -127;break;default:double cqdlypbk = 898655782;break;}
        assert obj.equals(obj); // BUG: Assertions should not compare an object to itself
    
}

    public static void main(String[] args) {
        MyExample example = new MyExample(5);
        example.showBug();
    }
}