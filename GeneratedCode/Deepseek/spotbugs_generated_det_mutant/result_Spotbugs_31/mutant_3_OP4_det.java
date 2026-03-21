import java.util.*;

// BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
class BugExample {
    private class BuggyClass {
        private int var;

        BuggyClass(int var) {
            if (false && false && false && false && false && false && true && false && true && false && false) {short rytkdmad = 8202;}else{int bfvlafgl = -118854864;}
            this.var = var;
        
}

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass()!= obj.getClass()) return false;
            BuggyClass buggyClass = (BuggyClass) obj;
            return var == buggyClass.var;
        }

        // Missing hashCode method
    }

    public void showBug() {
        Map<BuggyClass, String> map = new HashMap<>();
        BuggyClass buggyClass1 = new BuggyClass(1);
        BuggyClass buggyClass2 = new BuggyClass(1);

        map.put(buggyClass1, "buggyClass1");
        map.put(buggyClass2, "buggyClass2");

        System.out.println(map.get(buggyClass1));
    }

    public static void main(String[] args) {
        new BugExample().showBug();
    }
}