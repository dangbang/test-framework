package part2.com.saucedemo.config;

public enum TestDataEnum {
    // User credentials
    STANDARD_USER("standard_user"),
    INVALID_PASSWORD("xyz3400"),
    
    // Error messages
    LOGIN_ERROR_MESSAGE("Epic sadface: Username and password do not match any user in this service"),
    
    // Performance thresholds
    MAX_PAGE_LOAD_TIME("3.0");
    
    private final String value;
    
    TestDataEnum(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    public double getDoubleValue() {
        return Double.parseDouble(value);
    }
} 