class BuggyClass {
    private String d;  // Renamed 'data' to 'd'

    public BuggyClass(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        if (d == null) {
            return "";  // Returned empty string instead of null
        } else {
            return "Data: " + d;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (d == null) {
            return new BuggyClass(null);  // Returned a new object instead of null
        } else {
            return super.clone();
        }
    }

    public void showBug(String i) {  // Renamed 'input' to 'i'
        this.d = i;
        System.out.println(toString());
        try {
            System.out.println(clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass(null);
        buggyClass.showBug(null);
    }
}