class BitwiseBug {
    public static void main(String[] args) {
        int val = -10;
        int CONSTANT = -1;
        if ((val & CONSTANT) > 0) {
            System.out.println("The bitwise expression is positive");
        } else {
            System.out.println("The bitwise expression is negative");
        }

        // Unreachable switch statement
        int flag = 0;
        switch (flag) {
            case 1:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("This branch is also unreachable");
                break;
        }
    }
}