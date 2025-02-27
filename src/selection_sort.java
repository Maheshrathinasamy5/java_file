import java.lang.reflect.Array;
import java.util.*;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pattern=sc.next();
        sc.nextLine();
        String s=sc.nextLine();
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<String,Character>hash=new HashMap<>();
        String str[]=s.split(" ");
        String solo="";
        HashSet<Character>hashing=new HashSet<>();
        for (int i = 0; i <pattern.length(); i++) {
            hashing.add((pattern.charAt(i)));
        }
        for(char ch:hashing){
            solo+=ch;
        }
        int trav=0;
        for(int i=0;i<str.length;i++){
            if(!hash.containsKey(str[i])){
                if(trav==solo.length())return false;
                hash.put(str[i],pattern.charAt(trav));
                trav++;
            }
        }
        System.out.println(hash);
        if(str.length!=pattern.length())return false;
        for (int i = 0; i< str.length; i++) {
            char ch=pattern.charAt(i);
            if(!hash.get(str[i]).equals(ch)){
                return false;
            }
        }
        return true;
    }
}
