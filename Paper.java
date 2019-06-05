
import java.util.*;


/**
 * Class Paper
 */
public class Paper {

  //
  // Fields
  //

  private Integer id;
  private String title;
  private DateTime submissionTime;
  private Boolean isReviewed;
  private Boolean isPositiveReviewed;
  private DateTime reviewTime;
  private String summary;
  
  //
  // Constructors
  //
  public Paper () { };
  
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
   * Set the value of title
   * @param newVar the new value of title
   */
  private void setTitle (String newVar) {
    title = newVar;
  }

  /**
   * Get the value of title
   * @return the value of title
   */
  private String getTitle () {
    return title;
  }

  /**
   * Set the value of submissionTime
   * @param newVar the new value of submissionTime
   */
  private void setSubmissionTime (DateTime newVar) {
    submissionTime = newVar;
  }

  /**
   * Get the value of submissionTime
   * @return the value of submissionTime
   */
  private DateTime getSubmissionTime () {
    return submissionTime;
  }

  /**
   * Set the value of isReviewed
   * @param newVar the new value of isReviewed
   */
  private void setIsReviewed (Boolean newVar) {
    isReviewed = newVar;
  }

  /**
   * Get the value of isReviewed
   * @return the value of isReviewed
   */
  private Boolean getIsReviewed () {
    return isReviewed;
  }

  /**
   * Set the value of isPositiveReviewed
   * @param newVar the new value of isPositiveReviewed
   */
  private void setIsPositiveReviewed (Boolean newVar) {
    isPositiveReviewed = newVar;
  }

  /**
   * Get the value of isPositiveReviewed
   * @return the value of isPositiveReviewed
   */
  private Boolean getIsPositiveReviewed () {
    return isPositiveReviewed;
  }

  /**
   * Set the value of reviewTime
   * @param newVar the new value of reviewTime
   */
  private void setReviewTime (DateTime newVar) {
    reviewTime = newVar;
  }

  /**
   * Get the value of reviewTime
   * @return the value of reviewTime
   */
  private DateTime getReviewTime () {
    return reviewTime;
  }

  /**
   * Set the value of summary
   * @param newVar the new value of summary
   */
  private void setSummary (String newVar) {
    summary = newVar;
  }

  /**
   * Get the value of summary
   * @return the value of summary
   */
  private String getSummary () {
    return summary;
  }

  //
  // Other methods
  //

  /**
   * @return       Integer
   */
  public Integer getId()
  {
  }


  /**
   * @return       String
   */
  public String getTitle()
  {
  }


  /**
   * @return       String
   */
  public String getSummary()
  {
  }


  /**
   * @return       String
   */
  public String getReviewStatus()
  {
  }


  /**
   * @param        status
   */
  public void setReviewStatus(Boolean status)
  {
  }


}
