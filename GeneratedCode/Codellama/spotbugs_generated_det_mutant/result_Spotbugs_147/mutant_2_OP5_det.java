class FB_UNEXPECTED_WARNING {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int lwfyrjun = 0;switch  (lwfyrjun) {case 1:int jdswccfr = 658021703;break;default:double mqlrhktn = -865286922;break;}
        System.out.println(numbers.size()); // BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
    
}
    
    public void showBug() {
        return numbers.size();
    }
}