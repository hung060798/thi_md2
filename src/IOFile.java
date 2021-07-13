import java.io.*;
import java.util.ArrayList;

public  class IOFile {

    public static void ghiFIle() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("DanhBa.csv"));
            //String name, String sdt, String diaChi, String gender, String nhom, String ngaySinh, String email
            String something = "name,sdt,diaChi,GioiTinh,Nhom,NgaySinh,Gmail";
            bufferedWriter.write(something);
            for (DanhBa danhBa : Manager.list) {
                bufferedWriter.newLine();
                bufferedWriter.write(danhBa.ghi());
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<DanhBa> docFile() {
        ArrayList<DanhBa> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("DanhBa.csv"));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                list.add(new DanhBa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
