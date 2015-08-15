import org.junit.*;
import static org.junit.Assert.*;
public class WordPuzzleTest {

/*@Test
public void checkString_inputOutputSameString_yes() {
WordPuzzle app = new WordPuzzle();
assertEquals("I like owls.", app.sameString("I like owls."));
}*/

@Test
public void checkString_replaceAwithDash_yes() {
WordPuzzle app = new WordPuzzle();
assertEquals("M-k my d-y", app.newStr("Mak my day"));
}

@Test
public void checkString_replaceAllLowerVowelswithDash_yes() {
WordPuzzle app = new WordPuzzle();
assertEquals("--m-- l-v-s b-tt-ns", app.newStr("aimee loves buttons"));
}
@Test
public void checkString_replaceLowerandUpperVowelswithDash_yes() {
WordPuzzle app = new WordPuzzle();
assertEquals("--m-- l-v-s b-tt-ns", app.newStr("Aimee lovEs buttons"));
}

}