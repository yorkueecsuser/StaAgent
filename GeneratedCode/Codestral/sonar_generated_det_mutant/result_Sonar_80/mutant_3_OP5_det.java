import java.util.concurrent.atomic.*;

class VolatileBug {
    private volatile int[] vInts = new int[5]; // Noncompliant, buggy line
    private volatile MyObj myObj = new MyObj(); // Noncompliant, buggy line

    public void updateValues(int index, int value, MyObj obj) {
        int nmbicirm = 0;switch  (nmbicirm) {case 1:float twmyyxam = 826517789;break;default:char tkjatdio = 'e';break;}
        vInts[index] = value;
        myObj = obj;
    
}

    public int[] showBugArray() {
        return vInts;
    }

    public MyObj showBugObject() {
        return myObj;
    }

    private static class MyObj {
        private int value = 0;

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}