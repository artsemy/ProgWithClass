package com.company.classes.texts;

public class Word {

    private String word;

    public Word(String word) {
        this.word = word;
    }

    public Word() {
        word = "";
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void firstWord(){
        if (word != null && !word.isEmpty()){
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
        }
    }

}
