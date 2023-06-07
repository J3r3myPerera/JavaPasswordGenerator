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

        //if its a symbol
        else {
            val = 4;
        }

        return val;

    }

    public int PasswordStrength() {
        String s = this.Value;
        boolean UsedUpper = false;
        boolean UsedLower = false;
        boolean UsedNum = false;
        boolean UsedSym = false;
        int type;
        int Score =0;

        for (int i=0;  i<s.length(); i++) {
            char c = s.charAt(i);
            type = CharType(c);

            if (type == 1) UsedUpper = true;
            if (type == 2) UsedLower = true;
            if (type == 3) UsedNum = true;
            if (type == 4) UsedSym = true;
        }

        if (UsedUpper) Score += 1;
        if (UsedLower) Score += 1;
        if (UsedNum) Score += 1;
        if (UsedSym) Score += 1;

        return Score;

    }

    public String calculateScore() {
        int Score = this.PasswordStrength();

        if (Score == 6) {
            return "Password strength is Strong.";
        } else if (Score >= 4 ){
            return "Password strength is good.";
        } else if (Score >= 3) {
            return "Password strength is Medium";
        } else {
            return "Weak Password!";
        }
    }

    @Override
    public String toString() {
        return Value;
    }
}
