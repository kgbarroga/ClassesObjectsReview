public class Account {
    /**
     * Set up initial values for properties
     */
    // private String username = "John Doe";
    // private String pword = "kwv7HiUuDr";
    /**
     * Set up declaration only
     * private String username;
     * private String pword;
     * 
     */
    private String username;
    private String pword;
    /**
     * Set up getters and setters
     */
    public void setUsername(String uname){
        username = uname;
    }
    /**
     * Get username value
     * @return
     */
    public String getUsername(){
        return username;
    }

    /**
     * Set up getters and setters
     */
    public void setPword(String password){
        pword = password;
    }
    /**
     * Get password value
     * @return
     */
    public String getPword(){
        return pword;
    }

    
}
