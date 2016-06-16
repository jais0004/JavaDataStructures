public class UniqueCharacter{
    
    
    //This method has Big(O) of O(n) as we are having only one for loop,
    //there is alternate solution which will check each char to all other char in string which has permonace of O(n^2)
    public boolean checkUniqueString(String str){
        
        //Assuming str only contains ASCII value, if not logic will remain same only the datatypes to store value will change
        boolean[] uniqueChar = new boolean[256];
        
        for(int i=0; i< str.length(); i++){
            int value = str.charAt(i);
            if(uniqueChar[value]) return false;
            uniqueChar[value]=true;
        }
        
        return true;
    }

     public static void main(String []args){
         
         UniqueCharacter h = new UniqueCharacter();
        System.out.println(h.checkUniqueString("Hel"));
        System.out.println(h.checkUniqueString("Helllo"));
     }
}