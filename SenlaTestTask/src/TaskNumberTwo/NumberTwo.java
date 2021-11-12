package TaskNumberTwo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberTwo{
	
	public ArrayList<Integer> simpleFactor(int number){
		ArrayList<Integer> arrInteger = new ArrayList<Integer>();
		    for (int i = 2; i <= Math.sqrt(number); i++) {
		        while (number % i == 0) {
		            arrInteger.add(i);
		            number /= i;
		        }
		    }
		    if (number != 1) {
		        arrInteger.add(number);
		    }	
		    if(arrInteger.size() == 1) {
		    	System.out.print("Это простое число " + arrInteger.toString());
		    	System.out.println();
		    }else {
		    	System.out.print("Простые множители " + arrInteger.toString());
		    	System.out.println();
		    }
		    	return arrInteger;
	}
	
	public static void main(String [] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		NumberTwo nt = new NumberTwo();
		boolean flag = true;
		String line = "";
		while(flag) {
			System.out.println("Введите число и нажмите enter. Для выхода из программы введите слово Выход и нажмите enter");
			line  = sc.nextLine().toLowerCase().trim();
			if(line.equals("выход")) {
				sc.close();
				flag = false;
			}else {
				try {
					//простые множители соответсвенно состоят из проcтых чисел
					if(Integer.parseInt(line) > 1 && !String.valueOf(line.charAt(0)).equals("0")) {
						//Определяем простые числа
						nt.simpleFactor(Integer.parseInt(line));
					}else {
						System.out.println("Некорректный ввод");
					}
				}catch(NumberFormatException e) {
					System.out.println("Некорректный ввод");
				}
			}
		}
	}
}
