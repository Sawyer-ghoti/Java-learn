package Day11;

public class LeetCodeLongestCommonPre {
    public static void main(String[] args) {
        String[] strings = {"abandon", "about", "above"};
        System.out.println(strings.length);
        System.out.println(longestCum(strings));
    }

    public static String longestCum(String[] str) {

        if (str.length==0){
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length()<minLen){
                minLen=str[i].length();
            }
        }
        if (minLen==0){
            return "";
        }

        int ans = 0;
        String comStr = new String();
        comStr = str[-0];
        for (int i = 0; i < str.length; i++) {

            for (int i1 = 0; i1 < minLen; i1++) {
                if (str[0].charAt(i1) != str[i].charAt(i1)){
                    break;
                }
                ans++;
                comStr = comStr.substring(0,ans);
            }

        }

        return comStr;

        }

    }

