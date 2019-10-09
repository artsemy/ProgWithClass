package com.company.classes.texts;

import java.util.Arrays;

public class Text {

    private String title;
    private Sentence[] sentences;
    private int count;

    //constructor
    public Text(){
        sentences = new Sentence[1];
        count = 0;
        title = "no title";
    }

    //constructor
    public Text(Sentence[] sentences, String title){
        this.title = title;
        this.sentences = sentences;
        count = sentences.length;
    }

    //add sentence
    public void addSentence(Sentence sentence){
        if (count == 0){
            sentences[count++] = sentence;
        } else {
            sentences = Arrays.copyOf(sentences, sentences.length+1);
            sentences[count++] = sentence;
        }
    }

    //get method
    public String getTitle() {
        return title;
    }

    //set method
    public void setTitle(String title) {
        this.title = title;
    }

    //to string
    @Override
    public String toString() {
        String res = sentences[0].toString();
        for (int i = 1; i < sentences.length; i++) {
            res = res + " " + sentences[i].toString();
        }
        return res;
    }

    //format text
    public String cutByLength(int k){
        String str = this.toString();
        String res = str;
        if (str.length() > k){
            res = str.substring(0, k);
            for (int i = 1; i < str.length()/k; i++) {
                res = res + "\n" + str.substring(i*k, (i+1)*k);
            }
            int b = str.length()%k;
            res = res + "\n" + str.substring(str.length()-1-b);
        }
        return res;
    }

}
