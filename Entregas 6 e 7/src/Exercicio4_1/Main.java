package Exercicio4_1;

import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Object[][] pares = new String[][] { { "Inglaterra", "It�lia", "Jap�o", "Brasil", "EUA", "Espanha", "Canad�" }, { "Manchester", "Mil�o", "T�quio", "S�o Paulo", "Boston", "Madrid", "Toronto" } };

		@SuppressWarnings("rawtypes")
		Map mapa = new NovoMapa(pares);
		for (@SuppressWarnings("rawtypes")
		Iterator iter = mapa.entrySet().iterator(); iter.hasNext();) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
	}
}
