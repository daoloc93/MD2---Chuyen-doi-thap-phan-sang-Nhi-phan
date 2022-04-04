import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecimalToBinary {

    public void toBinary(int decimal){
        Stack <Integer> binary = new Stack<>();
        int index = 0;

        while (decimal > 0) {
            binary.insertElementAt(decimal%2,0);
            decimal /=2;
        }
        for (Integer integer:binary) {
            System.out.print(integer);
        }
    }
}
