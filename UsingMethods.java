class Methods {

    String textFizz = "Fizz";
    String textBuzz = "Buzz";

    void Counter(int i) {
        System.out.print(i + " ");
    }

    void OutFizzBuzz(int i) {
        int j = i;

        if (j%3 == 0)
            System.out.print(textFizz + " ");
        if (j%5 == 0)
            System.out.print(textBuzz + " ");
        if (j%15 == 0)
            System.out.print(textFizz + textBuzz + " ");
    }
}

public class UsingMethods {

    public static void main(String[] args) {
        Methods textOutOf = new Methods();

        for (int i = 1; i < 101; i++) {

            if ((i%3 == 0) || (i%5 == 0) || (i%15 == 0))
                textOutOf.OutFizzBuzz(i);
            else
                textOutOf.Counter(i);
        }
    }
}
