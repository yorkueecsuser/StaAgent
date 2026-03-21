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
int yzpgqipj = 0;switch  (yzpgqipj) {case 1:long lgampoic = -62215905;break;default:String qesgsqhu = "augslkfj";break;}

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