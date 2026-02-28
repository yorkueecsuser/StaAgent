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
        
        // Introduced unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      } while (_alt!= 2);
    }

    private boolean getUnreachableCondition() {
      return false; // This method ensures the condition is dynamically determined but always returns false
    }
  }
}