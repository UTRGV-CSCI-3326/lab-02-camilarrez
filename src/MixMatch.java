public class MixMatch{
    public static void main(String[] args){
        String greeting = "Hello";
        char letter = 'a';
        short short_num = 50;
        int x = 3;
        long long_num = 2000000L;
        float y = 1.4f;
        double z = 4.99;
        boolean flag = false;

        System.out.println(greeting + " <- String, a string of text such as 'good morning'");
        System.out.println(letter + " <- char, a single character letter");
        System.out.println(short_num + " <- short, small numbers ranging from -32,768 to 32,768");
        System.out.println(x + " <- integer, an integer number such as -3, 56, 190000");
        System.out.println(long_num + " <- long, stores larger numbers up to the quintillion(9,223,372,036,854,775,807)(requires l)");
        System.out.println(y + " <- float, a number with a decimal precision of about 7(requires f)");
        System.out.println(z + " <- double, number with a decimal precision of about 15");
        System.out.println(flag + " <- boolean, stores true or false");

        System.out.println(greeting + " " + letter + " " + short_num + " " + x + " " + long_num + " " + y + " " + z + " " + flag);

    }
}