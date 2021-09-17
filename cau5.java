import java.util.Scanner;
public class cau5
{
   public static void main(String[] args)
   {
      int n;
      float[] soNguyen;
      float ketQua = 0;
      Scanner sc = new Scanner(System.in);

      System.out.println("Nhập vào n:");
      n = sc.nextInt();
      soNguyen = new float[n];
      for (int i = 0; i < n; i++)
      {
         System.out.println("Nhập vào số thực:");
         soNguyen[i] = sc.nextFloat();
      }

      for (int i = 0; i < n; i++)
         ketQua += soNguyen[i];
         
      System.out.println("Tổng của các số nguyên là: " + ketQua);
   }
}