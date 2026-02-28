// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);

        // Unreachable switch statement mutation
        int z = getValue();
        switch (z) {
            case 1:
                // code
                break;
            default:
                // code
                break;
        }
    }
}