//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, String> phonebook = new HashMap<String, String>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name, Integer.toString(phone));
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(phonebook.containsKey(s))
            {
                System.out.println(s+"="+phonebook.get(s));
                // Write code here
        }
        else
        {
            System.out.println("Not found");
        }
        }
        in.close();
    
}
}
