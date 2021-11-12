package TaskNumberFour;

import java.util.Scanner;

public class NumberFour {
	
	String[] eachSymbol;
	String[] arrResult;
	
	public String[] getArrResult() {
		return arrResult;
	}

	public void setArrResult(String[] arrResult) {
		this.arrResult = arrResult;
	}

	public String[] getEachSymbol() {
		return eachSymbol;
	}

	public void setEachSymbol(String[] eachSymbol) {
		this.eachSymbol = eachSymbol;
	}

	public String[] printNumber() throws NumberFormatException{
		String str = "";
		int index;
		int dotindex;
		//найти место точки, если она присутствует
		for(String x: eachSymbol) {
			str += x;
		}
		dotindex = str.indexOf(".");
		
		//проверка положительное или отрицательное
		if(eachSymbol[0].equals("-")) {
			index = 1;
		}else {
			index = 0;
		}
		
		int max = 0;
		//поиск максимальной цифры
		for(int i = 0; i < eachSymbol.length; i++) {
			if(i == dotindex || eachSymbol[0].equals("-")) {
				continue;
			}else {
				if(Integer.parseInt(eachSymbol[i]) >= max) {
					max = Integer.parseInt(eachSymbol[i]);
				}
			}
		}
		
		if(index == 1) {
			arrResult[0] = "       ";
			arrResult[1] = "       ";
			arrResult[2] = "       ";
			arrResult[3] = "  *****";
			arrResult[4] = "       ";
			arrResult[5] = "       ";
			arrResult[6] = "       ";
		}else {
			//т.к. высота цифры 7 символов
			for(int i = 0; i < 7; i++) {
					arrResult[i] = "";
			}
		}
		
		while(index < eachSymbol.length) {
			switch(eachSymbol[index]) {
				case "0":
					if(0 == max) {
						arrResult[0] += "  "+ "00000";
						arrResult[1] += "  "+ "0   0";
						arrResult[2] += "  "+ "0   0";
						arrResult[3] += "  "+ "0   0";
						arrResult[4] += "  "+ "0   0";
						arrResult[5] += "  "+ "0   0";
						arrResult[6] += "  "+ "00000";
					}else {
						arrResult[0] += "  "+ "*****";
						arrResult[1] += "  "+ "*   *";
						arrResult[2] += "  "+ "*   *";
						arrResult[3] += "  "+ "*   *";
						arrResult[4] += "  "+ "*   *";
						arrResult[5] += "  "+ "*   *";
						arrResult[6] += "  "+ "*****";
					}	
				break;
				case "1":
					if(1 == max) {
						arrResult[0] += "  "+ "  1  ";
						arrResult[1] += "  "+ " 11  ";
						arrResult[2] += "  "+ "1 1  ";
						arrResult[3] += "  "+ "  1  ";
						arrResult[4] += "  "+ "  1  ";
						arrResult[5] += "  "+ "  1  ";
						arrResult[6] += "  "+ "11111";
					}else {
						arrResult[0] += "  "+ "  *  ";
						arrResult[1] += "  "+ " **  ";
						arrResult[2] += "  "+ "* *  ";
						arrResult[3] += "  "+ "  *  ";
						arrResult[4] += "  "+ "  *  ";
						arrResult[5] += "  "+ "  *  ";
						arrResult[6] += "  "+ "*****";
					}
				break;
				case "2":
					if(2 == max) {
						arrResult[0] += "  "+ "22222";
						arrResult[1] += "  "+ "    2";
						arrResult[2] += "  "+ "    2";
						arrResult[3] += "  "+ "2 2 2";
						arrResult[4] += "  "+ "2    ";
						arrResult[5] += "  "+ "2    ";
						arrResult[6] += "  "+ "22222";
					}else {
						arrResult[0] += "  "+ "*****";
						arrResult[1] += "  "+ "    *";
						arrResult[2] += "  "+ "    *";
						arrResult[3] += "  "+ "* * *";
						arrResult[4] += "  "+ "*    ";
						arrResult[5] += "  "+ "*    ";
						arrResult[6] += "  "+ "*****";
					}
				break;
				case "3":
					if(3 == max) {
						arrResult[0] += "  "+ "33333";
						arrResult[1] += "  "+ "    3";
						arrResult[2] += "  "+ "   3 ";
						arrResult[3] += "  "+ " 3333";
						arrResult[4] += "  "+ "    3";
						arrResult[5] += "  "+ "    3";
						arrResult[6] += "  "+ "33333";
					}else {
						arrResult[0] += "  "+ "*****";
						arrResult[1] += "  "+ "    *";
						arrResult[2] += "  "+ "   * ";
						arrResult[3] += "  "+ " ****";
						arrResult[4] += "  "+ "    *";
						arrResult[5] += "  "+ "    *";
						arrResult[6] += "  "+ "*****";
					}
				break;
				case "4":
					if(4 == max) {
						arrResult[0] += "  "+ "    4 ";
						arrResult[1] += "  "+ "   44 ";
						arrResult[2] += "  "+ "  4 4 ";
						arrResult[3] += "  "+ " 4  4 ";
						arrResult[4] += "  "+ "444444";
						arrResult[5] += "  "+ "    4 ";
						arrResult[6] += "  "+ "    4 ";
					}else {
						arrResult[0] += "  "+ "    * ";
						arrResult[1] += "  "+ "   ** ";
						arrResult[2] += "  "+ "  * * ";
						arrResult[3] += "  "+ " *  * ";
						arrResult[4] += "  "+ "******";
						arrResult[5] += "  "+ "    * ";
						arrResult[6] += "  "+ "    * ";
					}
				break;
				case "5":
					if(5 == max) {
						arrResult[0] += "  "+ "55555";
						arrResult[1] += "  "+ "5    ";
						arrResult[2] += "  "+ "5    ";
						arrResult[3] += "  "+ "55555";
						arrResult[4] += "  "+ "    5";
						arrResult[5] += "  "+ "    5";
						arrResult[6] += "  "+ "55555";
					}else {
						arrResult[0] += "  "+ "*****";
						arrResult[1] += "  "+ "*    ";
						arrResult[2] += "  "+ "*    ";
						arrResult[3] += "  "+ "*****";
						arrResult[4] += "  "+ "    *";
						arrResult[5] += "  "+ "    *";
						arrResult[6] += "  "+ "*****";
					}
				break;
				case "6":
					if(max == 6) {
						arrResult[0] += "  "+ "   6 ";
						arrResult[1] += "  "+ " 6   ";
						arrResult[2] += "  "+ "6    ";
						arrResult[3] += "  "+ "66666";
						arrResult[4] += "  "+ "6   6";
						arrResult[5] += "  "+ "6   6";
						arrResult[6] += "  "+ "66666";
					}else {
						arrResult[0] += "  "+ "   * ";
						arrResult[1] += "  "+ " *   ";
						arrResult[2] += "  "+ "*    ";
						arrResult[3] += "  "+ "*****";
						arrResult[4] += "  "+ "*   *";
						arrResult[5] += "  "+ "*   *";
						arrResult[6] += "  "+ "*****";
					}
				break;
				case "7":
					if(max == 7) {
						arrResult[0] += "  "+ "77777";
						arrResult[1] += "  "+ "7   7";
						arrResult[2] += "  "+ "   7 ";
						arrResult[3] += "  "+ "7 7 7";
						arrResult[4] += "  "+ "  7  ";
						arrResult[5] += "  "+ "  7  ";
						arrResult[6] += "  "+ "  7  ";
					}else {
						arrResult[0] += "  "+ "*****";
						arrResult[1] += "  "+ "*   *";
						arrResult[2] += "  "+ "   * ";
						arrResult[3] += "  "+ "* * *";
						arrResult[4] += "  "+ "  *  ";
						arrResult[5] += "  "+ "  *  ";
						arrResult[6] += "  "+ "  *  ";
					}
				break;
				case "8":
					if(8 == max) {
						arrResult[0] += "  "+ " 888 ";
						arrResult[1] += "  "+ "8   8";
						arrResult[2] += "  "+ "8   8";
						arrResult[3] += "  "+ " 888 ";
						arrResult[4] += "  "+ "8   8";
						arrResult[5] += "  "+ "8   8";
						arrResult[6] += "  "+ " 888 ";
					}else {
						arrResult[0] += "  "+ " *** ";
						arrResult[1] += "  "+ "*   *";
						arrResult[2] += "  "+ "*   *";
						arrResult[3] += "  "+ " *** ";
						arrResult[4] += "  "+ "*   *";
						arrResult[5] += "  "+ "*   *";
						arrResult[6] += "  "+ " *** ";
					}
				break;
				case "9":
					if(9 == max) {
						arrResult[0] += "  "+ " 999 " ;
						arrResult[1] += "  "+ "9   9";
						arrResult[2] += "  "+ "9   9";
						arrResult[3] += "  "+ " 999 ";
						arrResult[4] += "  "+ "  9  ";
						arrResult[5] += "  "+ " 9   ";
						arrResult[6] += "  "+ "9    ";
					}else {
						arrResult[0] += "  "+ " *** " ;
						arrResult[1] += "  "+ "*   *";
						arrResult[2] += "  "+ "*   *";
						arrResult[3] += "  "+ " *** ";
						arrResult[4] += "  "+ "  *  ";
						arrResult[5] += "  "+ " *   ";
						arrResult[6] += "  "+ "*    ";
					}
				break;	
				case ".":
						arrResult[0] += "   ";
						arrResult[1] += "   ";
						arrResult[2] += "   ";
						arrResult[3] += "   ";
						arrResult[4] += "   ";
						arrResult[5] += "   ";
						arrResult[6] += "  *";
				break;
			}
			index++;
		}	
		//Вывод в консоль
		for(String x: arrResult) {
			System.out.println(x);
		}
		return arrResult;
	}
	
