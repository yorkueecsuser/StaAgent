class InfiniteLoop {
    public static void main(String[] args) {
        int count = 0;
        do {
            count++;
            System.out.println(count);
        } while (true);
    }
}