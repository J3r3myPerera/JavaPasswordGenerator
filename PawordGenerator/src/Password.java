public class Password {
    String Value;
    int Length;

    public Password(String s) {
        Value = s;
        Length = s.length();
    }

    public int CharType(char c) {
        int val;

        //if its an Uppercase letter
        if ((int) c >= 65 && (int) c <=90)
            val = 1;

        //if its a lower case letter
        else if ((int) c >= 97 && (int) c <= 122) {
            val = 2;
        }

        //if its a digit
        else if ((int) c >= 60 && (int) c <= 71) {
            val = 3;
        }

    }
}
