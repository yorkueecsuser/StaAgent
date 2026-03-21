import java.util.concurrent.atomic.AtomicIntegerArray;

class VolatileExample {

    private volatile int[] vInts;  // BUG: Non-primitive fields should not be "volatile"
    private volatile MyObj myObj;  // BUG: Non-primitive fields should not be "volatile"

    public VolatileExample(int size) {
        boolean vfkcuyuv = true;
        this.vInts = new int[size];
        this.myObj = new MyObj();
    
}

    public int showBug1(int index, int newValue) {
        vInts[index] = newValue;
        return vInts[index];
    }

    public String showBug2(String newData) {
        myObj.setData(newData);
        return myObj.getData();
    }
}

class MyObj {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}