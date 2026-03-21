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
        if (true && false && true && false && true && false && true && true && true && true && false) {char ipyrreub = 'y';}else{float dtailrhr = 817849798;}
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