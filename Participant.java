
import java.util.*;


/**
 * Class Participant
 */
public class Participant extends Student {

  //
  // Fields
  //

  public Paper [0..*] paper;
  private String presentationPlace;
  private DateTime presentationTime;
  private String bio;
  
  //
  // Constructors
  //
  public Participant () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of paper
   * @param newVar the new value of paper
   */
  public void setPaper (Paper [0..*] newVar) {
    paper = newVar;
  }

  /**
   * Get the value of paper
   * @return the value of paper
   */
  public Paper [0..*] getPaper () {
    return paper;
  }

  /**
   * Set the value of presentationPlace
   * @param newVar the new value of presentationPlace
   */
  private void setPresentationPlace (String newVar) {
    presentationPlace = newVar;
  }

  /**
   * Get the value of presentationPlace
   * @return the value of presentationPlace
   */
  private String getPresentationPlace () {
    return presentationPlace;
  }

  /**
   * Set the value of presentationTime
   * @param newVar the new value of presentationTime
   */
  private void setPresentationTime (DateTime newVar) {
    presentationTime = newVar;
  }

  /**
   * Get the value of presentationTime
   * @return the value of presentationTime
   */
  private DateTime getPresentationTime () {
    return presentationTime;
  }

  /**
   * Set the value of bio
   * @param newVar the new value of bio
   */
  private void setBio (String newVar) {
    bio = newVar;
  }

  /**
   * Get the value of bio
   * @return the value of bio
   */
  private String getBio () {
    return bio;
  }

  //
  // Other methods
  //

  /**
   * @param        paper
   */
  public void addPaper(Paper paper)
  {
  }


  /**
   * @param        paper
   */
  public void deletePaper(Paper paper)
  {
  }


  /**
   * @return       String
   */
  public String getBio()
  {
  }


  /**
   * @return       DateTime
   */
  public DateTime getPresentationTime()
  {
  }


  /**
   * @return       String
   */
  public String getPresentationPlace()
  {
  }


  /**
   * @param        time
   */
  public void setPresentationTime(DateTime time)
  {
  }


}
