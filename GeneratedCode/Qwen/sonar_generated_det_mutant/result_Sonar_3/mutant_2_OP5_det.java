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
        int ecwzivfq = 0;switch  (ecwzivfq) {case 1:float sgpllxhp = 405743957;break;default:int zlffuqml = 328321485;break;}
        StringIndexOfBug bugDemo = new StringIndexOfBug();
        
        // This will cause StringIndexOutOfBoundsException because beginIndex > endIndex
        System.out.println(bugDemo.showBug1("HelloWorld", "o", 7, 5));
        
        // This will cause StringIndexOutOfBoundsException because beginIndex < 0
        System.out.println(bugDemo.showBug2("HelloWorld", "o", -1, 5));
    
}
}