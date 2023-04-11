package Bai01;

public class ChuyenXeNgoaiThanh {
	private String noiDen;
	private int soNgayDiDuoc;
	public ChuyenXeNgoaiThanh() {
		// TODO Auto-generated constructor stub
		this("xxx",0);
	}
	public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc) {
		super();
		setNoiDen(noiDen);
		setSoNgayDiDuoc(soNgayDiDuoc);
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		if (!noiDen.isEmpty()) {
			this.noiDen = noiDen;
		}
	}
	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}
	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		if (soNgayDiDuoc >= 0) {
			this.soNgayDiDuoc = soNgayDiDuoc;
		}
	}
}