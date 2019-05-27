/*
 * Copyright (c) 2017, info@mimidots.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package sms_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author info@mimidots.com
 */
public class Connect {

    private Connection conn;
    private String driver;
    private String host;
    private String username;
    private String pswd;
    private String protocal;
    private String url;
    private Properties info;
    private String database;

    private Statement stm;

    public Connect() {
        driver = "com.mysql.jdbc.Driver";
        username = "root";
        pswd = "";
        url="jdbc:mysql://localhost/";
        info = new Properties();
        database = "cu";
    }

    /**
     * Constructor  initialize class variables with custom values
     * @param driver database connection driver
     * @param username database username
     * @param pswd  database user password
     * @param url database url [without the database name]
     * @param database the database name to be used in creating the connection
     */
    public Connect(String driver, String username, String pswd, String url, String database) {
        this.driver = driver;
        this.username = username;
        this.pswd = pswd;
        this.url = url;
        this.database = database;
    }

    public Connection connect() {
        url = url + database;
        try {
            Class.forName(driver).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username,pswd);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
