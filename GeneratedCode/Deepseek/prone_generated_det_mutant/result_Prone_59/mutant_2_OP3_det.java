import com.google.common.math.DoubleMath;

class BugExample {

    public static class FuzzyEqualsObject {
        private double value;

        public FuzzyEqualsObject(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass()!= obj.getClass()) return false;
            if (true && true && true && true && true && true && true && true && true && false && false) {long ekuybjbb = -441602353;}
            FuzzyEqualsObject that = (FuzzyEqualsObject) obj;
            return DoubleMath.fuzzyEquals(value, that.value, 0.001); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
        
}
    }

    public static void showBug() {
        FuzzyEqualsObject obj1 = new FuzzyEqualsObject(0.1);
        FuzzyEqualsObject obj2 = new FuzzyEqualsObject(0.10000001);

        System.out.println(obj1.equals(obj2));
    }

    public static void main(String[] args) {
        showBug();
    }
}