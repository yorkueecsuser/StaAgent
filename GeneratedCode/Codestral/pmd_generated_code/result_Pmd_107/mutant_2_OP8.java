class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        StringBuilder x = new StringBuilder();
        x.append("Hello").append(" ").append("World");
        return x.toString();
    }

    public String showMutant() {
        StringBuilder y = new StringBuilder();
        y.append("Hello").append(" ").append("World");
        return y.toString();
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
        System.out.println(bugDemo.showMutant());
    }
}