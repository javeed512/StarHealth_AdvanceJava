package com.starhealth.spring.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.starhealth.spring.ems.beans.Employee;

@Repository
public class EmployeeDaoImp implements IEmployeeDAO {

	Connection conn = DBUtil.getDBConnection();
	
	@Override
	public int addEmployee(Employee emp) {
		
		int count = 0;

		try {
			String insertQuery = "insert into employee(eid,ename,salary,job,doj,comm) values(?,?,?,?,current_date,?)";
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEname());
			pstmt.setDouble(3, emp.getSalary());
			pstmt.setString(4, emp.getJob());
			pstmt.setInt(5, emp.getComm());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
		
		
	}

	@Override
	public int updateEmployee(Employee emp) {
		
		
		int count = 0;

		try {
			String updateQuery = "update employee set ename =? , salary = ?, job = ?, comm =? where eid = ?";
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, emp.getEname());
			pstmt.setDouble(2, emp.getSalary());
			pstmt.setString(3, emp.getJob());
			pstmt.setInt(4, emp.getComm());
			pstmt.setInt(5, emp.getEid());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
		
	}

	@Override
	public int deleteEmployeeById(int eid) {
		String deleteQuery = "delete from employee where eid = ?";

		PreparedStatement pstmt;
		int deleteCount = 0;
		try {
			pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setInt(1, eid);

			deleteCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return deleteCount;
	}

	@Override
	public Employee selectEmployeeById(int eid) {
		String selectQuery = "select * from employee where eid = ?";

		PreparedStatement pstmt;

		Employee emp = new Employee();

		try {
			pstmt = conn.prepareStatement(selectQuery);

			pstmt.setInt(1, eid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				emp.setEid(rs.getInt("eid"));
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setDoj(rs.getDate("doj"));
				emp.setJob(rs.getString("job"));
				emp.setComm(rs.getInt("comm"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;

	}

	@Override
	public List<Employee> selectAllEmployeees() {
		String selectQuery = "select * from employee";

		PreparedStatement pstmt;

		List<Employee> list = new ArrayList<Employee>();
		
		try {
			pstmt = conn.prepareStatement(selectQuery);

			ResultSet rs = pstmt.executeQuery();

			

			while (rs.next()) {

				Employee emp = new Employee();
				emp.setEid(rs.getInt("eid"));
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setDoj(rs.getDate("doj"));
				emp.setJob(rs.getString("job"));
				emp.setComm(rs.getInt("comm"));

				list.add(emp);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

}
