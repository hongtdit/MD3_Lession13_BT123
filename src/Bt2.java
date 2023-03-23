import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n, sum = 0, tempSort;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        // Hiển thị mảng vừa nhập
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        int a=array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]>array[j]){
                    a=array[j];
                    array[j]=array[i];
                    array[i]=a;
                }
            }
        }
        System.out.println("Manrg sau khi sap xep la: " + array);
        System.out.println("Nhap vao so can tim kiem: ");
        int number=input.nextInt();
        int result=binarySearch(array,0,sum-1,number);
        if (result==-1){
            System.out.println("Khong co ket qua phu hop");
        }
        else {
            System.out.println("phan tu la: "+result);
        }
    }
    public static int binarySearch(int[] array, int left, int right, int value){
        int middle=(left+right)/2;
        while (right>left){
        if (array[middle]>value){
            return binarySearch(array, left, middle-1, value);
        }else if (array[middle]==value){
            return middle;
        }else {
            return binarySearch(array, middle+1, right, value);
        }
    }
    return -1;
}
}
