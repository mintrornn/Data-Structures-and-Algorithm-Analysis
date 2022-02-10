//Intr-orn Lertsupakitsin section1 6288089
public class selectionSort {
	public static void alphabet(String[] ar, int[] integer) {
		for(int i=0;i<9;i++) {
			switch(ar[i]) {
			case "A":
				integer[i] = 1;
				break;
			case "J":
				integer[i] = 11;
				break;
			case "M":
				integer[i] = 12;
				break;
			case "Q":
				integer[i] = 13;
				break;
			case "K":
				integer[i] = 14;
				break;
			default:
				integer[i]  = Integer.parseInt(ar[i]);
			}
		}
		for(int i=0;i<9;i++) {
			System.out.print(integer[i] + " ");
		}
	}
	
	public static void selectionSort(int arr[]) {
		for(int i=0;i<9-1;i++) {
			int min = i;
			for(int j = i+1;j<9;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			swap(min, i, arr);
			inttoalpha(arr, arr.length); 
			
			System.out.print("\n");
		}
	}
	
	public static void swap(int min, int i, int arr[]) {
		 int temp = arr[min]; 
         arr[min] = arr[i]; 
         arr[i] = temp; 
	}
	

	public static void inttoalpha(int[] a, int n) {
		String[] aa = new String[n];
		for(int i=0;i<9;i++) {
			switch(a[i]) {
			case 1:
				aa[i] = "A";
				break;
			case 11:
				aa[i] = "J";
				break;
			case 12:
				aa[i] = "M";
				break;
			case 13:
				aa[i] = "Q";
				break;
			case 14:
				aa[i] = "K";
				break;
			default:
			  aa[i]=Integer.toString(a[i]);			}
		}
		for(int i=0;i<9;i++) {
			System.out.print(aa[i] + " ");
		}
	}

	public static void main(String args[]) {
		String[] arr = {"3","K","4","7","2","10","8","J","A"};
		int integer[] =  new int[9];
		
		for(int i=0;i<9;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		alphabet(arr, integer);
		System.out.print("\n");
		selectionSort(integer);
				
	}
}
