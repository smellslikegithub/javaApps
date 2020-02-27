package com.date;

public class CountYZ {
    static int countYZ(String str) {
        int wordEndIndex = 0;
        int yZCounter = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i)) == true){
                if(i == str.length()-1){
                    wordEndIndex = i;
                    if(str.charAt(wordEndIndex) =='Y' || str.charAt(wordEndIndex) =='y' || str.charAt(wordEndIndex) =='z'
                            || str.charAt(wordEndIndex) =='Z'){
                        yZCounter +=1;
                        wordEndIndex = 0;
                    }
                }
                else{
                    wordEndIndex = i;
                }
            }

            else {
                if(str.charAt(wordEndIndex) =='Y' || str.charAt(wordEndIndex) =='y' || str.charAt(wordEndIndex) =='z'
                        || str.charAt(wordEndIndex) =='Z'){
                    yZCounter +=1;
                    wordEndIndex = 0;
                }
            }
        }
        return yZCounter;
    }
}
