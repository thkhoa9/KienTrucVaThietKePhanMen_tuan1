package NguyenThanhKhoa.Dao;

import java.util.List;

import NguyenThanhKhoa.entity.HocSinh;

public interface HocSinhDao {
    public List<HocSinh> getHocSinhs();
    public void deleteHocSinh(int id);
    public void addHocSinh(HocSinh hocSinh);
    public void updateHocSinh(HocSinh hocSinh);
}
