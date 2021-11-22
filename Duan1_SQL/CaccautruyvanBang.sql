use QLCHSach
go
--Bảng NhanVien
--Thêm mới
INSERT INTO NhanVien (MaNV, Matkhau, Hoten, SĐT, Vaitro, Hinh) VALUES (?, ?, ?, ?, ?.?)
 --1 là quản lý --0 là nhân viên
--Cập nhật theo mã 
UPDATE NhanVien SET Matkhau=?, Hoten=?, Vaitro=? WHERE MaNV=?
--Xóa theo mã 
DELETE FROM NhanVien WHERE MaNV=?
--Truy vấn tất cả 
SELECT * FROM NhanVien
--Truy vấn theo mã 
SELECT * FROM NhanVien WHERE MaNV=?

go
--Bảng LoaiSach
--Thêm mới
INSERT INTO LoaiSach(MaLS,TenLS) VALUES (?, ?)
--Cập nhật theo mã 
UPDATE LoaiSach SET TenLS MaLS=?
--Xóa theo mã 
DELETE FROM LoaiSach WHERE MaLS=?
--Truy vấn tất cả 
SELECT * FROM LoaiSach
--Truy vấn theo mã 
SELECT * FROM LoaiSach WHERE MaLS=?

go
--Bảng Sach
--Thêm mới
INSERT INTO Sach (MaLS, TenS, Tacgia, NXB, NSX, Sotrang, Soluong, Gianhap, Giaban, MaNV, Hinh, Mota) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
--Cập nhật theo mã 
UPDATE Sach SET MaLS=?, TenS=?, Tacgia=?, NXB=?, NSX=?, Sotrang=?, Soluong=?, Tiennhap=?, Tienban=?, MaNV=?, Hinh=?, Mota=? WHERE MaS=?
--Xóa theo mã 
DELETE FROM Sach WHERE MaS=?
--Truy vấn tất cả 
SELECT * FROM Sach
--Truy vấn theo mã 
SELECT TenS,Gianhap,Giaban,MaS FROM Sach WHERE MaLS= 'KNS'

go
--Bảng DonHang
--Thêm mới
INSERT INTO DonHang (MaDH, Tongtien, Ngaymua, MaNV) VALUES (?, ?, ?, ?)
--Cập nhật theo mã 
UPDATE DonHang SET Tongtien=? , Ngaymua=? , MaNV=?  WHERE MaDH=?
--Xóa theo mã 
DELETE FROM DonHang WHERE MaDH='dh003'
--Truy vấn tất cả 
SELECT * FROM DonHang
--Truy vấn theo mã 
SELECT * FROM DonHang WHERE MaDH=?
go
--Bảng DonHangChiTiet
--Thêm mới
INSERT INTO DonHangChiTiet (MaDHCT, MaDH, MaLS, MaS, Tens, Soluong, Giatien, Ghichu) VALUES (?, ?, ?, ?, ?, ?, ?)
--INSERT INTO DonHangChiTiet (MaDH, MaLS, MaS, Tens, Soluong, Giatien, Ghichu) VALUES ('DH0037', 'CK', '1', N'Nhà đầu tư thông minh', 1, 199000, N'Ví dụ')
--Cập nhật theo mã 
UPDATE DonHangChiTiet SET MaDHCT=?, MaDH=?, MaLS=?, MaS=? , Soluong=? , Giatien=?, Ghichu=?  WHERE MaDHCT=?
--Xóa theo mã 
DELETE FROM DonHangChiTiet WHERE MaDH=?
--Truy vấn tất cả 
SELECT * FROM DonHangChiTiet
SELECT * FROM DonHang

--Truy vấn theo mã 
Select * from DonHangChiTiet where MaDH=?
go
 
/*CREATE TRIGGER trg_CapNhatSoLuong ON DonHangChiTiet AFTER INSERT AS 
BEGIN
	UPDATE Sach 
	SET Soluong = s.Soluong - (
		SELECT DonHangChiTiet.SoLuong
		FROM DonHangChiTiet
		where MaS = s.MaS
	)
	from Sach s join DonHangChiTiet ct on ct.MaS =s.MaS 
END

DROP TRIGGER trg_CapNhatSoLuong*/

go

update Sach set Soluong = 100 - (select SUm(Soluong) from DonHangChiTiet where DonHangChiTiet.MaS=Sach.MaS)
where Sach.MaS = ?




