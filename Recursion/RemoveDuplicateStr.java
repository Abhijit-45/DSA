package Recursion;

public class RemoveDuplicateStr {
    public static StringBuilder removeDuplicate(String str, StringBuilder newStr, int i, boolean arr[]) {
        if(i == str.length()) {
            return newStr;
        }

        char ch = str.charAt(i);

        if(arr[ch-'a'] == false) {
            arr[ch-'a'] = true;
            removeDuplicate(str, newStr.append(ch), i+1, arr);
            return newStr;
        }
        // for(int j=0; j<newStr.length(); j++) {
        //     if(newStr.charAt(j) == ch) {
        //         removeDuplicate(str, newStr, i+1, arr);
        //         return newStr;
        //     }
        // }

        removeDuplicate(str, newStr, i+1, arr);
        return newStr;
    }
    public static void main(String args[]) {
        String str = "appnnacollege";
        System.out.println(removeDuplicate(str, new StringBuilder("") , 0, new boolean[26]));
    }
}
