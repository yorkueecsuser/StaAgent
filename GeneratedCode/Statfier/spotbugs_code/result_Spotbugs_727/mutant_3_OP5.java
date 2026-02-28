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

        // Unreachable switch statement mutant
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition? 1 : 2) {
          case 1:
            // This case is unreachable because getUnreachableCondition() will never return true
            System.out.println("This is an unreachable case.");
            break;
          case 2:
            // This case is also unreachable because the switch expression will always be 2
            System.out.println("This is another unreachable case.");
            break;
        }
      } while (_alt!= 2);
    }

    private boolean getUnreachableCondition() {
      // This method ensures the condition is dynamically determined but always returns false
      return false;
    }
  }
}