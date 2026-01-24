import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class RomanToInteger {
    private static final HashMap<Character, Integer> romanToIntValueMap = new LinkedHashMap<Character, Integer>();
    private static final HashMap<Character, List<Character>> specialMap = new HashMap<Character, List<Character>>();

    static{
        romanToIntValueMap.put('I',1);
        romanToIntValueMap.put('V',5);
        romanToIntValueMap.put('X',10);
        romanToIntValueMap.put('L',50);
        romanToIntValueMap.put('C',100);
        romanToIntValueMap.put('D',500);
        romanToIntValueMap.put('M',1000);

        //enrich special Map
        List<Character> iList = new ArrayList<Character>();
        iList.add('V');
        iList.add('X');
        List<Character> xList = new ArrayList<Character>();
        xList.add('L');
        xList.add('C');
        List<Character> cList = new ArrayList<Character>();
        cList.add('D');
        cList.add('M');
        specialMap.put('I',iList);
        specialMap.put('X',xList);
        specialMap.put('C',cList);

    }
    public int romanToInt(String s) {
        int value = 0;
        boolean isSpecialCase= false;
        for(int i=0; i<s.length();i++){
            Character character = s.charAt(i);
            int mappedValue;
            if (isSpecialCase){
                mappedValue = checkSpecialCase(character);
                isSpecialCase = false;
            } else{
                mappedValue = romanToIntValueMap.get(character);
            }
            value+=mappedValue;
            if(i+1<s.length() && specialMap.containsKey(character)){
                if(specialMap.get(character).contains(s.charAt(i+1))) {
                    isSpecialCase = true;
                }
            }
        }
        return value;
    }

    private int checkSpecialCase(char ch){
        return switch (ch) {
            case 'V' -> 3;
            case 'L' -> 30;
            case 'X' -> 8;
            case 'C' -> 80;
            case 'D' -> 300;
            case 'M' -> 800;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String romanStr = "MCMXCIV";
        int result = romanToInteger.romanToInt(romanStr);
        System.out.println("The integer value of Roman numeral " + romanStr + " is: " + result);
    }
}
