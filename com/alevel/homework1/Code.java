package com.alevel.homework1;

public class Code {
    public static void main(String[] args) {
        char[] code = {'d', 'i', 'm', 'a'};
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        System.out.print("code =  ");
        for (int i = 0; i < 4; i++) {
            System.out.print(code[i]);
        }
        System.out.print("  word = ");
        for (int i = 0; i < 5; i++) {
            System.out.print(word[i]);
        }
        char[] codedWord = new char[5];
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (97 + i);
        }

        for (int i = 0; i < 5; i++) {
            int w=0;
            for (int k = 0; word[i] != alphabet[k]; k++) {
               // System.out.println("k = " + k);
                w=w+1;
            }
            int c=0;
            for (int j = 0; code[i%4] != alphabet[j]; j++) {
                //System.out.println("j = " + j);
                c=c+1;
            }
            codedWord[i] = alphabet[(c+w)%26];
        }
        System.out.print("  coded word =  ");
     for (int i=0; i<5; i++){
            System.out.print(codedWord[i]);
      }

        //System.out.println(Arrays.toString(code));


    }
}
