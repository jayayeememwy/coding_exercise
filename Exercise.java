
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercise {
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        //test cases
        aboveBelow(list, 3);
//        aboveBelow(list, 5);
//        aboveBelow(list, 6);
//        aboveBelow(list, 10);
//        aboveBelow(list, -4);

        stringRotation("MyString", 2);
//        stringRotation("MyString", 3);
//        stringRotation("MyString", 10);

    }

    /**
     * loops through the list of integers to find number of ints greater than and
     * less than a given comparisonValue
     *
     * @param integerList
     * @param comparisonValue
     * @return HashMap<String, Integer> comparisonHash
     */
    public static HashMap<String, Integer> aboveBelow(List<Integer> integerList, int comparisonValue)
    {
        int above=0;
        int below=0;
        HashMap<String, Integer> comparisonHash = new HashMap<>();

        for(int i : integerList)
        {
            if(i>comparisonValue)
                above++;
            else if(i<comparisonValue)
                below++;
        }

        comparisonHash.put("above", above);
        comparisonHash.put("below", below);

        System.out.println("above: " + comparisonHash.get("above") + ", below: " + comparisonHash.get("below"));

        return comparisonHash;
    }

    /**
     * Rotates the string to the right by a given amount.
     * Cuts the end of the string and appends it to the start
     *
     * @param string
     * @param rotationInt
     * @return String rotatedString
     */
    public static String stringRotation(String string, int rotationInt)
    {
        // if the number is larger than the length, do mod to simulate looping
        if(rotationInt > string.length())
            rotationInt = rotationInt % string.length();

        String rotatedString = string.substring(string.length()-rotationInt) +
                        string.substring(0, string.length()-rotationInt);

        System.out.println(rotatedString);

        return rotatedString;
    }
}