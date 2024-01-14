package NguyenThanhKhoa.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NguyenThanhKhoa.Dao.HocSinhDao;
import NguyenThanhKhoa.entity.HocSinh;

@Service
public class HocSinhServerImpl implements HocSinhServer{
    @Autowired
    private HocSinhDao hocSinhDao;
	@Override
	public List<HocSinh> getHocSinhs() {
		// TODO Auto-generated method stub
		return hocSinhDao.getHocSinhs();
	}

	@Override
	public void deleteHocSinh(int id) {
		// TODO Auto-generated method stub
	   hocSinhDao.deleteHocSinh(id);
	}

	@Override
	public void addHocSinh(HocSinh hocSinh) {
		// TODO Auto-generated method stub
		hocSinhDao.addHocSinh(hocSinh);
	}

	@Override
	public void updateHocSinh(HocSinh hocSinh) {
		// TODO Auto-generated method stub
		hocSinhDao.updateHocSinh(hocSinh);
	}

}
