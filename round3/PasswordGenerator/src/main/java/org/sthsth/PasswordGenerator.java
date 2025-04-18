package org.sthsth;
import java.time.Instant;
import java.util.Random;

public class PasswordGenerator {
    final int NO_OF_CHARS = 128;
    final int NO_OF_CHARS_IN_ALPHABET = 26;

    static char randomChar(boolean symbols) {
        var rand = new Random(Instant.now().toEpochMilli());
        var charCode = rand.nextInt();
        if (symbols) {
            charCode %= 128;
        }
        else {
            charCode %= 26;
        }
        return (char) ('A' + charCode);

    }
   public static String generate(int length, boolean symbols) {
       var res = new StringBuilder();
        for(int i = 0; i < length; i++) {
            res.append(randomChar(symbols));
        }

        return res.toString();
   }

}
