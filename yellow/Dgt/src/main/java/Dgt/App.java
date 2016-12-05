package Dgt;

import java.sql.SQLException;

import org.open_inquiry_persistance.DBBroker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, Exception
    {
        System.out.println( "Hello World!" );
        DBBroker d=new DBBroker();
        System.out.println( "Connected" );
    }
}
