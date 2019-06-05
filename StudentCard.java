

/**
 * Class StudentCard
 */
public class StudentCard {

  //
  // Fields
  //

  private Integer id;
  private Student owner;
  private Date dateOfIssue;
  private Date validThru;
  private Student Принадлежит;
  
  //
  // Constructors
  //
  public StudentCard () { };
  
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
  private void setId (Integer newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  private Integer getId () {
    return id;
  }

  /**
   * Set the value of owner
   * @param newVar the new value of owner
   */
  private void setOwner (Student newVar) {
    owner = newVar;
  }

  /**
   * Get the value of owner
   * @return the value of owner
   */
  private Student getOwner () {
    return owner;
  }

  /**
   * Set the value of dateOfIssue
   * @param newVar the new value of dateOfIssue
   */
  private void setDateOfIssue (Date newVar) {
    dateOfIssue = newVar;
  }

  /**
   * Get the value of dateOfIssue
   * @return the value of dateOfIssue
   */
  private Date getDateOfIssue () {
    return dateOfIssue;
  }

  /**
   * Set the value of validThru
   * @param newVar the new value of validThru
   */
  private void setValidThru (Date newVar) {
    validThru = newVar;
  }

  /**
   * Get the value of validThru
   * @return the value of validThru
   */
  private Date getValidThru () {
    return validThru;
  }

  /**
   * Set the value of Принадлежит
   * @param newVar the new value of Принадлежит
   */
  private void setПринадлежит (Student newVar) {
    Принадлежит = newVar;
  }

  /**
   * Get the value of Принадлежит
   * @return the value of Принадлежит
   */
  private Student getПринадлежит () {
    return Принадлежит;
  }

  //
  // Other methods
  //

  /**
   */
  public void getNumber()
  {
  }


  /**
   */
  public void getDateOfIssue()
  {
  }


  /**
   */
  public void getExpirationDate()
  {
  }


  /**
   * @return       Student
   */
  public Student getOwner()
  {
  }


}
