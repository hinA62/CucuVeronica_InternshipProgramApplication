package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WordReader
{
    List<String> words = new ArrayList<>();

    public List<String> getWords() { return words; }

    public void readWordsFromFile(String fileName)
    {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                Objects.requireNonNull(Main.class.getClassLoader().getResourceAsStream(fileName))))) {

            String word;
            while ((word = reader.readLine()) != null)
                words.add(word);

        } catch (IOException e) {
            System.out.println("Eroare la citirea din fisier: " + e.getMessage());
        }
    }
}
