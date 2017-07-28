/**
 * The class is used for creating integer dynamic arrays
 * and for working with them.
 */
class VariableArray {
  private final int DEFAULT_SIZE = 10;
  private int realSize;
  private int[] array;
  
  /**
   * This constructor is called when
   * initial size of array is known.
   *
   * @param size - size of array.
   */  
  public VariableArray(int size) throws NegativeArraySizeException {
    if (size <= 0) {
      throw new NegativeArraySizeException();
    }
    array = new int[size];
  }

  /**
   * This constructor is calling when
   * initial size if array is unknown.
   * It creats array with default size 10.
   */
  public VariableArray() {
    array = new int[DEFAULT_SIZE];
  }

  /**
   * The function is used for creating string
   * from array.
   *
   * @return strArray - string which contain
   * numbers of array.
   */
  public String outArray() {
    String[] strElement = new String[realSize];
    StringBuilder builderStrArray = new StringBuilder();

    for (int i = 0; i < realSize; i++) {
      strElement[i] = Integer.toString(array[i]);
      builderStrArray.append(strElement[i]).append(" ");
    }
    return builderStrArray.toString();
  }

  /**
   * The function is used for getting size of
   * array.
   * 
   * @return realSize - count of elements at array.
   */
  public int getSize() {
    return realSize;
  }

  /**
   * The function is used for checking transferred
   * index.
   * 
   * @throws ArrayIndexOutOfBoundsException if index
   * less than zero or more than size of array.
   */
  private void checkIndex(int index) throws ArrayIndexOutOfBoundsException {
    if (index >= realSize || index < 0) {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  /**
   * The function is used for allotment
   * of memory for array.
   * New size of array bigger in 2 times
   * than old. 
   */
  private void allotMemoryIfNecessary() {
    if(realSize == array.length) {
      int[] newArray = new int[array.length * 2];
      for (int i = 0; i < array.length; i++) {
        newArray[i] = array[i];
      }
      array = newArray;
    }
  }

  /**
   * The function is used for deleting one
   * of the array elements.
   *
   * @param index - contains index of removable
   * element.
   */ 
  public void deleteElement(int index) {
    checkIndex(index);   
    for (int i = index; i < realSize - 1; i++) {
      array[i] = array[i + 1];
    }
    realSize--;
  }

  /**
   * The function is used for adding an element
   * at the end of array.
   * 
   * @param newElement - added element.
   */
  public void addElement(int newElement) {
    array[realSize] = newElement;
    realSize++;
    allotMemoryIfNecessary();
  }

  /**
   * The function is used for insertion an element
   * to some place at array.
   *
   * @param newElement - added element.
   * @param index - index of place for inserting.
   */
  public void insertElement(int newElement, int index) {
    checkIndex(index);
    for (int i = realSize; i > index; i--) {
      array[i] = array[i - 1];
    }
    array[index] = newElement;
    realSize++;
    allotMemoryIfNecessary();
  }

  /**
   * The function is used for getting an element
   * of array.
   *
   * @param index - index of getting element.
   *
   * @return getting element.
   */
  public int getElement(int index) {
    checkIndex(index);
    return array[index];
  }

  /**
   * The function is used for setting an element
   * of array.
   *
   * @param newElement - setting element.
   * @param index - index of setting element.
   */
  public void setElement(int newElement, int index) {
    checkIndex(index);
    array[index] = newElement;
  }
}