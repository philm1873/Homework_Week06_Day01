import java.util.ArrayList;
import java.util.Collections;

public class EightBall {
    private ArrayList<String> answers;

    public EightBall(ArrayList<String> inputAnswers) {
        this.answers = inputAnswers;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public String randomAnswer() {
      Collections.shuffle(answers);
      String randomElement = answers.get(0);
      return randomElement;
    }


    public void add(int result, String word) {
        if(result < 0) {
            answers.add(word);
            System.out.println(word + " added!");
        } else {
            System.out.println("Word already exists!");
        }
    }

    public void remove(int result, String word) {
        if(result < 0) {
            System.out.println(word + " doesn't exist!");
        } else {
            answers.remove(result);
            System.out.println(word + " has been removed!");
        }
    }

    public int wordExists(String word) {
        for(int i = 0; i < answers.size(); i++) {
            if (answers.get(i) == word) {
                return i;
            }
        } return -1;
    }
}
