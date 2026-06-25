class CheckPalindrome{
    public static void main(String args[]){
        
        String str = "suxus";
        
        //by using inbuild method 
        StringBuilder sb = new StringBuilder(str);
        
        if(sb.reverse().toString().equals(str))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
            
        System.out.println(isPalindrome(str));
    }
    
    public static String isPalindrome(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        return rev.equals(s)?"Palindrome":"Not Palindrome";
    }
}