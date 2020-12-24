package Day11;

public class LeetCodeLongestCommonPre {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(strings.length);
        System.out.println(strings[0].charAt(2));
        System.out.println(longestCum(strings));
    }

    public static String longestCum(String[] strs) {

        if (strs.length==0){
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length()<minLen){
                minLen=strs[i].length();
            }
        }
        if (minLen==0){
            return "";
        }

        String comStr = strs[0];
        for (int i = 0; i < strs.length; i++) {
            int j = 0;
            for(;j<comStr.length()&&j<strs[i].length();j++) {
                if (comStr.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            comStr = comStr.substring(0,j);
            if (comStr.equals(""))
                return comStr;

        }
        return comStr;
    }
}


