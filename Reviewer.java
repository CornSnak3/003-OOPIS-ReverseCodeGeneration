
import java.util.*;


/**
 * Class Reviewer
 */
public class Reviewer extends Teacher {

  //
  // Fields
  //

  private Paper [0..*] pendingPapers;
  private Paper [0..*] reviewedPapers;
  
  //
  // Constructors
  //
  public Reviewer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of pendingPapers
   * @param newVar the new value of pendingPapers
   */
  private void setPendingPapers (Paper [0..*] newVar) {
    pendingPapers = newVar;
  }

  /**
   * Get the value of pendingPapers
   * @return the value of pendingPapers
   */
  private Paper [0..*] getPendingPapers () {
    return pendingPapers;
  }

  /**
   * Set the value of reviewedPapers
   * @param newVar the new value of reviewedPapers
   */
  private void setReviewedPapers (Paper [0..*] newVar) {
    reviewedPapers = newVar;
  }

  /**
   * Get the value of reviewedPapers
   * @return the value of reviewedPapers
   */
  private Paper [0..*] getReviewedPapers () {
    return reviewedPapers;
  }

  //
  // Other methods
  //

  /**
   * @param        paper
   * @param        result
   */
  public void reviewPaper(Paper paper, Boolean result)
  {
  }


  /**
   * @param        paper
   */
  public void addPendingPaper(Paper paper)
  {
  }


}
