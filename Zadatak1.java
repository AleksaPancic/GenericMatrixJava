package aleksa;

import java.util.ArrayList;
import java.util.Iterator;

public class Zadatak1 {

	public static void main(String[] args) {
		GenerickaMatrica<Integer> mat = new GenerickaMatrica<Integer>();
		ArrayList<Integer> vrsta1 = new ArrayList<Integer>();
		ArrayList<Integer> vrsta2 = new ArrayList<Integer>();
		ArrayList<Integer> vrsta3 = new ArrayList<Integer>();
		mat.dodajvrsti(vrsta1, 1);
		mat.dodajvrsti(vrsta1, 2);
		mat.dodajvrsti(vrsta1, 3);
		mat.dodajmatrici(vrsta1);
		mat.dodajvrsti(vrsta2, 4);
		mat.dodajvrsti(vrsta2, 5);
		mat.dodajvrsti(vrsta2, 6);
		mat.dodajmatrici(vrsta2);
		mat.dodajvrsti(vrsta3, 7);
		mat.dodajvrsti(vrsta3, 8);
		mat.dodajvrsti(vrsta3, 9);
		mat.dodajmatrici(vrsta3);
		Iterator it = mat.iterator();
		while(it.hasNext()) {
			ArrayList<Integer> v = (ArrayList<Integer>) it.next();
			Iterator<Integer> vit = v.iterator();
			while(vit.hasNext()) {
				System.out.print(vit.next());
			}
			System.out.println();
			}
		int n = 3;
		int m = 3;
		int br=1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(mat.get(i).get(j));
			}
			System.out.println();
		}
		for(int i = 0; i < n; i++) {
				br++;
				if(br%2 == 0)
				{
				System.out.print(mat.get(i).get(i));
				}
		}
	}

	}
		

	
