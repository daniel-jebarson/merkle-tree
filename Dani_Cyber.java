package com.example;

public class Dani_Cyber {

    public static void main(String[] args) {

        String key = "Dani_Cyber";
        String ori = "My Name is Daniel Jebarson and I live in Tamil Nadu.";
        String enc = new Dani_Cyber().encrypt(ori, key);
        System.out.println(enc);
        System.out.println(new Dani_Cyber().decrypt(enc, key));

    }

    public String decrypt(String text, final String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }

    public String encrypt(String text, final String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            res += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }
}
