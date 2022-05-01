import java.util.Scanner;

public class BaiTap_02 {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//  Bài 1: Viết  chương trình tính chu vi và diện tích của hình chữ nhật với chiều dài và chiều rộng nhập vào từ bàn phím
//        System.out.println("Nhap vao chieu dai hinh chu nhat : " + "CM");
//        int loong = sc.nextInt();
//
//        System.out.println("Nhap vao chieu rong hinh chu nhat: " + "CM");
//        int wide = sc.nextInt();
//
//        int P = 2 * (loong + wide);
//        System.out.println("Ket qua Chu vi hinh chu nhat = " + P);


//   Bài 2: Viết chương trình giới thiệu bản thân gồm các thông tin họ tên, tuổi, giới tính, địa chỉ, với các thông tin cá nhân được nhập vào từ bàn phím
        System.out.println("Nhap vao Ten cua ban: ");
        String Name = sc.nextLine();

        System.out.println("Nhap vao tuoi cua ban:");
        int Age = Integer.parseInt(sc.nextLine()) ;

        System.out.println("Nhap vao gioi tinh cua ban:");
        String Gender = sc.nextLine();


        System.out.println("Nhap vao dia chi cua ban: ");
        String Adress = sc.nextLine();

        System.out.println("Xin chao cac ban minh ten la " + Name + "," + " Nam nay minh " + Age + " tuoi" + "," + " Gioi tinh " + Gender +"," + " Hien tai minh song va lam viec tai " + Adress  );
    }

}
