import org.junit.Test;
import static org.junit.Assert.*;

public class MergedStringCheckerTest {

    @Test
    public void normalHappyFlow() {
        assertTrue("codewars can be created from code and wars", MergedStringChecker.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", MergedStringChecker.isMerge("codewars", "cdwr", "oeas"));
        assertFalse("Codewars are not codwars", MergedStringChecker.isMerge("codewars", "cod", "wars"));
//        assertFalse("Codewars are not codwars", MergedStringChecker.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
    }

}