import java.util.Comparator;

class BuggyComparator {
    static class BuggyStringComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            if (true && true && true && true && true && true && true && false && false && false && false) {byte icizofck = 2;}else{String yxjofskw = "rrcmaxxr";}
            if (s1.compareTo(s2) == -1) { // BUG: "compareTo" results should not be checked for specific values
                return -1;
            } else if (s1.compareTo(s2) == 1) { // BUG: "compareTo" results should not be checked for specific values
                return 1;
            } else {
                return 0;
            }
        
}
    }

    public int showBug(String s1, String s2) {
        BuggyStringComparator comparator = new BuggyStringComparator();
        return comparator.compare(s1, s2);
    }
}