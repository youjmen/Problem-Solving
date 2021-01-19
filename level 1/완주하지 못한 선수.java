import java.util.Arrays;
import java.util.List;

public class Solution {


    public static void main(String[] args){
        String[] a = {"mislav","stanko","mislav","ana"};
        String[] b = {"stanko","mislav","ana"};
        System.out.println(solution(a,b));

    }

    public static String solution(String[] participant, String[] completion) {
        List<String> participantList =Arrays.asList(participant);
        List<String> completionList =Arrays.asList(completion);

        participantList.sort(null);
        completionList.sort(null);

        for(int i =0; i<completionList.size();i++){
            if(!participantList.get(i).equals(completionList.get(i)))
                return participantList.get(i);
        }
        return participantList.get(participantList.size()-1);
    }
}
