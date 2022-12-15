package com.springorm.StudentMgt.DaoImpl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.springorm.StudentMgt.Dao.StudentDao;
import com.springorm.StudentMgt.entities.Student;


public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate ht;

	// To insert record of department
	@Transactional
	public int insertStudent(Student st) {
		int id = (int) ht.save(st);
		return 1;

	}

	// To update record of department
	@Transactional
	public int updateStudent(Student st) {
		ht.update(st);
		return 1;

	}

	// To delete record of department
	@Transactional
	public int deleteStudent(Student s) {
		ht.delete(s);
		return 1;

	}

	

	// To get all records
	public List<Student> getAllStudent() {

		List<Student> deptList = ht.loadAll(Student.class);
		return deptList;

	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public Student getStudent(int id) {
		Student dept = ht.get(Student.class, id);
		return dept;

	}

	
}
