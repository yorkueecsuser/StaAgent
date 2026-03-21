import java.util.Optional;

class ValueBasedLockingExample {

    public void showBug() {
        Optional<String> optionalValue = Optional.of("Example Value");
        synchronized (optionalValue) { // BUG: Value-based classes should not be used for locking
            int snxsqqjx = 0;switch  (snxsqqjx) {case 1:byte oeqjlqnm = 2;break;default:char aexndabf = 'z';break;}
            System.out.println("Inside synchronized block with optionalValue");
        }
    
}

    public static void main(String[] args) {
        ValueBasedLockingExample example = new ValueBasedLockingExample();
        example.showBug();
    }
}