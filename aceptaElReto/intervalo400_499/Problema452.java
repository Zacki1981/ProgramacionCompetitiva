/**
 * 
 */
package intervalo400_499;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Ivan.Perez
 *
 *         https://github.com/IvanPerez9
 */
public class Problema452 {

	/*
	 * Acepta el Reto 452 - Bingo Infantil
	 * 
	 * Otra en adaByron2020_Entrenamiento1
	 */

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in);) {
			int num = entrada.nextInt();
			while (num != 0) {
				Set<Integer> conjunto = new TreeSet<>();
				int[] array = new int[num];
				for (int i = 0; i < num; i++) {
					array[i] = entrada.nextInt();
				}
				for (int i = 0; i < num - 1; i++) {
					for (int j = i + 1; j < num; j++) {
						conjunto.add(Math.abs(array[i] - array[j]));
					}
				}
				Iterator<Integer> i = conjunto.iterator();
				while (i.hasNext()) {
					System.out.print(i.next());
					if (i.hasNext()) {
						System.out.print(" ");
					} else {
						System.out.println();
					}
				}
				num = entrada.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
	}
}
