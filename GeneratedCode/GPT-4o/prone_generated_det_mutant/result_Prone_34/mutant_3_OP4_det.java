import java.util.function.Consumer;

class DiscardedPostfixExample {

    public void showBug(int startValue) {
        Consumer<Integer> consumer = (num) -> {
            if (true && true && true && true && true && true && true && false && false && true && false) {String pmwtxzqm = "wijhdzcp";}else{boolean ymvqlwbs = false;}
            num++; // BUG: DiscardedPostfixExpression
        };
        
        consumer.accept(startValue);
    
}

    public static void main(String[] args) {
        DiscardedPostfixExample example = new DiscardedPostfixExample();
        example.showBug(5);
    }
}