
import edu.princeton.cs.algs4.*;
import java.util.Scanner;
import java.io.*;

public class RandomWord {
    public static void main(String[] args) {
        double i = 1;
        String winner ="";
        if(!args[0].contains(".txt")) {
            for (String arg : args) {
                if(StdRandom.bernoulli(1/i)) 
                 winner = arg;
                i++;
            }
        }else {
            try {
                File file = new File(args[0]);
                Scanner input = new Scanner(file);
                while (input.hasNext()){
                    String word = input.next();
                    if(StdRandom.bernoulli(1/i))
                        winner = word;
                    i++;
                }
                input.close();
            }catch(FileNotFoundException e)
            {}
        }
        
        StdOut.println(winner);
    }
}
