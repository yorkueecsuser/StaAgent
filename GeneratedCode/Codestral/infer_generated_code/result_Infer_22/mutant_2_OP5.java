// BUG: MUTUAL_RECURSION_CYCLE​
class RecursionExample {
    int function1(int n) {
        if (n > 0) {
            int switchValue = -n; // This will always be less than or equal to 0
            switch(switchValue) {
                case 1:
                    System.out.println("This code should never execute");
                    break;
                default:
                    break;
            }
            return function2(n - 1);
        } else {
            return 0;
        }
    }

    int function2(int n) {
        if (n > 0) {
            return function1(n - 1);
        } else {
            return 0;
        }
    }

    public int showBug(int n) {
        return function1(n);
    }
}