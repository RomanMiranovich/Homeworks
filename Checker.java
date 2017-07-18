/**
 * The class is used for checking sequence
 * is it contains one symbol and is it 
 * non-decreasing or not non-decreasing
 */
class Checker {
  /** 
   * The function is used for determination type of sequence.
   * It may be non-decreasing or do not non-decreasing.
   *
   * @param newArgs - array of String type which contain testing sequence.
   * One elemet of array - one number.
   *
   * @exception NumberFormatException is thrown
   * when user enter wrong data.
   *
   * @return true if sequence is non-decreasing and
   * false if sequence is not non-decreasing.
   */  
  public boolean isNonDecreasing(String[] newArgs) {
    for (int i = 0; i + 1 < newArgs.length; i++) {
      if (Integer.parseInt(newArgs[i]) > Integer.parseInt(newArgs[i + 1])) {
        return false;
      }
    }
    return true;
  }

  /**
   * This function is used for checking are the entered numbers a sequence.
   * 
   * @param newArgs - array of String type which contain testing sequence.
   * One elemet of array - one number.
   * 
   * @return true if was entered several numbers,
   * and false if entered only one number.
   */  
  public boolean isOneSymbol(String[] newArgs) {
    return newArgs.length == 1;
  }
}