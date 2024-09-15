package edu.java.lab1; 
import java.util.Arrays; 

/**
 * @author Rodion
 * @since 2024
 */

public class lab1 {
	/**
	 * Эта функция определяет массив целых чисел, выводит их на печать, а затем использует инструмент сортировки, чтобы упорядочить их от наименьшего к наибольшему  
	*/
	public static void main(String[]args) { 
		//Инициализация массива
		int [] nums = {17, 5, 7, 23, 67, 44, 12, 1}; 
		//Выводим массив
		System.out.println(Arrays.toString(nums)); 
		//Сортируем массив
		Arrays.sort(nums); 
		//Выводим сортированный массив
		System.out.println(Arrays.toString(nums)); 

		} 
} 