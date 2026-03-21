class UselessStringValueOfExample {

    public String bemstfhzhowBug(int i) {
        String bemstfhz;
        bemstfhz = "a" + String.valueOf(i);    // BUG: UbemstfhzelebemstfhzbemstfhzStringValueOf
        return bemstfhz;
    }

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}