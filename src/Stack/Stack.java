package Stack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CHERLY CHRYS
 */
public class Stack {

    private List<Object> list = new ArrayList<Object>();
    // digunakan untuk menyimpan objek yang dimasukkan ke Stack
    private int currentIndex = -1;
    // digunakan untuk menandai index teratas pada list atau daftar
    // indeks teratasnya 0, maka variabel awal nya bernilai -1

    public void push(Object object) {
        list.add(object);
        currentIndex++;
        // digunakan untuk menambah data ke dalam Stack
        // menambah data ke dalam array list, lalu nilai currentIndex naik 1 angka
    }

    public Object pop() {
        Object object = list.remove(currentIndex);
        currentIndex--;
        return object;
        // digunakan untuk mengambil data dari Stack atau data teratas
        // setelah data diambil, nilai dari currentIndex dikurangi 1 angka
    }

    public int count() {
        return list.size();
        // digunakan untuk mengetahui jumlah data pada Stack
        // yang dipanggil adalah method aray list untuk mengetahui jumlah datanya
    }

    public Object peek() {
        return list.get(currentIndex);
        // digunakan untuk melihat data teratas yang ada pada Stack
    }

    public void clear() {
        list.clear();
        currentIndex = -1;
        // digunakan untuk menghapus seluruh data pada Stack 
        // dan mengembalikan index ke nilai semula
    }

    static class stack {

        public stack() {
        }
    }

}