	public static void main(String[] args) {
		
		NumberFour nbf = new NumberFour();
		String[] arrResult = new String[7];
		nbf.setArrResult(arrResult);
		Scanner sc = new Scanner(System.in, "UTF-8");
		String line;
		boolean flag = true;
		while(flag) {
			System.out.println("Введите число и нажмите enter. Для выхода из программы введите слово Выход и нажмите enter");
			line = sc.nextLine().toLowerCase().trim();
			if(line.isEmpty()) {
				continue;
			}
			if(line.equals("выход")) {
				sc.close();
				flag = false;
			}else {
				try {
					//отсеять ввод по типу 01, 0001, -001
					if(	((String.valueOf(line.charAt(0)).equals("0")) 
						&& (line.length() > 1) 
						&& (String.valueOf(line.charAt(1)).matches("[0-9]")))
							||
						((String.valueOf(line.charAt(0)).equals("-"))
						&& (line.length() > 2) 
						&& (String.valueOf(line.charAt(1)).equals("0"))
						&& (String.valueOf(line.charAt(2)).matches("[0-9]")))
																			)
					 {
						System.out.println("Некорректный ввод");
					}else {
						//
						String [] s = line.split("\\s+")[0].split("(?!^)");
						nbf.setEachSymbol(s);
						nbf.printNumber();
					}
				}catch(NumberFormatException e) {
					System.out.println("Некорректный ввод " + e.toString());
				}
				}
			}
		}
}
