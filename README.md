# Grupare a anagramelor

Programul citeste dintr-un fisier text cuvinte, pe care le grupeaza ca anagrame. Adica toate cuvintele care sunt anagrame vor aparea in acelasi grup.
Fisierul de intrare contine cate un cuvant pe fiecare linie.

## Structura proiectului
Proiectul este scris in Java, foloseste Maven si este structurat in clase separate pentru a asigura claritate si modularitate. Asemenea structura respecta principiul Single Responsability si ofera o mai mare flexibilitate, permitand eventuale modificari si extinderi, astfel incat sa nu fie nevoie de a schimba intregul cod.

Clasele proiectului:
  - Main.java - asigura initializarile si afiseaza rezultatul
  - WordReader - clasa responsabila de citirea cuvintelor, in cazul de fata - citire din fisier linie cu linie (prin adaugarea de noi metode, se pot implementa diferite tipuri de citire)
  - AnagramFinder - grupeaza cuvintele care sunt anagrame, pe baza sortarii literelor din cuvant

## Fisiere
  - Fisierele claselor sunt in directorul src/main/java, in pachetul org.example, singurul folosit, fiind o aplicatie foarte mica.
  - Fisierul text "sample.txt", care contine cuvintele de input, se gaseste in directorul src/main/resources. Cuvintele trebuie sa fie in format **un cuvant pe linie**.

## Compilare si rulare
Proiectul poate fi compilat si rulat a) direct din IDE sau b) dintr-un terminal in directoul proiectului prin intermediul comenzilor:
  - mvn clean compile
  - mvn exec:java -Dexec.mainClass="org.example.Main"

Configuratie:
- SDK - 21
- Language level - 21
