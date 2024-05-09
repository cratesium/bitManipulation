 import java.util.*;;
 public class ReverseString{
    public   String countBinary(int n ){
        StringBuffer sf = new StringBuffer("");
        while( n!=0){
            if(n%2==1) sf.append(1);
            else sf.append(0);
            n=n/2;
        }
        sf.reverse();
        

        return sf+"";


    }
    public int countDecimal(String str){
        int cal=0;
        int i=0;
        if( str.length()==0) return -1;
        int j= str.length()-1;
        while (j>=0) {
            cal+=(int)(Math.pow(2,i++ ))*Integer.parseInt(""+str.charAt(j--));

            
        }

        return cal;
    }

 public static void main(String[] args) {
    ReverseString obj= new ReverseString();
    System.out.println("binary equivalent is ");
    System.out.println(obj.countBinary(13));

    System.out.println("decimal equivalent is : ");
    System.out.println(obj.countDecimal("101"));

    

    
 }

 }