//Code to replace space with %20
public class RemoveSpaces{
    
    public char[] removespaces(char[] str){
        //length of character length
        int length=str.length;
        //space count 
        int count=0;
        int newLength;
        char[] newStr;
        
        //count number of newspaces
        for(int i=0;i<length;i++){
            if(str[i] == ' '){
                count++;
            }
        }
        
        //length of new char array
        newLength = length + count*2;
        
        //newStr array with length as newLength
        newStr = new char[newLength];
        
        
        //replace space with '%20'
        for (int i=length-1;i>=0;i--){
            if(str[i] == ' '){
            	newStr[newLength-1] = '0';
            	newStr[newLength-2] = '2';
            	newStr[newLength-3] = '%';
                newLength = newLength - 3;
            } else {
            	newStr[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        return newStr;
    }
    
    public static void main(String[] arg){
        RemoveSpaces rs = new RemoveSpaces();
        
        char[] a = { 'M','r',' ','J','o','h','n',' ','S','m','i','t','h','*','*','*','*' };
        
        System.out.println(rs.removespaces(a));
    }
}
