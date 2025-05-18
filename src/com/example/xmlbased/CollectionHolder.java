package com.example.xmlbased;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionHolder {
    private List<String> nameList;
    private Set<String> uniqueNames;
    private Map<String, Integer> itemCounts;
    private Properties dbConfig;

    // Getters and Setters for all fields
    public void setNameList(List<String> nameList) { this.nameList = nameList; }
    public List<String> getNameList() { return nameList; }
    public void setUniqueNames(Set<String> uniqueNames) { this.uniqueNames = uniqueNames; }
    public Set<String> getUniqueNames() { return uniqueNames; }
    public void setItemCounts(Map<String, Integer> itemCounts) { this.itemCounts = itemCounts; }
    public Map<String, Integer> getItemCounts() { return itemCounts; }
    public void setDbConfig(Properties dbConfig) { this.dbConfig = dbConfig; }
    public Properties getDbConfig() { return dbConfig; }

    public void displayCollections() {
        System.out.println("Names List: " + nameList);
        System.out.println("Unique Names Set: " + uniqueNames);
        System.out.println("Item Counts Map: " + itemCounts);
        System.out.println("DB Config Properties: " + dbConfig);
    }
}