

/**
 * Class Account
 */
public class Account {

  //
  // Fields
  //

  protected Integer id;
  protected Date registerDate;
  protected DateTime lastLogin;
  protected String username;
  protected Integer password;
  
  //
  // Constructors
  //
  public Account () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  protected void setId (Integer newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  protected Integer getId () {
    return id;
  }

  /**
   * Set the value of registerDate
   * @param newVar the new value of registerDate
   */
  protected void setRegisterDate (Date newVar) {
    registerDate = newVar;
  }

  /**
   * Get the value of registerDate
   * @return the value of registerDate
   */
  protected Date getRegisterDate () {
    return registerDate;
  }

  /**
   * Set the value of lastLogin
   * @param newVar the new value of lastLogin
   */
  protected void setLastLogin (DateTime newVar) {
    lastLogin = newVar;
  }

  /**
   * Get the value of lastLogin
   * @return the value of lastLogin
   */
  protected DateTime getLastLogin () {
    return lastLogin;
  }

  /**
   * Set the value of username
   * @param newVar the new value of username
   */
  protected void setUsername (String newVar) {
    username = newVar;
  }

  /**
   * Get the value of username
   * @return the value of username
   */
  protected String getUsername () {
    return username;
  }

  /**
   * Set the value of password
   * @param newVar the new value of password
   */
  protected void setPassword (Integer newVar) {
    password = newVar;
  }

  protected Integer getPassword () {
    return password;
  }

  public String getUsername()
  {
  }

  public Date getRegisterDate()
  {
  }

  public void setPassword(String value)
  {
  }
  
  public void setLastLogin(DateTime value)
  {
  }

  public Boolean verifyPassword(String new_parameter)
  {
  }


}
