package NguyenThanhKhoa.server;

import java.util.List;

import org.springframework.stereotype.Service;

import NguyenThanhKhoa.entity.HocSinh;

@Service
public interface HocSinhServer {

	public List<HocSinh> getHocSinhs();
	    public void deleteHocSinh(int id);
	    public void addHocSinh(HocSinh hocSinh);
	    public void updateHocSinh(HocSinh hocSinh);

}
