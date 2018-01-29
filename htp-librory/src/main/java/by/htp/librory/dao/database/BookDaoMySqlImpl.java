package by.htp.librory.dao.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import by.htp.librory.bean.Book;
import by.htp.librory.dao.BookDao;

public class BookDaoMySqlImpl implements BookDao{

	@Override
	public void criate(Book entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Book entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> readAll() {
		try(Connection cn = DriverManager.getConnection("")){
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*@Override
	public List<Book> readAll() {
		Connection cn = null;
		try {
			cn = DriverManager.getConnection("");			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(cn != null) {
					cn.close();
				}				
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		return null;
	}*/

}
