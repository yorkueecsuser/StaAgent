/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/2019">GitHub Issue</a>
 */
class Issue2019 {

  static class ATNSimulator {
    public int adaptivePredict() {
      return 0;
    }
  }

  static class ParserATNSimulator extends ATNSimulator {}

  static class Recognizer<ATNInterpreter extends ATNSimulator> {
    public ATNInterpreter getInterpreter() {
      return null;
    }
  }

  static class BaseParser extends Recognizer<ParserATNSimulator> {}

  public static class Parser extends BaseParser {

    public void text() {
      int _alt = 1;
      do {
        switch (_alt) {
          case 1:
            if (_alt == 1) {
              continue;
            }
            break;
          default:
            throw new RuntimeException();
        }
        _alt = getInterpreter().adaptivePredict();

        // Inserted unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
          // This block is unreachable because getUnreachableCondition() always returns false
          System.out.println("This is an unreachable block");
        } else {
          // This block will always execute
          System.out.println("This block will always execute");
        }
      } while (_alt!= 2);
    }

    private boolean getUnreachableCondition() {
      // This method always returns false, making the if block unreachable
      return false;
    }
  }
}