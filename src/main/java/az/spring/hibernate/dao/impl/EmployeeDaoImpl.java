package az.spring.hibernate.dao.impl;

import az.spring.hibernate.dao.EmployeeDao;
import az.spring.hibernate.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class EmployeeDaoImpl extends AbstractSessionFactory implements EmployeeDao {
    @Transactional
    @Override
    public void insert(Employee employee) {
         getSession().save(employee);
    }
    @Transactional
    @Override
    public void update(Employee employee) {
        getSession().update(employee);
    }
    @Transactional
    @Override
    public void delete(long id) {
        getSession().delete(getEmployeeById(id));
    }
    @Transactional
    @Override
    public Employee getEmployeeById(long id) {
        return getSession().get(Employee.class,id);
    }
    @Transactional
    @Override
    public List<Employee> getAllEmployees() {
        return getSession()
                .createQuery("select e from Employee e")
                .list();
    }
}
