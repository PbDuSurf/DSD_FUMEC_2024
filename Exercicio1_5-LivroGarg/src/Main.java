import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		for(int i =0; i < 10000; i++) {
			lista.add(1);		
		}
		int numero = 5000;
		
		BuscaThread t1 = new BuscaThread (lista,numero, 'c');
		BuscaThread t2 = new BuscaThread (lista,numero, 'd');
		
		t1.setOutraThread(t2);
		t2.setOutraThread(t1);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			System.out.println("Erro");
		}
	if (t1.isNumeroEncontrado() || t2.isNumeroEncontrado()) {
		System.out.println("Número encontrado");
	}else {
		System.out.println("Número nao encontrado");
	}
  }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
