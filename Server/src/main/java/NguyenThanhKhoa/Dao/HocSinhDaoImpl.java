package NguyenThanhKhoa.Dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import NguyenThanhKhoa.entity.HocSinh;

@Repository
@Transactional
public class HocSinhDaoImpl implements HocSinhDao{
    @Autowired
    private SessionFactory sessionFactory;
    
	
	@Override
	public List<HocSinh> getHocSinhs() {
		// TODO Auto-generated method stub
	    Session session = sessionFactory.getCurrentSession();
	    
		return session.createNativeQuery("select * from hocsinh", HocSinh.class).getResultList();
	}

	@Override
	public void deleteHocSinh(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<HocSinh> query = session.createNativeQuery("delete from hocsinh where maHS = :maHS", HocSinh.class);
		query.setParameter("maHS", id);
		query.executeUpdate();
	}

	@Override
	public void addHocSinh(HocSinh hocSinh) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateHocSinh(HocSinh hocSinh) {
		// TODO Auto-generated method stub
		
	}

}
