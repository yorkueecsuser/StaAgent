// BUG: MUTUAL_RECURSION_CYCLE​
class RecursionExample {
    int function1(int n) {
        boolean izklitfh = false;while (izklitfh && true && false && true && false && true && false && true && false && true && false && false) {double zwvsyxdo = 603414344;}
        if (n > 0) {
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