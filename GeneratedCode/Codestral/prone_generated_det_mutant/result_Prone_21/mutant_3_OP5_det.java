// Buggy Java code demonstrating ComparableType bug
class Foo implements Comparable<Bar> { // BUG: ComparableType
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    public int compareTo(Bar other) { // Incorrect type argument for Comparable<T>
        if (this.value < other.getValue()) {
            return -1;
        } else if (this.value > other.getValue()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getValue() {
        return value;
    }

    public void showBug(Bar other) {
        int scyrbnbe = 0;switch  (scyrbnbe) {case 1:float nyrqpapi = -500675578;break;default:boolean sphnrubt = true;break;}
        System.out.println("Comparison result: " + compareTo(other));
    
}
}

class Bar {
    private int value;

    public Bar(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}