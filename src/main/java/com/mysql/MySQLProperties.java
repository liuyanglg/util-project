package com.mysql;

/**
 * Created by liuya on 2017/7/20.
 */
public class MySQLProperties {
    public final static String DEV_DRIVER = "com.mysql.jdbc.Driver";
    public final static String DEV_URL = "jdbc:mysql://192.168.210.33:3306/platformkf?useUnicode=true&characterEncoding=utf8&autoReconnect=true";
    public final static String DEV_USERNAME = "dev";
    public final static String DEV_PASSWORD = "dev123456";

    public final static String CMP_DRIVER = "com.mysql.jdbc.Driver";
    public final static String CMP_URL_DATASERVER = "jdbc:mysql://192.168.210.33:3306/dataserver?useUnicode=true&characterEncoding=utf8&autoReconnect=true";
    public final static String CMP_URL_PLATFORMKF = "jdbc:mysql://192.168.210.33:3306/platformkf?useUnicode=true&characterEncoding=utf8&autoReconnect=true";
    public final static String CMP_USERNAME = "donglihua";
    public final static String CMP_PASSWORD = "DataServer^33";

    public final static String LOCAL_DRIVER = "com.mysql.jdbc.Driver";
    public final static String LOCAL_URL = "jdbc:mysql://127.0.0.1:3306/dataserver?useUnicode=true&characterEncoding=utf8&autoReconnect=true";
    public final static String LOCAL_USERNAME = "root";
    public final static String LOCAL_PASSWORD = "root";


}
