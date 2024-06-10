package tries;


public class trie {

    static trieNode rootNode = new trieNode();


    public static void enterWord(String word){

        char[] currWordInArray = word.toUpperCase().toCharArray();
        
        trieNode temp = rootNode;
        for( int i = 0; i < currWordInArray.length; i++ ){
            
            if ( temp.charExists( currWordInArray[i] ) )  {
                temp = temp.nextCharDict.get( currWordInArray[i] );
            }
            else{

                trieNode newTrieNode = new trieNode();
                newTrieNode.currChar = currWordInArray[i];

                temp.nextCharDict.put(currWordInArray[i], newTrieNode);
                temp = newTrieNode;
            }

            if ( i == (currWordInArray.length)-1 ) {
                if (temp.isEndOfValidWord) {
                    break;
                }
                temp.isEndOfValidWord = true;
            }

        }

        System.out.println("end of function");
        

    }

    public static boolean doesWordExist(String word){

        char[] currWordInArray = word.toUpperCase().toCharArray();
        boolean flag = false;
        trieNode temp = rootNode;
        for( int i = 0; i < currWordInArray.length+1; i++ ){

            if ( (i == (currWordInArray.length) ) ) {
                if (temp.isEndOfValidWord) {
                    flag = true;
                }
                break;
            }

            if (temp == null) {
                break;
            }

            // else{
            //     if (temp.charExists(currWordInArray[i]) == false) {
            //         break;
            //         //return false;
            //     }
            // }

            temp = temp.nextCharDict.get(currWordInArray[i]);
        }

        return flag;
    }

}
