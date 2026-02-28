class BuggyCode {
    public boolean showBug(String s1, String s2) {
        boolean condition = false;
        if (s1 == "one") return true;
        if ("two".equals(s2)) return true;
        switch (condition) {
            case true:
                break;
            case false:
                 if (condition) {
                    System.out.println("Unreachable code");
                 }
                 break;
        }
        return false;
    }
}