//Intr-orn Lertsupakitsin
//6288089
//Section 1

/*
Write a java program to implement a radix sort. The program must be able to sort numerical data
base-16. The program must be also able to handle variable amounts of data and variable numbers of
digits in the key (max 20 digits).
*/

import java.io.IOException;
import java.util.*;


public class Radix {
	public String[] arr = {};
	public int maxDigit;
	
	public Radix() {
		Scanner a = new Scanner(System.in);
		System.out.println("Input the number:");
		String input = a.nextLine();
		System.out.println(input);

		arr = input.split(" ");		
		maxDigit = findMaxDigit();
	}
	
	//find the maximum
	public int findMaxDigit(){
		  
	       int out, in, min = 0;

	       for(out=0; out<arr.length-1; out++)   // outer loop
	          {
	          min = out;                     // minimum
	          for(in=out+1; in<arr.length; in++) { // inner loop
	             if(arr[in].length() < arr[min].length()) {        
	            	 min = in;   
	             }
	       
	          }

	       swap(min, out);  // swap them

	       }
	       return arr[arr.length-1].length();
	        
	}
	
	//swap
	public void swap(int min, int i) {
		String temp = arr[min]; 
        arr[min] = arr[i]; 
        arr[i] = temp; 
	}
	
	public int convertHex(char a) throws IOException{
		if(Character.toUpperCase(a) >= 'G' && Character.toUpperCase(a) <= 'Z') {
			System.out.println(a+" is not in 16-base number");
			throw new IOException(a+" is not in 16-base number");  
		}
		switch(Character.toUpperCase(a)) { 
			case 'A':
				return 10;
			case 'B':
				return 11;
			case 'C':
				return 12;
			case 'D':
				return 13;
			case 'E':
				return 14;
			case 'F':
				return 15;
			default:
				return (int)a-48;
		}
	}
	//append the digit 
	public void append() {
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length() < maxDigit) {
				String a = "";
				for(int j=0; j<maxDigit-arr[i].length(); j++) {
					a += "0";
				}
				arr[i] = a+arr[i];
			}
		}
	}
	
	//delete zero
	public void del_0() {
		int len = maxDigit;
		for(int i=0; i<arr.length; i++) {
			len = maxDigit;
			while(arr[i].charAt(0)=='0'){
				arr[i] = arr[i].substring(1, len);
				len = arr[i].length();
			}
		}
	}
	
	//sorting
	public void Rsorting() throws IOException {
		append();
		 int out, in, max = 0;
		 
		 for(int i=0;i<maxDigit;i++) {
			 
	       for(out=0; out<arr.length-1; out++)   // outer loop
	          {
	          max = out;                     // minimum
	          for(in=out+1; in<arr.length; in++) { // inner loop
	        	  //System.out.println(arr[in].length()+" > "+arr[max].length());
	             if(convertHex(arr[in].charAt(maxDigit-i-1)) < convertHex(arr[max].charAt(maxDigit-i-1)) ) {        
	            	 max = in;   
	             }
	       
	          }

	       swap(max, out);  // swap them

	       }
	       
		}
		del_0();
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		Radix a = new Radix();
		a.Rsorting();
		System.out.print("After sorting: ");
		a.display();
	}
}
