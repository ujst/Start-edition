class Methods {

    String textFizz = "Fizz";
    String textBuzz = "Buzz";

    void outFizzOutBuzz(int i) {
        int j = i;
        if (i%15 == 0)
            System.out.println(textFizz + textBuzz);
        else if (j%3 == 0)
            System.out.println(textFizz);
        else if (j%5 == 0)
            System.out.println(textBuzz);
        else
            System.out.print(i + " ");
    }
}

public class UsingMethods {

    public static void main(String[] args) {
        Methods textOutOf = new Methods();

        for (int i = 1; i < 101; i++) {
            textOutOf.outFizzOutBuzz(i);

        }
    }
}
