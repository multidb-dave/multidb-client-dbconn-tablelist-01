package com.xql.clientmdb;

// pgseliso@gmail.com
// husnifahmi@outlook.com
// 2023-08-05

public class App {
    public static void main(String[] args) {
        String baseUrl = "http://localhost:8080";
        // String baseUrl = "http://api001.multidb.net:8080";

        // List of virtual schemas
        String url = baseUrl + "/api/v1/schemas";
        ListSchemas listSchemas = new ListSchemas();
        listSchemas.setUrl(url);
        listSchemas.getSchemas();
        System.out.println();

        // List of database sources
        url = baseUrl + "/api/v1/dbconns";
        ListDbconns listDbconns = new ListDbconns();
        listDbconns.setUrl(url);
        listDbconns.getDbconns();
        System.out.println();

        // Cannot remove dbconn which is still being used by schemas
        // Remove schemas first before removing dbconns
        GetDbconnTableList getDbconnTableList = new GetDbconnTableList();
        getDbconnTableList.setBaseUrl(baseUrl);

        // incorrect input
        // 1. get list of tables from database source: dbconn null
        System.out.println("1. get list of tables from database source: dbconn null");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnTableList.setUrl(url);
        getDbconnTableList.setDbconn(null);

        getDbconnTableList.getDbconnTableList();
        System.out.println();

        // incorrect input
        // 2. get list of tables from database source: dbconn blank
        System.out.println("2. get list of tables from database source: dbconn blank");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnTableList.setUrl(url);
        getDbconnTableList.setDbconn("     ");

        getDbconnTableList.getDbconnTableList();
        System.out.println();

        // incorrect input
        // 3. get list of tables from database source: dbconn not found
        System.out.println("3. get list of tables from database source: dbconn not found");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnTableList.setUrl(url);
        getDbconnTableList.setDbconn("psql_northwindc");

        getDbconnTableList.getDbconnTableList();
        System.out.println();

        // incorrect input
        // 4. get list of tables from database source: contains space
        System.out.println("4. get list of tables from database source: contains space");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnTableList.setUrl(url);
        getDbconnTableList.setDbconn("psql northwind");

        getDbconnTableList.getDbconnTableList();
        System.out.println();

        // incorrect input
        // 5. get list of tables from database source: special char #
        System.out.println("5. get list of tables from database source: special char #");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnTableList.setUrl(url);
        getDbconnTableList.setDbconn("psql#northwind");

        getDbconnTableList.getDbconnTableList();
        System.out.println();

        // correct input
        // 6. get list of tables from database source: psql_northwind
        System.out.println("6. get list of tables from database source: psql_northwind");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnTableList.setUrl(url);
        getDbconnTableList.setDbconn("psql_northwind");

        getDbconnTableList.getDbconnTableList();
        System.out.println();

        // correct input
        // 7. get list of tables from database source: mysql_northwind
        System.out.println("7. get list of tables from database source: mysql_northwind");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnTableList.setUrl(url);
        getDbconnTableList.setDbconn("mysql_northwind");

        getDbconnTableList.getDbconnTableList();
        System.out.println();

        // correct input
        // 8. get list of tables from database source: csv_northwind
        System.out.println("8. get list of tables from database source: csv_northwind");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnTableList.setUrl(url);
        getDbconnTableList.setDbconn("csv_northwind");

        getDbconnTableList.getDbconnTableList();
        System.out.println();

        // correct input
        // 9. get list of tables from database source: ora_northwind
        System.out.println("9. get list of tables from database source: ora_northwind");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnTableList.setUrl(url);
        getDbconnTableList.setDbconn("ora_northwind");

        getDbconnTableList.getDbconnTableList();
        System.out.println();

        // correct input
        // 10. get list of tables from database source: msq_northwind
        System.out.println("10. get list of tables from database source: msq_northwind");
        url = baseUrl + "/api/v1/dbconns/";
        getDbconnTableList.setUrl(url);
        getDbconnTableList.setDbconn("msq_northwind");

        getDbconnTableList.getDbconnTableList();
        System.out.println();

    }
}
