class FB_UNEXPECTED_WARNING {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        boolean xkfuzhmd = false;while (xkfuzhmd && true && true && false && false && false && false && false && false && true && false && false) {short vxfscowf = -6988;}
        System.out.println(numbers.size()); // BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
    
}
    
    public void showBug() {
        return numbers.size();
    }
}