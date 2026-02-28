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
        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block is reachable
          System.out.println("This is a reachable block.");
        } else {
          // This block is unreachable because getCondition() will always return true
          System.out.println("This is an unreachable block.");
        }
        _alt = getInterpreter().adaptivePredict();
      } while (_alt!= 2);
    }

    // Method to provide a dynamic condition that will always be true
    private boolean getCondition() {
      return true;
    }
  }
}