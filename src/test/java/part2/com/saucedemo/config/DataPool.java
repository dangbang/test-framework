package part2.com.saucedemo.config;

import java.util.HashMap;
import java.util.Map;

public class DataPool {
    private static final Map<String, Map<String, String>> userDataPool = new HashMap<>();
    private static final Map<String, Map<String, String>> testDataPool = new HashMap<>();
    
    static {
        // Initialize user data pool
        Map<String, String> standardUser = new HashMap<>();
        standardUser.put("username", "standard_user");
        standardUser.put("password", "secret_sauce");
        userDataPool.put("STANDARD_USER", standardUser);
        
        Map<String, String> lockedUser = new HashMap<>();
        lockedUser.put("username", "locked_out_user");
        lockedUser.put("password", "secret_sauce");
        userDataPool.put("LOCKED_USER", lockedUser);
        
        // Initialize test data pool
        Map<String, String> loginTestData = new HashMap<>();
        loginTestData.put("errorMessage", "Epic sadface: Username and password do not match any user in this service");
        loginTestData.put("maxLoadTime", "3.0");
        testDataPool.put("LOGIN_TEST", loginTestData);
    }
    
    public static Map<String, String> getUserData(String userType) {
        return userDataPool.get(userType);
    }
    
    public static Map<String, String> getTestData(String testType) {
        return testDataPool.get(testType);
    }
    
    public static String getUserDataValue(String userType, String key) {
        return userDataPool.get(userType).get(key);
    }
    
    public static String getTestDataValue(String testType, String key) {
        return testDataPool.get(testType).get(key);
    }
} 