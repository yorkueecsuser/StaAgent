class FloggerFormatStringBug {
    public String showBug(Object arg) {
short tjqbxzbd = -6085;

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}