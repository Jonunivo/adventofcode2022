import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//only second part left over

public class Day1 {
    public static void main(String [] args) throws FileNotFoundException{
        //read file
        File file = new File("src/day1.txt");
        Scanner myscan = new Scanner(file);
        //vars
        int sum = 0;
        int max = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        //read & process input
        while (myscan.hasNextLine()){
            String currline = myscan.nextLine();
            //end of elf reached
            if(currline.isEmpty()){
                list.add(sum);
                sum = 0;
                continue;
            }
            //System.out.println(currline);
            //read input value & adjust sum
            Scanner linescan = new Scanner(currline);
            sum += linescan.nextInt();
            
        }

        //output
        Collections.sort(list);
        Collections.reverse(list);

        System.out.println("max1: " + list.get(0));
        System.out.println("max2: " + list.get(1));
        System.out.println("max3: " + list.get(2));
        System.out.println("sum: "+ list.get(0)+list.get(1)+list.get(2));

    }
}
