import java.util.Objects;

class MyClass {

    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj; 
        return value == that.value;
    }

    public int showBug() {
        Object other = new String();
        MyClass thisClass = new MyClass(10);
        thisClass.equals(other); 
        return thisClass.value; 
    }

    public void mutant() {
        while (false) {
            int x = 0;
        }
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        myClass.mutant();
        System.out.println(myClass.showBug());
    }
}