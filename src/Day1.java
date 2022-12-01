import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day1 {
    public static void main(String [] args) throws FileNotFoundException{
        File file = new File("src/day1.txt");
        Scanner myscan = new Scanner(file);

        int sum = 0;
        int max = 0;
        boolean breakout = false;
        int[] top3 = new int[3];
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (myscan.hasNextLine()){
            //end of elf reached
            String currline = myscan.nextLine();
            if(currline.isEmpty()){
                list.add(sum);
                sum = 0;
                //myscan.nextLine();
                continue;
            }
            System.out.println(currline);
            /*if(myscan.nextLine().isBlank()){
                myscan.nextLine();
                continue;
            }*/
            Scanner linescan = new Scanner(currline);
            sum += linescan.nextInt();
            
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("max1: " + list.get(0));
        System.out.println("max2: " + list.get(1));
        System.out.println("max3: " + list.get(2));
        System.out.println(list.get(0)+list.get(1)+list.get(2));

    }
}
