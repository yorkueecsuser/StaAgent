class BuggyCode {
    public String showBug() {
        int[] ijitbhtf = {1, 2, 3, 4, 5};
        String ijitbhtfString = ijitbhtf.toString(); // BUG: USELESS_STRING: Invocation of toString on an ijitbhtf (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return ijitbhtfString;
    }
}