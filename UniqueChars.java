/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String str = "" ;
        str = str + s.charAt(0);
        boolean again = false; // Flag that checks if a char already exists
        for( int i = 1; i< s.length() ; i++){ // iterate over an original str
            for( int j = 0 ; j < i; j++){ // iterate over an original str till the ith index
                if( s.charAt(i) == s.charAt(j) && s.charAt(i)!= 32 ){ // racecar
                    again = true;
                }    
            }
            if (again == false){

                str = str +s.charAt(i);
            }
            again = false;    
        } 
        return str;
    }
}