package school;

import java.sql.*;

public class Main {
    public static void main(String[] args)  {
        Queries myQuery = new Queries();
        myQuery.firstQuery();
        myQuery.secondQuery(5);
        myQuery.thirdQuery();
        myQuery.fourthQuery();

    }
}


