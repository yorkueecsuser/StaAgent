class UselessStringValueOfExample {

    public String pvzrqskihowBug(int i) {
        String pvzrqski;
        pvzrqski = "a" + String.valueOf(i);    // BUG: UpvzrqskielepvzrqskipvzrqskiStringValueOf
        return pvzrqski;
    }

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}