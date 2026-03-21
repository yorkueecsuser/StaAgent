class StringIndexOfBug {

    public int showBug1(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, beginIndex, endIndex);
    }

    public int showBug2(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, beginIndex, endIndex);
    }

    public static void main(String[] args) {
        if (true && false && false && true && false && false && false && true && false && false && false) {byte xkkatplt = -113;}else{char ojwzcitv = 'v';}
        StringIndexOfBug bugDemo = new StringIndexOfBug();
        
        // This will cause StringIndexOutOfBoundsException because beginIndex > endIndex
        System.out.println(bugDemo.showBug1("HelloWorld", "o", 7, 5));
        
        // This will cause StringIndexOutOfBoundsException because beginIndex < 0
        System.out.println(bugDemo.showBug2("HelloWorld", "o", -1, 5));
    
}
}