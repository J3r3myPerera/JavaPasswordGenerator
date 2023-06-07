import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class GeneratorTest {

    private final Password password = new Password("Secret");
    private final Alaphabet firstAlphabet = new Alaphabet(true, false, false, false );
    private final Alaphabet secondAlphabet = new Alaphabet(false,true,true,true);    private final Generator generator = new Generator(true, false, false, false);
//    private final Password generatedPassword = generator.GeneratePassword(4);

    @Test
    void test1() {
        assertEquals("Secret", password.toString());
    }

    @Test
    void test2() {
        assertEquals(firstAlphabet.getAlphabet(), Alaphabet.UPPERCASE_LETTERS);
    }

    @Test
    void test3() {
        assertEquals(secondAlphabet.getAlphabet(), Alaphabet.lowercase_letters + Alaphabet.numbers + Alaphabet.symbols);
    }

    @Test
    void test4() {
        assertEquals(generator.alphabet.getAlphabet(), Alaphabet.UPPERCASE_LETTERS);
    }

    @Test
    void test5() {
        assertEquals(generator.alphabet.getAlphabet().length(), 26);
    }
}
