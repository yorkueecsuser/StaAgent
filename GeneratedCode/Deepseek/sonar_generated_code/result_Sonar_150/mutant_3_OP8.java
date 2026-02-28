import java.util.Objects;

class MyClass {

    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that; // Mutation: Renaming variable 'that' to 'other'.
        try {
            other = (MyClass) obj; // Mutation: Renaming variable 'that' to 'other' and fixing cast.
        } catch (ClassCastException e) {
            return false; // Mutation: Adding return false to handle ClassCastException.
        }
        return value == other.value; // Mutation: Renaming variable 'that' to 'other'.
    }

    public int showBug() {
        Object other = new String();
        MyClass thisClass = new MyClass(10);
        thisClass.equals(other); // This will not throw ClassCastException due to mutation.
        return thisClass.value;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        System.out.println(myClass.showBug());
    }
}