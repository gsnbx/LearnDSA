class StringBuilders{
    public static void main(String args[]){
        
        StringBuilder sb = new StringBuilder("The");
        System.out.println(sb);
        
        sb.append(" Conor Mcgregor");
        System.out.println(sb);
        
        sb.insert(4,"Notorious ");
        System.out.println(sb);
        
        sb.replace(4,14,"Eagle ");
        System.out.println(sb);
        
        int start = sb.indexOf("Eagle");
        int end = start + "Eagle".length();
        System.out.println(start+","+end);
        sb.replace(start, end, "Notorious");
        System.out.println(sb);
        
        System.out.println(sb.reverse());
        
        String s = sb.toString();
        System.out.println(s);
        
        System.out.println(s.getClass().getSimpleName());
        System.out.println(sb.getClass().getSimpleName());
    }
}