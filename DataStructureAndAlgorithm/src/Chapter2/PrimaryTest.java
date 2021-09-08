package Chapter2;

import Chapter4.Str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * @author zhujiayuan
 * @version 2021-09-04-13:58
 */
public class PrimaryTest {
    public static void main(String[] args) {
        char a='a';
        char b='b';
        System.out.println(a-b);
        System.out.println("A ,wFr,345d,fwe".toLowerCase());

    }
    public int strStr(String haystack, String needle) {//字符串匹配问题；
        if(needle.length()==0) return 0;
        char[] c1=haystack.toCharArray();
        char[] c2=needle.toCharArray();
        for(int i=0;i<c1.length-c2.length+1;i++){
            int j=0;
            while (c1[i+j]==c2[j]){
                j++;
                if(j==c2.length){
                    return i;
                }
            }
        }
        return -1;
    }
    public boolean isPalindrome(String s) {
        s.toLowerCase();
        char[] c=s.toCharArray();
        int i=0;
        int j=c.length-1;
        while (i<j){
            if(c[i]<97||c[i]>122){
                i++;
            }else if(c[j]<97||c[j]>122){
                j--;
            }else {
                if(c[i]!=c[j]){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0) return "";
        String s=strs[0];
        int i=1;
        while (i<strs.length){
            while (strs[i].indexOf(s)!=0){
                s=s.substring(0,s.length()-1);
            }
            if(s=="") return "";
            i++;
        }
        return s;

    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] chars=s.toCharArray();
        char[] chart=t.toCharArray();
        int[] arr=new int[26];
        int a;
        for (int i=0;i<s.length();i++){
            a=chars[i]-'a';
            arr[a]++;
            a=chart[i]-'a';
            arr[a]--;
        }
        for(int i:arr){
            if(i!=0) return false;
        }
        return true;
    }

    public int firstUniqChar(String s) {
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }





    public int reverse(int x) {  //Primary String t2;
        int res=0;
        int t=0;
        int newRes=0;
        while (x!=0){
            t=x%10;
            newRes=res*10+t;
            if((newRes-t)/10!=res){
                return 0;
            }
            res=newRes;
            x=x/10;
        }
        return res;
    }
}
