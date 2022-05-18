import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

       public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        if (s.length() == 1) {
            return s.length();
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {

                if (s.charAt(i) != s.charAt(j)) {
                    set.add(s.charAt(i));
                    set.add(s.charAt(j));
                }
                if (s.charAt(i)==s.charAt(j++)){
                    set.add(s.charAt(i));
                }

            }
        }
        return set.size();

    }


}
