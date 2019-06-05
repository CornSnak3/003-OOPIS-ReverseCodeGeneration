

/**
 * Class Student
 */
public class Student extends Account, Person {

  //
  // Fields
  //

  public StudentCard Владеет;
  private StudentCard studentCard;
  private String studyGroup;
  
  //
  // Constructors
  //
  public Student () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Владеет
   * @param newVar the new value of Владеет
   */
  public void setВладеет (StudentCard newVar) {
    Владеет = newVar;
  }

  /**
   * Get the value of Владеет
   * @return the value of Владеет
   */
  public StudentCard getВладеет () {
    return Владеет;
  }

  /**
   * Set the value of studentCard
   * @param newVar the new value of studentCard
   */
  private void setStudentCard (StudentCard newVar) {
    studentCard = newVar;
  }

  /**
   * Get the value of studentCard
   * @return the value of studentCard
   */
  private StudentCard getStudentCard () {
    return studentCard;
  }

  /**
   * Set the value of studyGroup
   * @param newVar the new value of studyGroup
   */
  private void setStudyGroup (String newVar) {
    studyGroup = newVar;
  }

  /**
   * Get the value of studyGroup
   * @return the value of studyGroup
   */
  private String getStudyGroup () {
    return studyGroup;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String getStudyGroup()
  {
  }


  /**
   * @return       StudentCard
   */
  public StudentCard getStudentCard()
  {
  }


  /**
   * @param        group
   */
  public void setStudyGroup_(String group)
  {
  }


  /**
   * @param        card
   */
  public void setStudentCard(StudentCard card)
  {
  }


}
