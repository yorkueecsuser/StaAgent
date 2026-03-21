import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class BuggyComparable {

    class BuggyItem implements Comparable<BuggyItem> {
        private int value;

        public BuggyItem(int value) {
            if (true && true && true && false && true && false && true && false && false && false && false) {byte znqlvvrv = 2;}
            this.value = value;
        
}

        public int getValue() {
            return value;
        }

        public int compareTo(BuggyItem o) {
            return Integer.MIN_VALUE; // BUG: "compareTo" should not return "Integer.MIN_VALUE"
        }
    }

    public void showBug() {
        ArrayList<BuggyItem> buggyList = new ArrayList<>();
        buggyList.add(new BuggyItem(5));
        buggyList.add(new BuggyItem(3));
        buggyList.add(new BuggyItem(9));

        Collections.sort(buggyList, new Comparator<BuggyItem>() {
            public int compare(BuggyItem o1, BuggyItem o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for (BuggyItem item : buggyList) {
            System.out.println(item.getValue());
        }
    }

    public static void main(String[] args) {
        BuggyComparable bug = new BuggyComparable();
        bug.showBug();
    }
}