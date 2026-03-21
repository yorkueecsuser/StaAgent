class AlwaysThrowsExample {
public static void main(String [] args){
    AlwaysThrowsExample example = new AlwaysThrowsExample();
    example = new AlwaysThrowsExample();
    example.showBug("123abc");
}

    public int showBug(String input) {
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }
}