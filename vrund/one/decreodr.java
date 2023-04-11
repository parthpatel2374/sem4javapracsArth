import java.util.Scanner;

class decreodr {
	public static void main(String arr[]) {
		Scanner v = new Scanner(System.in);
		System.out.println("enter three values");
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = v.nextInt();
			System.out.println(a[i]);
		}
		int temp;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (a[j + 1] > a[j]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("decresing order of entered valeues is " + a[0] + " " + a[1] + " " + a[2]);
		v.close();
	}
}