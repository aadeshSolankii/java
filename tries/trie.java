package tries;


public class trie {

    static trieNode rootNode = new trieNode();
    static int numberOfWords;


    public static void addWord(String word){

        char[] currWordInArray = word.toUpperCase().toCharArray();

        numberOfWords += 1;
        
        trieNode temp = rootNode;
        for( int i = 0; i < currWordInArray.length; i++ ){
            
            if ( temp.charExists( currWordInArray[i] ) )  {
                
                temp = temp.nextCharDict.get( currWordInArray[i] );
                temp.prefixCount++;
                
            }
            else{

                trieNode newTrieNode = new trieNode();
                newTrieNode.currChar = currWordInArray[i];
                newTrieNode.prefixCount = 1;

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

    public static int getNumberOfWords(){
        return numberOfWords;
    }

    public static int getPrefixCount(String prefix){

        char[] prefixInArray = prefix.toUpperCase().toCharArray();

        trieNode temp = rootNode;

        for( int i = 0; i < prefixInArray.length; i++ ){

            if ( temp.nextCharDict.get( prefixInArray[i] ) != null ) {
                temp = temp.nextCharDict.get(prefixInArray[i]);
            } 

        }

        return temp.prefixCount;

    }

}
