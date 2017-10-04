import java.io.IOException;
import java.util.Scanner;

public class ReversedBinaryNumbers {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int forReversal = input.nextInt();
        System.out.println(reverseInt(forReversal));
    }

    public static int reverseInt(int forReversal) {
        int result = 0;
        StringBuilder binary = new StringBuilder();
        int remainder = forReversal;
        while(remainder > 0) {
            if((remainder & 1) == 1) {
                binary.append("1");
                remainder -= 1;
                remainder /= 2;
            } else {
                binary.append("0");
                remainder /= 2;
            }
        }
        char[] bits = binary.toString().toCharArray();
        for(int i = 0;i < bits.length;i++) {
            int bit = 0;
            if(bits[i] == '1') bit = 2;
            result += Math.pow(bit, (bits.length - (i + 1)));
        }
        return result;
    }
}
