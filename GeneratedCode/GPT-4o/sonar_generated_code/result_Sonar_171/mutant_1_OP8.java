class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}

// Mutant Code: Variable Renaming
class JumpStatementInFinallyBugMutant {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            String x = "This will prevent the exception from being thrown"; // Variable 'x' renamed from 'result'
            return x;
        }
    }

    public static void main(String[] args) {
        String res = showBug(); // Variable 'res' renamed from 'result'
        System.out.println(res);
    }
}