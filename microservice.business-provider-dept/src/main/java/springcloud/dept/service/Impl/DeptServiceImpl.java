package springcloud.dept.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springcloud.dept.dao.DeptDao;
import springcloud.dept.service.DeptService;
import springcloud.entities.Dept;

@Service
public class DeptServiceImpl implements  DeptService{

	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}

}
