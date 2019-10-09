package com.company.classes.texts;

import java.util.Arrays;

public class Sentence {

    private Word[] words;
    private int count;

    //constructor
    public Sentence() {
        words = new Word[1];
        count = 0;
    }

    //constructor
    public Sentence(Word[] words) {
        this.words = words;
        count = words.length;
    }

    //to string
    @Override
    public String toString() {
        String res = words[0].getWord();
        for (int i = 1; i < words.length; i++) {
            res = res + " " + words[i].getWord();
        }
        return res;
    }

    //add word
    public void addWord(Word word){
        if (count == 0){
            word.firstWord();
            words[count++] = word;
        } else {
            words = Arrays.copyOf(words, words.length+1);
            words[count++] = word;
        }
    }

}
