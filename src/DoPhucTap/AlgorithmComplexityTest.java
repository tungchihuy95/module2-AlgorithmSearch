package DoPhucTap;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    //Bước 1: Tạo lớp AlgorithmComplexityTest, viết hàm main cho phép nhập vào một chuỗi ký tự
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        /*codes below here */

        //Bước 2: Tính tần suất xuất hiện của các ký tự trong chuỗi vừa nhập
        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = (int) inputString.charAt(i);
            /* Tăng giá trị tần suất */
            frequentChar[ascii] += 1;
        }
        //   Bước 3:  Tìm ký tự có tần suất xuất hiện nhiều nhất
        int max = 0;
        char character = (char) 255; /* empty character */
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");

    }


}
