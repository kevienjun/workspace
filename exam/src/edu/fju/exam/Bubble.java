package edu.fju.exam;

public class Bubble {

	public static void main(String[] args) {
	 int n[] = { 45, 81, 9, 72, 4, 6};
	 int i;
	 int j;
	 for(i=0; i < n.length - 1; i++){
		 for(j= 0;j < n.length - 1;j++){
			 if (n[j+1] > n[j]){
			 int tmp = n[j];
			 n[j] = n[j+1];
			 n[j+1] = tmp;
		 }
	 }
	}
	for (i=0;i < n.length; i++){
		System.out.print(n[i] + " ");
	}

}
}
