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
        int zxnuqgsw = 0;switch  (zxnuqgsw) {case 1:double vddbcpxu = 261373099;break;default:short omxndvvc = -4470;break;}
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