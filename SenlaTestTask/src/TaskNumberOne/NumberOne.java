package TaskNumberOne;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOne {
	ArrayList<String> str;
	int sum;
	//Отделяем цифры из строки
	void checkNumbers(String s){
		for(int i = 0; i < s.length(); i++) {
			if(String.valueOf(s.charAt(i)).matches("[0-9]")) {
				str.add(String.valueOf(s.charAt(i)));
			}
		}
	}	
	//Поиск суммы цифр
	int sum(ArrayList<String> numbers) {
		if(numbers.isEmpty()) {
			System.out.println("Цифры отсутствуют, сумма =  " + 0);
		}else {
			for(String x: numbers) {
				sum += Integer.parseInt(x);
			}
			System.out.println("Cумма =  " + sum);
		}
		return sum;
	}
	
	public ArrayList<String> getStr() {
		return str;
	}
	public void setStr(ArrayList<String> str) {
		this.str = str;
	}	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public static void main(String[] args) {
		ArrayList<String> listStr = new ArrayList<String>();
		NumberOne no = new NumberOne();
		no.setStr(listStr);
		Scanner sc = new Scanner(System.in);
		String line = "";
		boolean flag = true;
		while(flag) {
			System.out.println("Введите строку и нажмите enter. Для выхода из программы введите слово Выход и нажмите enter");
			line  = sc.nextLine().toLowerCase().trim();
			if(line.equals("выход")) {
				sc.close();
				flag = false;
			}else {
				no.checkNumbers(line);
				no.sum(no.getStr());
				no.getStr().clear();
				no.setSum(0);
			}
		}
	}
}
