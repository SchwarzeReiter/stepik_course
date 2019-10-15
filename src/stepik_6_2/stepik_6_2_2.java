package stepik_6_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class stepik_6_2_2 {
    public class Main {

        public static void main(String[] args) throws Exception {

            try {
                Scanner scanner = new Scanner(new Scanner(System.in).nextLine());
                ArrayList<Integer> array = new ArrayList<>();
                for (int i = 1; scanner.hasNext(); i++) {
                    if ((i % 2) == 0) {
                        array.add(scanner.nextInt());
                    } else {
                        scanner.nextInt();
                    }

                }

                Collections.reverse(array);

                for (Integer i : array) {
                    System.out.print(i + " ");
                }
            }
            catch (NoSuchElementException e){
                System.out.println(" ");
            }
        }

    }

}
