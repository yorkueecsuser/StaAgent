import java.util.Objects;

class MyClass {

    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj; // Mutation: "equals(Object obj)" test the argument's type
        return value == that.value;
    }

    public int showBug() {
        Object other = new String();
        MyClass thisClass = new MyClass(10);
        thisClass.equals(other); // This will throw ClassCastException
        if(false) { // Adding an unreachable switch statement
            int x = 0;
            switch(x) {
                case 1:
                    System.out.println("This switch case will never execute");
                    break;
                default:
                    System.out.println("This default case will never execute");
                    break;
            }
        }
        return thisClass.value; // This line will never execute normally
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        System.out.println(myClass.showBug());
    }
}