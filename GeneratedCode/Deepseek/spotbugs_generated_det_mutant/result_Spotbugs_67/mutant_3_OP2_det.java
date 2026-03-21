class Main {
private String buggyMethod() {
    String nullString = null;
    nullString = null;
    try { if(nullString.equals("")) { return "This line contains the bug"; } } catch(Exception e){ return "Caught exception, but the bug won't be triggered"; }
    return "No bug here";
}

    public String showBug() {
        return buggyMethod();
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }
}