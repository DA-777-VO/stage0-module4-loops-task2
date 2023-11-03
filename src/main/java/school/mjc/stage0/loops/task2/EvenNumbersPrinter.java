package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {

//        int counter = 0;
//        while (0 < printTillInclusive){
//            if (counter % 2 == 0) {
//                System.out.println(counter);
//            }
//            counter++;
//        }


        int i = 0;
        while (i <= printTillInclusive) {
            System.out.println(i);
            i += 2;
        }



    }
}
