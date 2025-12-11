package pt.ulusofona.aed.deisimdb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import javax.print.DocFlavor.STRING;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;


public class Dao {
    private String connectionUrl; 
    private String sqlserver = "//localhost:1433";
    private String databaseName="deisIMDB";
    private String user="sa";
    private String password="YourStrong!Passw0rd";//"ClientS@fe!Passw0rd";
    private String encrypt="true";
    private String trustServerCertificate="true";

    public Dao() {
        connectionUrl = "jdbc:sqlserver:" + sqlserver + 
                        ";databaseName=" + databaseName + 
                        ";user=" + user + 
                        ";password=" + password + 
                        ";encrypt=" + encrypt + 
                        ";trustServerCertificate=" + trustServerCertificate + ";";
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }    

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionUrl);
    }
    
    @Override
    public String toString() {
        return  connectionUrl.toString();
    }

}
