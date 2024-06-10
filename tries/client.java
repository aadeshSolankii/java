package tries;

public class client {

    public static void main(String[] args) {
        
        trie.enterWord("all");
        trie.enterWord("algo");
        trie.enterWord("bAt");
        System.out.println("done feeding words, now searching...");

        System.out.println(trie.doesWordExist("algo"));
        System.out.println(trie.doesWordExist("alg"));
        System.out.println(trie.doesWordExist("bat"));
    }

}
