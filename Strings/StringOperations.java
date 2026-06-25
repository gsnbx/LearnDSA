class StringOperations{
    
    public static void main(String args[]){
        
        String str = new String("The Notorious");
        String str1 = new String("mr.Conor Mcgregor");
        
        System.out.println(str);
        System.out.println(str.length());
        
        System.out.println(str.charAt(4));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        
        System.out.println(str.indexOf("N"));
        System.out.println(str.startsWith("Notorious"));
        System.out.println(str.endsWith("The"));
        System.out.println(str.trim());
        System.out.println(str.equals(str1));
        System.out.println(str.substring(4,13));
        int start = str1.indexOf('.')+1;
        int end = str1.indexOf(' ');
        System.out.println(str1.substring(start, end));
        System.out.println(str1.replace("Conor","khabib"));
  }
   
}