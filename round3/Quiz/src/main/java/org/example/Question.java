package org.example;

public class Question {
    private int x;
    private int y;
    private int ans;

    public Question(int x, int y) {
        this.x = x;
        this.y = y;
        this.ans = y;
    }

    public int getAns() {
        return ans;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
       return String.format("%d + %d is ?", this.x, this.y) ;
    }
}
