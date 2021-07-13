import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner  sc = new Scanner(System.in);
    static Manager manager = new Manager();

    public static void main(String[] args) throws IOException {
            while (true){
                System.out.println("1.Xem danh sách");
                System.out.println("2.Thêm mới");
                System.out.println("3.Cập nhật");
                System.out.println("4.Xóa");
                System.out.println("5.Tìm kiếm");
                System.out.println("6.Đọc từ file");
                System.out.println("7.Ghi từ file");
                System.out.println("8.Thoát");
                System.out.println("Chọn chức năng:");

//                int choice =0;
//                try{
                    int choice = Integer.parseInt(sc.nextLine());
//                } catch (Exception e){
//                    System.out.println(" nhập số ");
//                }
                switch (choice){
                    case 1: {
                        Manager.show();
                        break;
                    }
                    case 2: {
                        Manager.them();
                        break;
                    }
                    case 3: {
                        manager.capNhat();
                        break;
                    }
                    case 4: {
                        manager.xoa();
                        break;
                    }
                    case 5: {
                        manager.search();
                        break;
                    }

                    case 6: {
                        manager.readFile();
                        break;
                    }

                    case 7: {
                        manager.writeFile();
                        break;
                    }

                }
            }
    }
}
