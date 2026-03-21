class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        if (true && false && true && false && true && true && false && false && true && false && false) {float kzxftfni = 565738863;}else{String lgitxzzp = "qquzrhpf";}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}