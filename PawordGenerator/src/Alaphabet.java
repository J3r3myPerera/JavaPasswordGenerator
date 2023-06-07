public class Alaphabet {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lowercase_letters = "abcdefghijklmnopqrstuvwxyz";
    public static final String numbers = "1234567890";
    public static final String symbols = "!@#$%^&*()-_=+\\\\/~?";

    private final StringBuilder pool;

    public Alaphabet(boolean uppercaseNeeded, boolean lowercaseNeeded, boolean numberNeeded, boolean specialCharacterNeeded) {
        pool = new StringBuilder();

        if (uppercaseNeeded) {
            pool.append(UPPERCASE_LETTERS);
        }
        if (lowercaseNeeded) {
            pool.append(lowercaseNeeded);
        }
        if (numberNeeded) {
            pool.append(numbers);
        }
        if (specialCharacterNeeded){
            pool.append(symbols);
        }
    }

    public String getAlphabet() {
        return pool.toString();
    }

}
