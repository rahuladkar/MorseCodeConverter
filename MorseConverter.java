package Morse_Code_Converter;

public class MorseConverter {

    final static private String[] charMorseCode = {
            ".- "
            , "-... "
            , "-.-. "
            , "-.. "
            , ". "
            ,"..-. "
            , "--. "
            , ".... "
            , ".. "
            , ".--- "
            , "-.- "
            , ".-.. "
            , "-- "
            , "-. "
            , "--- "
            , ".--. "
            , "--.- "
            , ".-. "
            , "... "
            , "- "
            , "..- "
            , "...- "
            , ".-- "
            , "-..- "
            , "-.-- "
            , "--.. "
    };

    final static private String[] numMorseCode = {
            "----- "
            , ".---- "
            , " ..--- "
            , "...-- "
            , "....- "
            , "..... "
            , "-.... "
            , "--... "
            , "---.. "
            , "----. "
    };

    // getter()
    public static String[] getCharMorseCode() {
        return charMorseCode;
    }

    public static String[] getNumMorseCode() {
        return numMorseCode;
    }
}
