//proving Strings are immutable
public class ImmutableStrings {
    public static void main(String[] args){
        String s1="Target ";
        String s2="Corporation";
        s1.concat(s2);
        //It prints Target even after concatenation because Strings are immutable they cannot be changed
        System.out.println(s1);
        //To print Target corporation we need to store that in another variable
        String s3=s1.concat(s2);
        System.out.println(s3);
        //Though the strings s1 and s3 are same they have different resources because strings are immutable
        if(s1==s3){
            System.out.println("s1 and s3 have same references");
        }
        else{
            System.out.println("s1 and s3 have different references");
        }
    }
}
