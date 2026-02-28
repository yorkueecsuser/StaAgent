// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
    }
}

// Dead Store Mutant

class DeadStoreMutant {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        String z = "abcd";
        System.out.println(y);
    }
}