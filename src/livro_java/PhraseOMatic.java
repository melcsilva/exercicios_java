package livro_java;

public class PhraseOMatic {
     public static void main(String[] args) {
        String[] wordListOne = {"neurodivergent", "i'm autistic", "embrace autism", "audhd", "hyperfocus", "spoons of the day", "what you think of", "i need that", "you have to", "i'm super"};

        String[] wordListTwo = {"six days", "i love chocolate", "i hate you", "i adore this woman", "you're a lesbian", "hi gay", "i love woman", "i love my girlfriend", "she's beautiful", "i need to marry her"};

        String[] wordListThree = {"love the rain", "love the sun", "hate bolsonaro", "travel", "hi you", "ciao", "french", "i want", "fluent"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Precisamos de " + phrase);
     }
}
