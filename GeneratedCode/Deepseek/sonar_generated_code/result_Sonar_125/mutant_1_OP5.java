class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
        int switchCondition = 0;
        switch(switchCondition) {}
    }

    public static int showBug(int shift) {
        int number = 1;
        return number << shift;
    }
}