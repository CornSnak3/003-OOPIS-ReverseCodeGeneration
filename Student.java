

/**
 * Class Student
 */
public class Student extends Account, Person {

  //
  // Fields
  //

  public StudentCard �������;
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
   * Set the value of �������
   * @param newVar the new value of �������
   */
  public void set������� (StudentCard newVar) {
    ������� = newVar;
  }

  /**
   * Get the value of �������
   * @return the value of �������
   */
  public StudentCard get������� () {
    return �������;
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
