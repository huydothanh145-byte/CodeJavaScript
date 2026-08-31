package com.sinhvien;

public class SinhVien {
    // Attributes
    private int maSV;
    private String hoTen;
    private double diemLT;
    private double diemTH;
    
    // Constructor mặc định
    public SinhVien() {
        this.maSV = 0;
        this.hoTen = "Chưa có tên";
        this.diemLT = 0.0;
        this.diemTH = 0.0;
    }
    
    // Constructor đầy đủ tham số
    public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
        setMaSV(maSV);
        setHoTen(hoTen);
        setDiemLT(diemLT);
        setDiemTH(diemTH);
    }
    
    // Getter và Setter cho maSV
    public int getMaSV() {
        return maSV;
    }
    
    public void setMaSV(int maSV) {
        if (maSV > 0) {
            this.maSV = maSV;
        } else {
            this.maSV = 0;
            System.out.println("Mã sinh viên không hợp lệ! (phải > 0)");
        }
    }
    
    // Getter và Setter cho hoTen
    public String getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(String hoTen) {
        if (hoTen != null && !hoTen.trim().isEmpty()) {
            this.hoTen = hoTen;
        } else {
            this.hoTen = "Chưa có tên";
            System.out.println("Họ tên không hợp lệ! (không được rỗng)");
        }
    }
    
    // Getter và Setter cho diemLT
    public double getDiemLT() {
        return diemLT;
    }
    
    public void setDiemLT(double diemLT) {
        if (diemLT >= 0.0 && diemLT <= 10.0) {
            this.diemLT = diemLT;
        } else {
            this.diemLT = 0.0;
            System.out.println("Điểm lý thuyết không hợp lệ! (phải từ 0.0 đến 10.0)");
        }
    }
    
    // Getter và Setter cho diemTH
    public double getDiemTH() {
        return diemTH;
    }
    
    public void setDiemTH(double diemTH) {
        if (diemTH >= 0.0 && diemTH <= 10.0) {
            this.diemTH = diemTH;
        } else {
            this.diemTH = 0.0;
            System.out.println("Điểm thực hành không hợp lệ! (phải từ 0.0 đến 10.0)");
        }
    }
    
    // Phương thức tính điểm trung bình
    public double tinhDiemTB() {
        return (this.diemLT + this.diemTH) / 2.0;
    }
    
    // Phương thức toString
    @Override
    public String toString() {
        return String.format("%-10d %-25s %-10.2f %-10.2f %-10.2f", 
                            maSV, hoTen, diemLT, diemTH, tinhDiemTB());
    }
}