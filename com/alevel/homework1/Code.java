package com.alevel.homework1;
//The code word defines the letter shift of the coded word in alphabetical order
//        For example, if the code word is DIMA. We encode the word MOBILE
//M -- P
//O -- W
//B -- N
//I -- I If the code word ends, start with the first letter of the code word
//L -- O
//E –- M
// Coded word is Mobile -- New word is Pwniom (look tab)
//letters of| letters of
//coded word| new word
//        a	|d	i	m	a
//        b	|e	j	n	b
//        c	|f	k	o	c
//        d	|g	l	p	d
//        e	|h	m	q	e
//        f	|i	n	r	f
//        g	|j	o	s	g
//        h	|k	p	t	h
//        i	|l	q	u	i
//        j	|m	r	v	j
//        k	|n	s	w	k
//        l	|o	t	x	l
//        m	|p	u	y	m
//        n	|q	v	z	n
//        o	|r	w	a	o
//        p	|s	x	b	p
//        q	|t	y	c	q
//        r	|u	z	d	r
//        s	|v	a	e	s
//        t	|w	b	f	t
//        u	|x	c	g	u
//        v	|y	d	h	v
//        w	|z	e	i	w
//        x	|a	f	j	x
//        y	|b	g	k	y
//        z	|c	h	l	z
//

public class Code {
    public static void main(String[] args) {
        char[] code = {'d', 'i', 'm', 'a'};
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        System.out.print("Code word is ");
        for (int i = 0; i < 4; i++) {
            System.out.print(code[i]);
        }
        System.out.println();
        System.out.print("Coded word is ");
        for (int i = 0; i < 5; i++) {
            System.out.print(word[i]);
        }
        char[] codedWord = new char[5];
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (97 + i);
        }

        for (int i = 0; i < 5; i++) {
            int w = 0;
            for (int k = 0; word[i] != alphabet[k]; k++) {
                // System.out.println("k = " + k);
                w = w + 1;
            }
            int c = 0;
            for (int j = 0; code[i % 4] != alphabet[j]; j++) {
                //System.out.println("j = " + j);
                c = c + 1;
            }
            codedWord[i] = alphabet[(c + w) % 26];
        }
        System.out.println();
        System.out.print("New word is ");
        for (int i = 0; i < 5; i++) {
            System.out.print(codedWord[i]);
        }
   }
}
