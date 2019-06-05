

/**
 * Class Volonteer
 */
public class Volonteer extends Student {

  //
  // Fields
  //

  private Date [0..*] workDays;
  private String occupation;
  
  //
  // Constructors
  //
  public Volonteer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of workDays
   * @param newVar the new value of workDays
   */
  private void setWorkDays (Date [0..*] newVar) {
    workDays = newVar;
  }

  /**
   * Get the value of workDays
   * @return the value of workDays
   */
  private Date [0..*] getWorkDays () {
    return workDays;
  }

  /**
   * Set the value of occupation
   * @param newVar the new value of occupation
   */
  private void setOccupation (String newVar) {
    occupation = newVar;
  }

  /**
   * Get the value of occupation
   * @return the value of occupation
   */
  private String getOccupation () {
    return occupation;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String getOccupation()
  {
  }


  /**
   * @return       Boolean
   * @param        date
   */
  public Boolean isWorkingOn(Date date)
  {
  }


  /**
   * @param        date
   */
  public void addWorkDay(Date date)
  {
  }


  /**
   * @param        date
   */
  public void deleteWorkDay(Date date)
  {
  }


}
