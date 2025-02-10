package ArrayList_Vector;

import java.util.ArrayList;
import java.util.Vector;

public class arrayListVector {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		// menambah elemen ke dalam ArrayList
		al.add("Ayam");
		al.add("Kucing");
		al.add("Gajah");
		al.add("Anjing");
		
		System.out.println("Isi dari ArrayList: " + al);
		
		// mengurangi elemen dari ArrayList
		al.remove(1);
		
		System.out.println("Isi dari ArrayList setelah elemen di index 1 dihapus: " + al);
		
		al.remove("Gajah");
		
		System.out.println("Isi dari ArrayList setelah elemen \"Gajah\" dihapus: " + al);
		
		// menyisipkan elemen ke dalam ArrayList
		al.add(1, "Jerapah");
		
		System.out.println("Isi dari ArrayList setelah elemen \"Jerapah\" disisipkan ke index 1: " + al + "\n");

		Vector v = new Vector();
		
		// menambah elemen dalam Vector
		v.add(69);
		v.add(20);
		v.add(42);
		v.add(1337);
		
		System.out.println("Isi dari vector: " + v);
		
		// mengurangi elemen dari vector
		v.remove(1);
		
		System.out.println("Isi dari vector setelah elemen di index 1 dihapus: " + v);

		v.remove(Integer.valueOf(42));
		
		System.out.println("Isi dari vector setelah elemen 42 dihapus: " + v);
		
		// menyisipkan elemen ke dalam vector
		v.add(1, 100);
		
		System.out.println("Isi dari vector setelah elemen 100 disisipkan ke index 1: " + v);		
	}
}