package com.example;

public class ReportService {
    private DataSourceBean dataSource;

    // Setter for injection
    public void setDataSource(DataSourceBean dataSource) {
        this.dataSource = dataSource;
    }

    public void generateReport() {
        if (dataSource != null) {
            System.out.println("Generating report using data source: " + dataSource.getConnectionURL());
        } else {
            System.out.println("DataSource not configured for ReportService.");
        }
    }
}