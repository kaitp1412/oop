import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
class Sinhvien implements Serializable {
    private String maSv;
    private String tenSv;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public Sinhvien(String maSv, String tenSv, double diemToan, double diemLy, double diemHoa) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSv='" + maSv + '\'' +
                ", tenSv='" + tenSv + '\'' +
                ", diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa +
                '}';
    }

}
class StudentProcess{
    public static boolean WriteStudentToFile(Sinhvien [] sinhvien){
        File file = new File("SinhVien.dat");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(sinhvien);
            objectOutputStream.close();
            return true;
        }catch (IOException e){
           return false;

        }
    }
    public static Sinhvien [] ReadStudentFromFile(){
        File file = new File("SinhVien.dat");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Sinhvien[] sinhviens = (Sinhvien[]) objectInputStream.readObject();
            for (Sinhvien sinhvien: sinhviens) {
                System.out.println(sinhvien.toString());
            }
            objectInputStream.close();
            return new Sinhvien[]{};
        }catch (IOException | ClassNotFoundException e){
            return null;
        }
    }
}
class SinhVienApp{
    public static void main(String[] args) {

        Sinhvien [] lists = new Sinhvien[5];
        lists[0] = new Sinhvien("112","Nguyen Van A" , 2,1,10);
        lists[1] = new Sinhvien("112","Nguyen Van A" , 2,1,10);
        lists[2] = new Sinhvien("112","Nguyen Van A" , 2,1,10);
        lists[3] = new Sinhvien("112","Nguyen Van A" , 2,1,10);
        lists[4] = new Sinhvien("112","Nguyen Van A" , 2,1,10);
        System.out.println(StudentProcess.WriteStudentToFile(lists));
        StudentProcess.ReadStudentFromFile();
    }
}