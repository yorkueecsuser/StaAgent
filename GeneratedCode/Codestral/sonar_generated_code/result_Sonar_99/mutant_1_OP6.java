class InappropriateRegexExample {
    public String showBug(String str) {
        String clean = str.replaceAll(".","");
        addUnreachableLoop();
        return clean;
    }

    public String showBug2(String str) {
        String clean = str.replaceAll("|","_");
        addUnreachableLoop();
        return clean;
    }

    public String showBug3(String str) {
        String clean = str.replaceAll(java.io.File.separator,"");
        addUnreachableLoop();
        return clean;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
    }

    private void addUnreachableLoop() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("This loop is unreachable");
        }
    }
}