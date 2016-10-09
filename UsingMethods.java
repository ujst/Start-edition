/**
 * Created by VV on 09.10.2016.
 */
class Methods {
    void Counter(byte i) {
        System.out.print(i + " ");
    }
    void OutFizzBuzz(byte i) {
        byte j = i;
        String textFizz = "Fizz";
        String textBuzz = "Buzz";
        String textOuter = new String ();

        if (j%3 == 0)
            textOuter = textFizz;
        if (j%5 == 0)
            textOuter = textBuzz;
        if (j%15 == 0)
            textOuter = (textFizz + textBuzz);
        System.out.print(textOuter + " ");
    }
}

public class UsingMethods {

    public static void main(String[] args) {
        Methods textOutOf = new Methods();

        for (byte i = 1; i < 101; i++) {

            if ((i%3 == 0) || (i%5 == 0) || (i%15 == 0))
                textOutOf.OutFizzBuzz(i);
            else
                textOutOf.Counter(i);
        }
    }
}
