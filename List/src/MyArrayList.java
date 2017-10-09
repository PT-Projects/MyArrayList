import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<E> extends AbstractList<E>
{
    private static final int INITIAL_CAPACITY = 10;
    private E[] theData;
    private int size = 0;
    private int capacity = 0;
    
	/**
	 * Constructs a new empty ArrayList
	 */
	@SuppressWarnings("unchecked")
	public MyArrayList() {
        capacity = INITIAL_CAPACITY;
        theData = (E[]) new Object[capacity];
		size = 0;
	}
	
	/**
	 * Constructs a new ArrayList initialized with the elements from a collection.
	 * @param c the elements used to initialize the ArrayList
	 */
	@SuppressWarnings("unchecked")
	public MyArrayList(Collection<E> c) {

	    size = c.size();

	    this.addAll(c);

	}
	
	@Override
	/**
	 * Returns the element at the specified position in this list.
	 * @param index the index of the element to get
	 * @return the element at the index
	 * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
	 */
	public E get(int index) {

	    try {
	    	if (index >= size){
	    		return theData[index+10];
			}
	        return theData[index];
        }
        catch (Exception exception){
	        throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }

	}

	@Override
	/**
	 * Returns the size of the list.
	 * @return the size of the list
	 */
	public int size() {
		return size;
	}
	
	@Override
	/**
	 *  Replaces the element at the specified position in this list with the specified element.
	 *  @param index the index of the element to change
	 *  @param element the element to place into the index
	 *  @return the element that was replaced
	 *  @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
	 */
	public E set(int index, E element) {

	    E oldObj = theData[index];

        try{
            theData[index] = element;
            return oldObj;
        }
        catch (Exception exception){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }

	}

	@Override
	/**
	 * Inserts the specified element at the specified position in this list.
	 * @param index the index to add to
	 * @param element the element to add
	 * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
	 */
    public void add(int index, E element) {

        try{
            System.arraycopy(theData,index,theData,index+1,size-index);
            theData[index] = element;
            size++;
		}
        catch (Exception exception){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }

        ///**     Make This Shit Fucking Work Dammit     **///

		if (size >= capacity){
			capacity = capacity*2;
			theData = Arrays.copyOf(theData,capacity);
		}
	
	}
	
	@Override
	/**
	 *  Removes the element at the specified position in this list.
	 *  @param index the index of the element to remove
	 *  @return the element removed
	 *  @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
	 */
	public E remove(int index) {

	    int numMoved = size - index - 1;

	    E oldObj = theData[index];

		try{
		    System.arraycopy(theData,index+1,theData,index,numMoved);
		    theData[--size] = null;
		    return oldObj;
        }
        catch (Exception exception){
		    throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }

	}
}
