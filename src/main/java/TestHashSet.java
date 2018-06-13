import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> hairColor = new HashSet<String>();
        hairColor.add("black");
        hairColor.add("brown");
        hairColor.add("lightbrown");
        hairColor.add("red");
        hairColor.add("darkbrown");

        for (String s: hairColor){
            System.out.println(s);
        }



    }
}
