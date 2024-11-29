package Strings;

public class largestString {
    public static void main(String[] args) {
        String[] words={"Hello", "Vamsidhar","Vijay"};
        String  largest="";
        for(String i:words){
            if(i.length()>largest.length()){
                largest=i;
            }

            
        }
        System.out.println("The largest string is" + largest);
        
        
    }
    
}
