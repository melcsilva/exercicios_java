package checklist;

public class Notes {
    public static void main(String[] args){
    //  toLowerCase(  )
        String original = "abcde FGHI ABC abc DEFG    ";

        String teste = original.toLowerCase();
        String teste2 = original.toUpperCase();
        String teste3 = original.trim();
        String teste4 = original.substring(2);
        String teste5 = original.substring(2, 5);
        String teste6 = original.replace('a', 'x');
        String teste7 = original.replace("abcde", "uvwxyz");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("=================================");
        System.out.println("Original: -"+ original + "-");
        System.out.println("toLowerCase: -"+ teste + "-");
        System.out.println("toUpperCase: -"+ teste2 + "-");
        System.out.println("trim: -"+ teste3 + "-");
        System.out.println("=================================");
        System.out.println("substring: -"+ teste4 + "-");
        System.out.println("substring2: -"+ teste5 + "-");
        System.out.println("=================================");
        System.out.println("replace: -"+ teste6 + "-");
        System.out.println("replace: -"+ teste7 + "-");
        System.out.println("=================================");
        System.out.println("index of bc: "+ i);
        System.out.println("last index of bc: "+ j);

    }
}
