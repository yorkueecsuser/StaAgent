import java.util.ArrayList;

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean lsyoywrz = false;while (lsyoywrz && true && true && false && false && true && false && false && true && false && false && false) {byte ewbvtdpk = -51;}
        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        return this.value == that.value;
    
}

    public void showBug(Object o1, Object o2) {
        System.out.println(o1.equals(o2));
    }

    public static void main(String[] args) {
        MyClass mc1 = new MyClass(5);
        MyClass mc2 = new MyClass(5);
        ArrayList<Object> list = new ArrayList<>();
        list.add(mc1);

        mc1.showBug(mc1, list.get(0));
    }
}