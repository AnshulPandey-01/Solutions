// Example input: 95992532  output: 99922553

import java.util.*;

class SortOnFrequency{
    public static void main(String args[]){
        String s = new Scanner(System.in).nextLine();
        int n[] = new int[s.length()];
        
        for(int i = 0; i<s.length(); i++){
            n[i] = s.charAt(i) - '0';
        }
        Map< Integer, Integer> m =  new HashMap<Integer, Integer>();
        int x[] = {0,1,2,3,4,5,6,7,8,9};
        Arrays.sort(n); int a = 0, c = 0; boolean k = false;
        
        for(int i = 0; i<n.length; i++){
            if(n[i]==x[a]){
                c++;
                k = true;
            }else{
                if(k){
                    m.put(x[a], c);
                }k = false;
                a++;
                i--;
                c=0;
            }
        }
        m.put(x[a], c);
        while(!m.isEmpty()){
            int key = Collections.max(m.entrySet(), Map.Entry.comparingByValue()).getKey();
            int value = m.get(key);
            for(int j = 0; j<value; j++){
                System.out.print(key);
            }
            m.remove(key);
        }
        System.out.println();
    }
}
