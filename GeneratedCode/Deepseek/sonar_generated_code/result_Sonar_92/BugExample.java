class BugExample {

    public double[] showBug(double[] array) {
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = -array[i];
        }
        while (false) {
            // This is an unreachable while loop
        }
        return result;
    }

    public double showBug1(double num) {
        return +num;
    }

    public boolean showBug2(boolean b) {
        while (false) {
            // This is an unreachable while loop
        }
        return!!!b;
    }

    public int showBug3(int i) {
        while (false) {
            // This is an unreachable while loop
        }
        return ++i;
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        double[] array = {1.0, -2.0, 3.3, -4.4, 5.5};
        System.out.println("showBug:");
        double[] result = bug.showBug(array);
        for (double d : result) {
            System.out.println(d);
        }
        System.out.println("showBug1:");
        System.out.println(bug.showBug1(5));
        System.out.println("showBug2:");
        System.out.println(bug.showBug2(true));
        System.out.println("showBug3:");
        System.out.println(bug.showBug3(5));
    }
}