
public class ¹è¿­ {
	public static void main(String[] args) {
		int[][] array = {
				{1, 2, 3},
				{4, 5, 6}, 
				{7, 8, 9}	
		};	
		int[] arr2 = array[0];
		int value = arr2[0];
		int value2 = array[0][0];
		
		
		int[] score = new int [3] ;
		score[2] = 70;
		for(int i = 0; i < 3; i++) {
			System.out.println(score[i]);
		}
		
		int[] score2 = {100, 99, 80};
		for(int i = 0; i < 3; i++) {
			System.out.println(score2[i]);
		}
		

	}

}
