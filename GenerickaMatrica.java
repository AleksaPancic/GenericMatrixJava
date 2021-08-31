package aleksa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenerickaMatrica<T> {
	ArrayList<ArrayList<T>> mat = new ArrayList<ArrayList<T>>();
	GenerickaMatrica(){
	}
	void dodajvrsti(ArrayList<T> v, T x) {
		v.add(x);
	}
	void dodajmatrici(ArrayList<T> v) {
		mat.add(v);
	}
	public class it implements Iterator<T>{
		int indeks;
		@Override
		public boolean hasNext() {
			if(indeks < mat.size()) {
				return true;
			}
			return false;
		}

		@Override
		public T next() {
			ArrayList<T> tmp = null;
			T tmp1 = null;
			if(!hasNext()) {
				throw new NoSuchElementException("Nema sledece u nizu");	
			}
			tmp = mat.get(indeks);
			tmp1 = tmp.get(indeks);
			indeks++;
			return tmp1;
		}
	}
	public ArrayList<Integer> get(int i) {
		// TODO Auto-generated method stub
		 return (ArrayList<Integer>) mat.get(i);
	}
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new it();
	}
}
