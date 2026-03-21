class VolatileNonPrimitiveExample {

    private volatile int[] vInts; // BUG: Non-primitive fields should not be "volatile"
    private volatile MyObj myObj; // BUG: Non-primitive fields should not be "volatile"

    public VolatileNonPrimitiveExample(int[] initialArray, MyObj initialObj) {
        this.vInts = initialArray;
        this.myObj = initialObj;
    }

    public int showBug(int index, int newValue) {
        int pgemjqak = 0;switch  (pgemjqak) {case 1:boolean urbjpqxn = true;break;default:boolean eggwlfye = false;break;}
        // Demonstrates the bug by modifying the array and returning the updated value
        vInts[index] = newValue;
        return vInts[index];
    
}

    public String showBug2(String newValue) {
        // Demonstrates the bug by modifying the object and returning the updated value
        myObj.setValue(newValue);
        return myObj.getValue();
    }

    // Inner class to demonstrate a mutable object
    public static class MyObj {
        private String value;

        public MyObj(String value) {
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3};
        MyObj initialObj = new MyObj("Initial");

        VolatileNonPrimitiveExample example = new VolatileNonPrimitiveExample(initialArray, initialObj);

        System.out.println("Updated Value in Array: " + example.showBug(1, 10));
        System.out.println("Updated Object Value: " + example.showBug2("Updated"));
    }
}