package org.example;

import java.util.*;

public class AnagramFinder
{
    public Map<String, List<String>> groupAnagrams(List<String> words)
    {
        Map<String, List<String>> anagrams = new HashMap<>(); //folosesc hashMap pt a accesa rapid listele de anagrame

        for (String word : words)
        {
            String sortedLetters = sortLetters(word);

            if (!anagrams.containsKey(sortedLetters)) {
                anagrams.put(sortedLetters, new ArrayList<>());
            }
            anagrams.get(sortedLetters).add(word);
        }
        return anagrams;
    }

    private String sortLetters (String word)
    {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }
}
