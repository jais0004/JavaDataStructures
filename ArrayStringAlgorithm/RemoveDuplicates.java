public class RemoveDuplicates{
    //this method avoids using stringbuffer and using any new datastructure which make the perfomance more effecient O(n^2)
public static char[] removeDuplicates(char[] str) {
    //if string is null return str
if(str == null ){
    return str;
}
//if str is only one charcter return str
if(str.length <2){
    return str;
}
// keep track of tail , where you want to put new charcter
int tail=1;
for(int i=1; i<str.length;i++){
    int j;
    for(j=0;j<tail;j++){
        //if charcter are same break the loop , which avoids the increment of j and prevents equaling to tail 
        if(str[i] == str[j]) break;
    }
    //when we encounter duplicate character tail is not equal to j and avoids appending the charcter to new string.
    //when no charcter is duplicated then tail ==i and append the new character to tail and increement the tail
    if(tail==j){
        str[tail]=str[i];
        tail++;
    }
}
 str[tail] = 0;
return str;
 }
 
 public static void main(String[] arg){
     RemoveDuplicates r = new RemoveDuplicates();
     char[] array = { 'a', 'a','b' };
     System.out.println(r.removeDuplicates(array));
 }
 
}