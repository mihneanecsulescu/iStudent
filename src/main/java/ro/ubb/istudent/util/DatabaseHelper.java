package ro.ubb.istudent.util;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import ro.ubb.istudent.domain.Student;

public class DatabaseHelper {
    MongoClient client;
    DB db;
    DBCollection collection;


    public DatabaseHelper(){
        client = new MongoClient("localhost",27017); //with default server and port adress
        db = client.getDB( "IStudent" );
        collection = db.getCollection("student");

    }

    public void printStudent(){
        DBObject dbo = collection.findOne();
        String firstname = (String) dbo.get("firstname");
        String lastname = (String) dbo.get("lastname");
        System.out.println(firstname+" "+lastname);
    }

}
