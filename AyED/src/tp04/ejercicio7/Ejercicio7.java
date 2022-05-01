package tp04.ejercicio7;
import tp04.ejercicio1.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedDeAguaPotable<Character> red;
		ArbolGeneral<Character> A = new ArbolGeneral<Character>('A');
		ArbolGeneral<Character> B = new ArbolGeneral<Character>('B');
		ArbolGeneral<Character> C = new ArbolGeneral<Character>('C');
		ArbolGeneral<Character> D = new ArbolGeneral<Character>('D');
		ArbolGeneral<Character> E = new ArbolGeneral<Character>('E');
		ArbolGeneral<Character> F = new ArbolGeneral<Character>('F');
		ArbolGeneral<Character> G = new ArbolGeneral<Character>('G');
		ArbolGeneral<Character> H = new ArbolGeneral<Character>('H');
		ArbolGeneral<Character> I = new ArbolGeneral<Character>('I');
		ArbolGeneral<Character> J = new ArbolGeneral<Character>('J');
		ArbolGeneral<Character> K = new ArbolGeneral<Character>('K');
		ArbolGeneral<Character> L = new ArbolGeneral<Character>('L');
		ArbolGeneral<Character> M = new ArbolGeneral<Character>('M');
		ArbolGeneral<Character> N = new ArbolGeneral<Character>('N');
		
		A.agregarHijo(B);
		A.agregarHijo(C);
		A.agregarHijo(D);
		A.agregarHijo(E);
		
		C.agregarHijo(F);
		C.agregarHijo(G);
		
		G.agregarHijo(L);
		
		D.agregarHijo(H);
		D.agregarHijo(I);
		D.agregarHijo(J);
		D.agregarHijo(K);
		
		J.agregarHijo(M);
		J.agregarHijo(N);
		
		red = new RedDeAguaPotable<Character>(A);
		
		System.out.println("El minimo caudal para una red de 1000 es "+red.minimoCaudal(1000));
		System.out.println("El minimo caudal para una red de 2000 es "+red.minimoCaudal(2000));
	}

}
