/**
 * Created by VV on 12.10.2016.
 */
class TaskPrint {

    void myPrint (int count, int toPrint) {
        for (int i = 1; i < count + 1; i++) {
            System.out.print(toPrint + " ");
            System.out.println();
        }
    }

    void myPrint (int count, double toPrint) {
        for (int i = 1; i < count + 1; i++) {
            System.out.print(toPrint + " ");
            System.out.println();
        }
    }

    void myPrint (int count, float toPrint) {
        for (int i = 1; i < count + 1; i++) {
            System.out.print(toPrint + " ");
            System.out.println();
        }
    }

    void myPrint (int count, String toPrint) {
        for (int i = 1; i < count + 1; i++) {
            System.out.print(toPrint + " ");
            System.out.println();
        }
    }
}

public class MyPrintSolution {
    public static void main(String[] args) {

        TaskPrint printData = new TaskPrint();

        printData.myPrint(4, 5.3);
        printData.myPrint(7, "Excellent");
        printData.myPrint(7, 25);
        
    }
}
