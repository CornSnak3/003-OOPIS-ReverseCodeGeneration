

/**
 * Class Person
 */
public class Person extends Account {

  //
  // Fields
  //

  protected String fullName;
  protected Date birthDate;
  protected String phoneNumber;
  
  //
  // Constructors
  //
  public Person () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of fullName
   * @param newVar the new value of fullName
   */
  protected void setFullName (String newVar) {
    fullName = newVar;
  }

  /**
   * Get the value of fullName
   * @return the value of fullName
   */
  protected String getFullName () {
    return fullName;
  }

  /**
   * Set the value of birthDate
   * @param newVar the new value of birthDate
   */
  protected void setBirthDate (Date newVar) {
    birthDate = newVar;
  }

  /**
   * Get the value of birthDate
   * @return the value of birthDate
   */
  protected Date getBirthDate () {
    return birthDate;
  }

  /**
   * Set the value of phoneNumber
   * @param newVar the new value of phoneNumber
   */
  protected void setPhoneNumber (String newVar) {
    phoneNumber = newVar;
  }

  /**
   * Get the value of phoneNumber
   * @return the value of phoneNumber
   */
  protected String getPhoneNumber () {
    return phoneNumber;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String getFullName()
  {
  }


  /**
   * @return       Date
   */
  public Date getBirthDate()
  {
  }


  /**
   * @return       String
   */
  public String getPhoneNumber()
  {
  }


  /**
   * @param        name
   */
  public void setFullName(String name)
  {
  }


  /**
   * @param        date
   */
  public void setBirthdayDate(Date date)
  {
  }


  /**
   * @param        number
   */
  public void setPhoneNumber(String number)
  {
  }


}
