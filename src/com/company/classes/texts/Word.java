package com.company.classes.texts;

public class Word {

    private String word;

    //constructor
    public Word(String word) {
        this.word = word;
    }

    //constructor
    public Word() {
        word = "";
    }

    //get method
    public String getWord() {
        return word;
    }

    //set method
    public void setWord(String word) {
        this.word = word;
    }

    //change first word
    public void firstWord(){
        if (word != null && !word.isEmpty()){
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
        }
    }

}
