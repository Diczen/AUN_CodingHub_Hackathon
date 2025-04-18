package org.example;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import  java.util.Random;

public class GenerateQuestions {
    public static ArrayList<Question> questions(int noOfQuestions) {
        final var rand = new Random();
        var res = new ArrayList<Question>();

        for(int i = 0; i < noOfQuestions; i++) {
            int x = rand.nextInt();
            int y = rand.nextInt();
            int ans = x + y;
            res.add(new Question(x, y, ans ));
        }
        return res;
    }
}
