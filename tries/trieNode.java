package tries;

import java.util.HashMap;

public class trieNode {

    char currChar;
    HashMap <Character, trieNode> nextCharDict = new HashMap<>();
    boolean isEndOfValidWord;

    public boolean charExists( char ch){

        if ( nextCharDict.get(ch) != null  ) {
            return true;
        }
        return false;
    }
}
