import java.util.StringTokenizer;

public class Calculation {
    public static int findMax(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int cube(int n){
        return n*n*n;
    }
    public static String reverseWord(String str){
        StringBuilder res=new StringBuilder();
        StringTokenizer token=new StringTokenizer(str,"");
         while(token.hasMoreTokens()){
             StringBuilder sb =new StringBuilder();
             sb.append(token.nextToken());
             sb.reverse();
             res.append(sb);
             res.append(" ");
         }
         return res.toString();
    }
   public static void main(String[] args){
        String str="Selfless Family";
        String sr=reverseWord(str);
        System.out.println(sr);
   }
}
