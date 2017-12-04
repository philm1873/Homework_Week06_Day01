import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TestEightBall {
    ArrayList<String> answersList;
    EightBall eightBall;

    @Before
    public void before() {
        answersList = new ArrayList<>(Arrays.asList("Yes", "No", "No Doubt"));
        eightBall = new EightBall(answersList);
    }


    @Test
    public void getAnswers() {
        assertEquals(3, eightBall.getAnswers().size());
    }

    @Test
    public void getRandomAnswer() {
        assertNotNull(eightBall.randomAnswer());
    }

    @Test
    public void addWordSuccessful() {
        int result = eightBall.wordExists("Nae Chance");
        eightBall.add(result, "Nae Chance");
        assertEquals(4, eightBall.getAnswers().size());
    }

    @Test
    public void addWordFailure() {
        int result = eightBall.wordExists("Yes");
        eightBall.add(result, "Yes");
        assertEquals(3, eightBall.getAnswers().size());
    }

    @Test
    public void wordExistsPass() {
        assertEquals(0, eightBall.wordExists("Yes"));
    }

    @Test
    public void wordExistsFail() {
        assertEquals(-1, eightBall.wordExists("Nah"));
    }

    @Test
    public void removeSuccessful() {
        int result = eightBall.wordExists("Yes");
        eightBall.remove(result, "Yes");
        assertEquals(2, eightBall.getAnswers().size());
    }

    @Test
    public void removeFailure() {
        int result = eightBall.wordExists("Nah");
        eightBall.remove(result, "Nah");
        assertEquals(3, eightBall.getAnswers().size());
    }

}
