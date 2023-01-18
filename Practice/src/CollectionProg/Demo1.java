package CollectionProg;

import java.util.Vector;

class Demo {
	public static void show() {
		// print A to Z char
		Vector v1 = new Vector();
		for (char i = 'A'; i <= 'Z'; i++) {
			v1.add(i);
		}
	//	return v1;
		System.out.println(v1);
	}

}	

public class Demo1 {

	public static void main(String[] args) {
		//edited from github.
		System.out.println();
		Demo.show();

	}
}
