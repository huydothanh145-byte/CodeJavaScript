

import java.util.Scanner;

import com.sinhvien.SinhVien;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("QUẢN LÝ SINH VIÊN");
        
        SinhVien sv1 = new SinhVien(12345, "Nguyen Van A", 9.5, 8.5);
        SinhVien sv2 = new SinhVien(12346, "Tran Thi B", 7.0, 8.0);
        SinhVien sv3 = new SinhVien(12347, "Nguyen Van C", 8.5, 7.0);
        SinhVien sv4 = new SinhVien(12348, "Le Thi D", 9.0, 8.0);

  
        System.out.println("\nDANH SACH SINH VIEN\n");
        System.out.printf("%-10s %-25s %-10s %-10s %-10s%n", 
                         "MSSV", "HO VA TEN", "DIEM LT", "DIEM TH", "DIEM TB\n");
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
        System.out.println(sv4.toString());

        scanner.close();
    }
}