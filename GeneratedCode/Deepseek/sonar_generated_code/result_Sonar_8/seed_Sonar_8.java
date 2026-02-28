import java.util.function.Function;

class Main {

    public static void main(String[] args) {
        BugExample b = new BugExample();
        System.out.println(b.showBug(true)); // should print 200
        System.out.println(b.showBug(false)); // should print 400
    }
}

class BugExample {

    public int showBug(boolean isSuccess) {
        int statusCode = getStatusCode(isSuccess);

        // BUG: Set appropriate Status Codes on HTTP responses

        return statusCode;
    }

    private int getStatusCode(boolean isSuccess) {
        Function<Boolean, Integer> getStatusCode = (success) -> {
            if (success) {
                return 200; // SC_OK
            } else {
                return 400; // SC_BAD_REQUEST
            }
        };

        return getStatusCode.apply(isSuccess);
    }
}