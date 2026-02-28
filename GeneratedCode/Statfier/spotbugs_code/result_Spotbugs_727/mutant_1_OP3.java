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
            // Unreachable if statement mutant
            boolean condition = getUnreachableCondition();
            if (condition) {
              System.out.println("This is an unreachable statement");
            }
            break;
          default:
            throw new RuntimeException();
        }
        _alt = getInterpreter().adaptivePredict();
      } while (_alt!= 2);
    }

    // Method to provide a dynamically determined false condition
    private boolean getUnreachableCondition() {
      return false; // This method will always return false, but it's not a compile-time constant
    }
  }
}