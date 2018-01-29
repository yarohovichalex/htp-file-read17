package by.htp.librory.action.console;


import java.io.PrintWriter;
import java.util.List;

import by.htp.librory.action.BaseAction;
import by.htp.librory.bean.Book;
import by.htp.librory.dao.BookDao;
import by.htp.librory.dao.file.BookDaoFileImpl2;

public class HelloWorldConsoleImpl implements BaseAction {
	private BookDao dao = new BookDaoFileImpl2();

	@Override
	public void doSmth(PrintWriter out) {
		List<Book> books = dao.readAll();
		
		for (Book book: books) {
			out.println(book + "\r\n");
		}
		
	}

}
