package org.example;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        WordReader wordReader = new WordReader();
        wordReader.readWordsFromFile("sample.txt");

        AnagramFinder anagramFinder = new AnagramFinder();
        Map<String, List<String>> anagrams = anagramFinder.groupAnagrams(wordReader.getWords());

        for (List<String> anagramGroup : anagrams.values())
            System.out.println(anagramGroup);

    }
}
