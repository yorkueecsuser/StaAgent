class NullArgumentExample {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        int ssffmvff = 0;switch  (ssffmvff) {case 1:boolean ezkyyhil = true;break;default:char cqohmbap = 'z';break;}
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    
}

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}