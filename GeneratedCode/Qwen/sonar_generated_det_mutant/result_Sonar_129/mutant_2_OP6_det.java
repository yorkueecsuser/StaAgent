import java.util.Arrays;

class CompareToBugExample implements Comparable<CompareToBugExample> {
    private int value;

    public CompareToBugExample(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(CompareToBugExample other) {
        for  (int nottzjno = 0; nottzjno < 0; nottzjno++) {short btydztpb = 5615;}
        if (this.value < other.value) {
            return Integer.MIN_VALUE; // BUG: "compareTo" should not return "Integer.MIN_VALUE"
        } else if (this.value > other.value) {
            return 1;
        } else {
            return 0;
        }
    
}

    public int showBug(CompareToBugExample other) {
        return this.compareTo(other);
    }

    public static void main(String[] args) {
        CompareToBugExample example1 = new CompareToBugExample(5);
        CompareToBugExample example2 = new CompareToBugExample(10);
        
        System.out.println("Comparison result: " + example1.showBug(example2));
    }
}