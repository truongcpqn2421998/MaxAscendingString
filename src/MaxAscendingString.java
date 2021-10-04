import java.util.ArrayList;
import java.util.Scanner;

public class MaxAscendingString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String:");
        String string= scanner.nextLine();
        ArrayList<Character> maxString= new ArrayList<>();
        for (int i = 0; i < string.length();i++){
            ArrayList<Character> list= new ArrayList<>();
            list.add(string.charAt(i));
            for (int j = i+1; j <string.length(); j++) {
                if(string.charAt(j)>list.get(list.size()-1)){
                    list.add(string.charAt(j));
                }
            }
            if (list.size()>maxString.size()){
                maxString.clear();
                maxString.addAll(list);
            }
            list.clear();
        }
        for (Character character: maxString
             ) {
            System.out.println(character);
        }
    }
}
