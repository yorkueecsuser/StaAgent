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

        // Introduced unreachable switch statement
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition? 1 : 0) {
          case 1:
            // This case is unreachable because getUnreachableCondition() always returns false
            System.out.println("This is an unreachable case.");
            break;
          case 0:
            // This case will always execute, but the switch itself is unreachable due to the condition
            System.out.println("This is a reachable case within an unreachable switch.");
            break;
        }
      } while (_alt!= 2);
    }

    private boolean getUnreachableCondition() {
      // This method always returns false, making the switch statement unreachable
      return false;
    }
  }
}