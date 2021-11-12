package TaskNumberThree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberThree {
	ArrayList<String> words;
	int [] letterNumber;
	ArrayList<String> sortedWords;
	String str;
	//сортировка по количеству гласных
	public ArrayList<String> sortWords(ArrayList<String> arrwords, int[] arrLetterNumber){
		sortedWords.clear();
		int max = 0;
		int[] index = new int[arrLetterNumber.length];
		for(int i = 0; i < arrLetterNumber.length; i++) {
			for(int j = 0; j < arrLetterNumber.length; j++) {
				if(arrLetterNumber[j] >= max) {
					max = arrLetterNumber[j];
					index[i] = j;
				}
			}
			arrLetterNumber[index[i]] = -1;
			max = 0;
		}
		for(int x: index) {
			sortedWords.add(arrwords.get(x));
		}
		System.out.println("Отсортированные по количеству гласных " + sortedWords.toString());

		return sortedWords;
	}
	//Первую гласную делаем заглавной
	public ArrayList<String> upperFirstCharacter(ArrayList<String> arrStr) {
		Pattern pt = Pattern.compile("[ауоыиэяюёе]");
		Matcher mtchgl;
		String currentstr;
		for(int i = 0; i < arrStr.size(); i++) {
			currentstr = arrStr.get(i);
			mtchgl = pt.matcher(currentstr.toLowerCase());
			if(mtchgl.find()) {
				if(mtchgl.start() == 0) {
				arrStr.set(i, String.valueOf(currentstr.charAt(mtchgl.start())).toUpperCase() + currentstr.substring(1));
				}
				if(mtchgl.start() == currentstr.length()) {
					arrStr.set(i, currentstr.substring(0, currentstr.length()) + String.valueOf(currentstr.charAt(mtchgl.start())).toUpperCase());
				}
				if(mtchgl.start() != 0 && mtchgl.start() != currentstr.length()) {
					arrStr.set(i, String.valueOf(currentstr.substring(0, mtchgl.start()) + String.valueOf(currentstr.charAt(mtchgl.start())).toUpperCase() + currentstr.substring(mtchgl.start()+1, currentstr.length())));
				}
			}
		}
		System.out.println(arrStr.toString());
		return arrStr;
	}
	//подсчитываем количество гласных
	public int[] numberGLetters() {
		words.clear();
		int counter = 0;
		Pattern pt = Pattern.compile("[а-яА-ЯёЁ]+[0-9]*\\.*[а-яА-ЯёЁ]*[0-9]*");
		Matcher mtch;
		int start = 0;
		int end = 0;
		for(String x: str.split("\\s+")) {
			mtch = pt.matcher(x);
			if(mtch.find()) {
				start = mtch.start();
				end = mtch.end();
				while(mtch.find()) {
					end  = mtch.end();
				}
				x = x.substring(start, end);
				words.add(x);
			}	
		}
		
		String[] arr = new String[words.size()];
		
		letterNumber = new int[words.size()];
		for(int i = 0; i < arr.length; i++) {
			arr[i]= words.get(i).toLowerCase();
			for(int j = 0; j < arr[i].length(); j++) {
				if((String.valueOf(arr[i].charAt(j)).matches("[ауоыиэяюёе]"))) {
					counter++;
				}
			}
			letterNumber[i] = counter;
			counter = 0;
		}
		int countLetter = 0;
		for(int x: letterNumber) {
			countLetter += x;
		}
		System.out.println("Количество гласных - " + countLetter + " Количество слов - " + arr.length);

		return letterNumber;
	}
	
	public ArrayList<String> getSortedWords() {
		return sortedWords;
	}

	public void setSortedWords(ArrayList<String> sortedWords) {
		this.sortedWords = sortedWords;
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public ArrayList<String> getWords() {
		return words;
	}

	public void setWords(ArrayList<String> words) {
		this.words = words;
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> sortedWords = new ArrayList<String>();
		NumberThree tnth = new NumberThree();
		tnth.setWords(words);
		tnth.setSortedWords(sortedWords);
		Scanner sc = new Scanner(System.in, "UTF-8");
		
		String line = "";
		boolean flag = true;
		while(flag) {
			System.out.println("Введите строку и нажмите enter. Для выхода из программы введите слово Выход и нажмите enter");
			line  = sc.nextLine();
			if(line.trim().toLowerCase().equals("выход")) {
				sc.close();
				flag = false;
			}else {
				tnth.setStr(line.trim());
				tnth.numberGLetters();
				tnth.sortWords(tnth.getWords(), tnth.letterNumber);
				System.out.print("Делаем первую гласную заглавной ");
				tnth.upperFirstCharacter(tnth.getSortedWords());
			}
		}
	}
}
