package Persistence;

import java.sql.SQLException;

import Domain.Inquiry;

public class DAOGeneral {
	private DBBroker dbbroker;

	public DAOGeneral() throws SQLException, Exception {
		dbbroker=new DBBroker();
	}

	public void insert() {
		throw new UnsupportedOperationException();
	}
	public int insertInquiry(Inquiry inquiry) throws Exception{
		throw new UnsupportedOperationException();
	}

	public void update() {
		throw new UnsupportedOperationException();
	}

	public void delete() {
		throw new UnsupportedOperationException();
	}

	public void readById() {
		throw new UnsupportedOperationException();
	}

	public void readAll() {
		throw new UnsupportedOperationException();
	}
}