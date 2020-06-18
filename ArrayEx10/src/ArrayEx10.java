
public class ArrayEx10 {
	public static boolean has23(int[] arr){
		boolean pres23 = false;
		
		if (arr[0] == 2 || arr[0] == 3 || arr[0] == 2 || arr[1] == 3)
			pres23 = true;
		
		return pres23;
	}
	
	public static void main(String[] arg){
		int[] array1 = new int[]{2, 5};
		int[] array2 = new int[]{4, 3};
		int[] array3 = new int[]{4, 5};
		
		System.out.println(has23(array1));
		System.out.println(has23(array2));
		System.out.println(has23(array3));
	}
}
