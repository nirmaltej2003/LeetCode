class Solution {
    public static boolean isValid(String s) 
    {
        while(s.contains("()")||s.contains("{}")||s.contains("[]"))
        {
            s=s.replace("()","")
             .replace("{}","")
             .replace("[]","");
        }
        return s.isEmpty();
    }
    public static void main(String args[])
    {
        String s="{}";
        System.out.println(isValid(s));
    }
}