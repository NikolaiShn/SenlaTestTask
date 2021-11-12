package TaskNumberFive;

import java.util.ArrayList;

public class NumberFiveSafe {
	
	ArrayList<NumberFiveSubject> bestValueSet;
	int capacity;
	
	public ArrayList<NumberFiveSubject> getBestValueSet() {
		return bestValueSet;
	}

	public void setBestValueSet(ArrayList<NumberFiveSubject> bestValueSet) {
		this.bestValueSet = bestValueSet;
	}
	
	public NumberFiveSafe(int capacity) {
		super();
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public ArrayList<NumberFiveSubject> findBestValueSet(ArrayList<NumberFiveSubject> listSubjects){
		//убираем те у которых объём больше размера сейфа
		for(int i = 0; i < listSubjects.size(); i++) {
			if(listSubjects.get(i).getCapacity() > capacity) {
				listSubjects.remove(i);
			}
		}
		int nSubject = 1;
		System.out.println("Предметы которые остались, после отсева(убрали те у которых объём выше объёма сейфа):");
		//Выводим те предметы которые остались и даём им новую нумерацию
		for(NumberFiveSubject x: listSubjects) {
			System.out.println("№"+nSubject + " " + x);
			nSubject++;
		}
		System.out.println();
		System.out.println("Объём сейфа: " + capacity);
		//Объём сейфа
		int V = capacity;
		//Количество предметов
		int countSubjects = listSubjects.size();
		//Максимальная ценность предметов в сейфе среди первых n предметов помещённых в сейф(j)
		int[] func = new int[V+1];
		//самый оптимальный выбор, на определённом объёме сейфа
		int[][] fi = new int[countSubjects][V+1];
		
		for(int i = 0; i <= V; i++) {
			func[i] = 0;
		}
		//
		for(int i = 0; i < countSubjects; i++) {
			for(int j = V; j >= 0; j--) {
				if( (listSubjects.get(i).getCapacity() <= j ) && 
					(func[j] < func[j-listSubjects.get(i).getCapacity()] + listSubjects.get(i).getValue())) {
					func[j] = func[j-listSubjects.get(i).getCapacity()] + listSubjects.get(i).getValue();
					fi[i][j] = 1;
				}else {
					fi[i][j] = 0;
				}
			}
		}
		//определяем оптимальынй набор предметов
		int indexV = V;
		//добавляем оптимальные предметы в массив
		int[] result = new int[countSubjects];
		for(int j = countSubjects - 1; j>=0; j--) {
			if(  fi[j][indexV] == 1   ) {
				result[j] = 1;
				indexV -= listSubjects.get(j).getCapacity();
			}else {
				result[j] = 0;
			}
		}
		//вывод номеров оптимальных предметов
		System.out.println();
		System.out.println("Оптимальный набор предметов:");
		for(int x = 0; x < result.length; x++) {
			if(result[x] == 1) {
				System.out.println("Предмет №" + (x+1) + " ");
			}
		}
		return listSubjects;
	}
}
