package fr.wildcodeschool.unittesting;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouy";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        if (candidate == null) {
            return null;
        }

        candidate = candidate.toLowerCase();

        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }

    public static String uniqueVowels(String candidate) {
        if (candidate == null) {
            return null;
        }

        String possibleVowels = ALL_VOWELS;
        String vowels = "";
        candidate = candidate.toLowerCase();
        char[] letters = candidate.toCharArray();

        for (int i = 0; i < candidate.length(); i++) {
            if (possibleVowels.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
                possibleVowels = possibleVowels.replace(Character.toString(letters[i]), "");
            }
        }
        return vowels;
    }

}