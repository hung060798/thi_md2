import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
   static ArrayList<DanhBa> list = new ArrayList<>();
   static Scanner sc = new Scanner(System.in );

   public static DanhBa taoDanhBa(){
      String name = getName();
      String sdt = getSDT();
      String diaChi = getDiaChi();
      String  gioiTinh = gioiTinh();
      String nhom = getNhom();
      String date = getNgaySinh();
      String email = getEmail();
      return new DanhBa(name, sdt, diaChi, gioiTinh, nhom, date, email);
   }

   public static void them( )  {
         //String name, String sdt, String diaChi, String gender, String nhom, String ngaySinh, String email
         list.add(taoDanhBa());
//      IOFile.ghiFIle();
   }

   public void search(){
      list = IOFile.docFile();
      System.out.println("nhập tên cần tìm kiếm thông tin");
      String name = sc.nextLine();
      boolean check = false;
      for (DanhBa danhBa : list){
         if(danhBa.getName().contains(name)){
            System.out.println(danhBa);
         }else if(!(danhBa.getName().equals(name))){
            check = true;
         }
      }
      if (check){
         System.out.println("không tìm thấy nhân viên " + name);
      }
   }

   public void xoa() throws IOException {
      list = IOFile.docFile();
      System.out.println("nhập số điện thoại");
      String sdt = sc.nextLine();
      for (int i =0; i< list.size(); i++){
         if (list.get(i).getSdt().equals(sdt) ){
            System.out.println("nhập y nếu muốn xóa");
            String Y = sc.nextLine();
            if (Y.equals("y")) {
               list.remove(i);
            } else break;
         }
      }
      IOFile.ghiFIle();
   }

   public void capNhat() throws IOException {
      list = IOFile.docFile();
      System.out.println("nhập số điện thoại ");
      String sdt = sc.nextLine();
      for (int i = 0; i<list.size(); i++){
         if (list.get(i).getSdt().equals(sdt)){
               list.set(i, taoDanhBa());
         }
      }
   }

   public static void show(){
//      list = IOFile.docFile();
         for (DanhBa danhBa : list) {
            System.out.println(danhBa);
         }
   }

   public static String getName() {
      while (true) {
         boolean flag;
         do {
            System.out.println("nhập tên");
            String name = sc.nextLine();
            flag = SdtEmailRegex.validateName(name);
            if (flag) {
               return name;
            } else System.out.println("tên không hợp lệ");
         } while (!flag);
      }
   }

   public  static String getNgaySinh() {
      System.out.println("nhập ngày sinh");
      String date = sc.nextLine();
      return date;
   }

   public static String getNhom() {
      System.out.println("nhập nhóm");
      String nhom = sc.nextLine();
      return nhom;
   }

   public static String getSDT() {
      while (true) {
         boolean flag;
         do {
            System.out.println("nhập số điện thoại(0XXXXXXXXX)");
            String sdt = sc.nextLine();
            flag = SdtEmailRegex.validateSDT(sdt);
            if (flag){
               return sdt;
            } else System.out.println("số điện thoại chưa hợp lệ");
         } while (!flag);
      }
   }

   public static String getDiaChi(){
      System.out.println("nhập địa chỉ");
      return sc.nextLine();
   }

   public static String getEmail() {
      while (true) {
         try {
            boolean flag;
            do {
               System.out.println("nhập email");
               String email = sc.nextLine();
               flag = SdtEmailRegex.validateEmail(email);
               if (flag) {
                  for (DanhBa danhBa : list) {
                     if (danhBa.getEmail().equals(email)) {
                        throw new Loi();
                     }
                  }
                  return email;
               } else System.out.println("email chưa hợp lệ");
            } while (!flag);
         } catch (Loi e) {
            System.out.println("email bị trùng");
         }
      }
   }

   public  static String gioiTinh(){
      while (true){
         try {
            System.out.println("nhập giới tính( nam hoặc nu )");
            String gender = sc.nextLine();
            if (gender.equals("nam")||gender.equals("nu")){
               return gender;
            } else throw new Loi();
         }
         catch (Loi e){
            System.out.println("nam hoặc nữ");
         }
      }
   }

   public static void readFile() {
       list= IOFile.docFile();
   }

   public static void writeFile() {
      IOFile.ghiFIle();
   }
}
