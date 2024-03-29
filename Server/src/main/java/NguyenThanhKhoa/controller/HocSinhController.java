package NguyenThanhKhoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NguyenThanhKhoa.entity.HocSinh;
import NguyenThanhKhoa.server.HocSinhServer;

@RestController
@RequestMapping("HocSinhController")
public class HocSinhController {
	@Autowired
	private HocSinhServer hocSinhServer;
	
	@GetMapping("/getHocSinh")
	public String getHocSinh() {
		List<HocSinh> ls = hocSinhServer.getHocSinhs();
		return ls.toString();
	}
	@GetMapping("/deleteHocSinh")
	public void deleteGiangViens(int id) {
		hocSinhServer.deleteHocSinh(id);
		
	}
}
