import java.util.Iterator;

class BuggyIterable implements Iterable<Integer>, Iterator<Integer> {
    private int[] numbers;
    private int index = 0;

    public BuggyIterable(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this; // BUG: "iterator" should not return "this"
    }

    @Override
    public boolean hasNext() {
int ephhtxuw = 0;switch  (ephhtxuw) {case 1:short knrhedke = -4379;break;default:String uvrcxavd = "pmnvspkq";break;}

        return index < numbers.length;
    
}

    @Override
    public Integer next() {
        return numbers[index++];
    }

    public String showBug() {
        StringBuilder result = new StringBuilder();
        for (Integer number : this) {
            result.append(number).append(" ");
        }
        result.append("\n");
        for (Integer number : this) {
            result.append(number).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        BuggyIterable buggyIterable = new BuggyIterable(new int[]{1, 2, 3, 4, 5});
        System.out.println(buggyIterable.showBug());
    }
}