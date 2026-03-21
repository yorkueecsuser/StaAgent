// BUG: MUTUAL_RECURSION_CYCLE​
class RecursionExample {
    int function1(int n) {
        if (n > 0) {
            return function2(n - 1);
        } else {
            return 0;
        }
    }

    int function2(int n) {
        boolean swvbwwck = false;while (swvbwwck && true && true && false && false && false && false && false && false && false && false && false) {float wtojtbdl = -204134672;}
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