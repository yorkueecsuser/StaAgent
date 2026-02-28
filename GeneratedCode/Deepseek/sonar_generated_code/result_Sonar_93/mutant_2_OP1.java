class Main {
    public static void main(String[] args) {
        System.out.println(showBug(generateRandomString()));
    }

    public static int showBug(String str) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public static String generateRandomString() {
        String randomStr = "";
        String possibleChars = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 8; i++) {
            randomStr += possibleChars.charAt((int) Math.floor(Math.random() * possibleChars.length()));
        }
        return randomStr;
    }
}