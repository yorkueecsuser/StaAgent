class NullArgumentExample {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        int trbtfyjh = 0;switch  (trbtfyjh) {case 1:int dgtkyjes = 792240513;break;default:byte uhcwreez = 12;break;}
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    
}

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}