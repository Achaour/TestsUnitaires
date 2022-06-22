import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;


import static org.junit.jupiter.api.Assertions.*;

class StringUtilesTest {

    public static class Plaindrome {
        @Nested

        @Test
        @DisplayName("Should return true with kayak")
        void isPlaindromeKayak() {
            boolean result = StringUtiles.isPalindrom("kayak");
            assertTrue(result);
        }

        @Test
        @DisplayName("Is plaindrom Bonjour")
        void isPlaindromeBonjour() {
            boolean result = StringUtiles.isPalindrom("bonjour");
            assertFalse(result);
        }

        @Test
        @DisplayName("Should return true with empty String")
        void isPlaindromeChaineVide() {
            boolean result = StringUtiles.isPalindrom("");
            assertTrue(result);
        }

        @Test
        @DisplayName("Should return true with KAYak")
        void isPlaindromeKAYak() {

            boolean result = StringUtiles.isPalindrom("KAYak");
            assertTrue(result);

        }

        @Test
        @DisplayName("Should return true with string with string spaces")
        void isPlaindromeWithSpaces() {

            boolean result = StringUtiles.isPalindrom("Engage le jeu que je le gagne");
            assertTrue(result);

        }


    }





    public static class Anagrame{
        @Nested
        @Test
        @DisplayName("Should be false if size different")
        void isLeigthDifferent() {
            assertFalse(StringUtiles.isPalindrom("saga"));
        }
        @Test
        @DisplayName("Should be true if is lowercase palindrom")
        void isAnagramLower() {
            assertTrue(StringUtiles.isAnagram("gare","rage"));
        }

        @Test
        @DisplayName("Should be true if is uppercase palindrom")
        void isAnagramUpper() {
            assertTrue(StringUtiles.isAnagram("GARE","RAGE"));
        }

        @Test
        @DisplayName("Should be true if is capitalize anagram")
        void isAnagramCapitalize() {
            assertTrue(StringUtiles.isAnagram("Gare","Rage"));
        }

        @Test
        @DisplayName("Should be true if string empty")
        void isAnagramEmpty() {
            assertTrue(StringUtiles.isAnagram("",""));
        }

        @Test
        @DisplayName("Should be true in sentence anagram")
        void isAnagramSentence() {
            assertTrue(StringUtiles.isAnagram("Tom Elvis Jedusor","Je suis Voldemort"));
        }
        @Test
        @DisplayName("Should be false is string diffent")
        void IsDifferent(){
            assertFalse(StringUtiles.isAnagram("Bonjour","jours bon"));
        }
    }




    public static  class reverseInt {

        @Nested
        @Test
        @DisplayName("should return an inversed int from an int lasting 0")
        void reverseInt()
        {
            assertEquals(89,StringUtiles.reverseInt(98));
        }
        @Test
        @DisplayName("should return an inversed int from an int lasting 0")
        void reverseIntZero()
        {
            assertEquals(1,StringUtiles.reverseInt(10));
            assertEquals(21,StringUtiles.reverseInt(120));
            assertEquals(0,StringUtiles.reverseInt(0));
        }
        @Test
        @DisplayName("should return an inversed int from a negative int lasting 0")
        void reverseIntNeg()
        {
            assertEquals(-1,StringUtiles.reverseInt(-10));
            assertEquals(-98,StringUtiles.reverseInt(-89));
            assertEquals(-21,StringUtiles.reverseInt(-120));
        }
    }





    public static class Capitalize {
        @Nested

        @Test
        @DisplayName("Should return a upper case at the beggining of each word with all in lower cases")
        void capitalizeWithLowerCase(){
            assertEquals("Je Suis Dans La Joie", StringUtiles.capitalze("Je Suis Dans La Joie"));
        }

        @Test
        @DisplayName("Should return a upper case at the beggining of each word with first letter in upper case")
        void capitalizeWithUpperCase(){
            assertEquals("Je Suis Dans La Joie",StringUtiles.capitalze("Je Suis Dans La Joie"));
        }

        @Test
        @DisplayName("Should return a upper case at the beggining of each word with all in upper case")
        void capitalizeWithAllUpperCase(){
            assertEquals("Je Suis Dans La Joie", StringUtiles.capitalze("JE SUIS DANS LA JOIE"));
        }

        @Test
        @DisplayName("Should return a upper case at the beggining of each word when space is replaced by a special character")
        void capitalizeWithSpecialCharacter(){
            assertEquals("Je Suis Jean-Paul",StringUtiles.capitalze("je suis jean-paul"));
        }
    }



}







