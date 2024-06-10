import java.util.Arrays;

public class strMethods {
    public static void main(String[] args) {
        String name = "Parth Dhavan Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Parth   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
