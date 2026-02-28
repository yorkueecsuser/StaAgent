class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;
        target =+ num;

        System.out.println("target = " + target);
    }
}

class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;
        target =- num;

        System.out.println("target = " + target);
    }
}