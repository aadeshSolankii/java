package tries;

public class client {

    public static void main(String[] args) {
        
        trie.addWord("all");
        trie.addWord("algo");
        trie.addWord("bAt");
        System.out.println("done feeding words, now searching...");

        System.out.println(trie.doesWordExist("algo"));
        System.out.println(trie.doesWordExist("alg"));
        System.out.println(trie.doesWordExist("bat"));

        System.out.println(trie.numberOfWords);

        System.out.println(trie.getPrefixCount("al"));
        System.out.println(trie.getPrefixCount("baT"));
        System.out.println(trie.getPrefixCount("alg"));
        System.out.println(trie.getPrefixCount("a"));
    }

}
