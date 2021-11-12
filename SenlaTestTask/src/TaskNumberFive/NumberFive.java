package TaskNumberFive;

import java.util.ArrayList;
import java.util.Random;
//метод подсчёта оптимального набора предметов находится в NumberFiveSafe
public class NumberFive {
	public static void main(String[] args) {
		Random random = new Random();
		//Передаём значение объёма сейфа через конструктор
		NumberFiveSafe nfsafe = new NumberFiveSafe(68);
		ArrayList<NumberFiveSubject> arrlistNumberFiveSafe = new ArrayList<NumberFiveSubject>();
		//генерируем предметы NumberFiveObject(объём, ценность)
		//изначальное количество предметов задаём в условии цикла for 
		for(int i = 0; i < 50; i++) {
			arrlistNumberFiveSafe.add(new NumberFiveSubject(Math.abs(random.ints(1, 80).findFirst().getAsInt()), 
										  Math.abs(random.ints(1, 80).findFirst().getAsInt())));
		}
		nfsafe.findBestValueSet(arrlistNumberFiveSafe);
	}
}
