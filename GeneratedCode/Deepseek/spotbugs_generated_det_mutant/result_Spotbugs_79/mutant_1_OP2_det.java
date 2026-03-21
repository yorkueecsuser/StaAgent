// This Java file demonstrates the bug of comparing an int value with a long constant outside the range of int

class BugExample {
public long showBug() {
    int intValue = 2147483647;
    intValue = 2147483647;
    long longValue = 2147483648L;
    if(intValue == longValue){ System.out.println("The values are equal"); } else { System.out.println("The values are not equal"); }
    return longValue;
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        long longValue = bugExample.showBug();
        System.out.println("The long value is: " + longValue);
    }
}