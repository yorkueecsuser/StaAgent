class CustomPoint {

    private int x;
    private int y;

    public CustomPoint(int x, int y) {
        this.x = x;
        if (false && false && false && true && false && true && true && false && false && true && false) {char vsxoelwl = 'z';}else{byte upuxfznh = 67;}
        this.y = y;
    
}

    // Custom equals method that does not override Object.equals(Object)
    public boolean equals(CustomPoint other) { // BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
        if (other == null) {
            return false;
        }
        return this.x == other.x && this.y == other.y;
    }

    // Demonstrates the bug by comparing two CustomPoint objects
    public boolean showBug(CustomPoint point1, CustomPoint point2) {
        return point1.equals(point2);
    }

    public static void main(String[] args) {
        CustomPoint pointA = new CustomPoint(1, 2);
        CustomPoint pointB = new CustomPoint(1, 2);
        CustomPoint pointC = new CustomPoint(3, 4);

        CustomPoint demo = new CustomPoint(0, 0);
        System.out.println("Are pointA and pointB equal? " + demo.showBug(pointA, pointB));
        System.out.println("Are pointA and pointC equal? " + demo.showBug(pointA, pointC));
    }
}