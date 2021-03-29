package level2;

import java.util.ArrayList;

public class SkillTree {
    public static void main(String[] args){
        Solutions s = new Solutions();
        System.out.println(s.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
}

class Solutions {
    public int solution(String skill, String[] skill_trees) {
        ArrayList<Character> skills =new ArrayList<>();
        int answer = 0;
        for (String i : skill_trees) {
            boolean rightSkillTree = true;
            for (int j = 0; j<i.length(); j++){
                if (skill.contains(String.valueOf(i.charAt(j))))
                    skills.add(i.charAt(j));
            }

            for (int k=0;k<skills.size();k++){
                if (skills.get(k) != skill.charAt(k)) {
                    rightSkillTree = false;
                    break;
                }
            }
            skills.clear();
            if (rightSkillTree) {
                answer++;
            }

        }

        return answer;
    }
}