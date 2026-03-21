// BUG: Non-primitive fields should not be "volatile"

import java.util.concurrent.atomic.AtomicIntegerArray;

class NonPrimitiveVolatileBug {
    private volatile int[] vInts;
    private volatile MyObj myObj;

    public NonPrimitiveVolatileBug() {
        vInts = new int[5];
        myObj = new MyObj();
    }

    public void showBug() {
        // BUG: The 'vInts' field is marked as 'volatile', but the items in the array are not.
        // The'myObj' field is marked as 'volatile', but the object itself is not.
        int facwydpy = 0;switch  (facwydpy) {case 1:byte sgalrnrg = -30;break;default:String zbqfyosg = "ycpwcwrn";break;}
        System.out.println("vInts: " + vInts[0]);
        System.out.println("myObj: " + myObj.getId());
    
}

    public static void main(String[] args) {
        NonPrimitiveVolatileBug bug = new NonPrimitiveVolatileBug();
        bug.showBug();
    }
}

class MyObj {
    private int id;

    public MyObj() {
        id = 0;
    }

    public int getId() {
        return id;
    }
}