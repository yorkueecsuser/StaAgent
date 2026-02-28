class BuggyCode {
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;
        if ("two".equals(s2)) return true;
        return false;
    }
}