package Stack;

import Stack.Stack.stack;
import java.util.List;

/**
 *
 * @author CHERLY CHRYS
 */
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("BUKU HP");
        stack.push("BUKU LAPTOP");
        stack.push("BUKU KOMPUTER");

        int count = stack.count();
        Object object = stack.peek();
        System.out.println("Jumlah Data Pada Stack : " + count);
        System.out.println("Data Teratas Pada Stack : " + object);

        System.out.println("------------------------------------");

        object = stack.pop();
        System.out.println("Objek yang diambil (Pop) : " + object);
        count = stack.count();
        System.out.println("Jumlah Data Pada Stack setelah Pop: " + count);
        object = stack.peek();
        System.out.println("Data Teratas Pada Stack setelah Pop: " + object);
    }
}
