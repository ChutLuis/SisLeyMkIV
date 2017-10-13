package sisley.main;

// TODO: Auto-generated Javadoc
/**
 * The Class ArrayList.
 *
 * @param <E> the element type
 */
public class ArrayList<E> implements List<E> {

	/** The Constant CAPACITY. */
	public static final int CAPACITY=16;
	
	/** The data. */
	private E[ ] data;
	
	/** The size. */
	private int size = 0;
	
	/**
	 * Instantiates a new array list.
	 */
	public ArrayList() {
		this(CAPACITY);
	}

	/**
	 * Instantiates a new array list.
	 *
	 * @param capacity the capacity
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}

	/* (non-Javadoc)
	 * @see sisley.main.List#size()
	 */
	public int size() {
		return size;
	}

	/* (non-Javadoc)
	 * @see sisley.main.List#isEmpty()
	 */
	public boolean isEmpty() { 
		return size == 0;
	}

	/* (non-Javadoc)
	 * @see sisley.main.List#get(int)
	 */
	public E get(int i) {
		checkIndex(i, size);
		return data[i];
	}

	/* (non-Javadoc)
	 * @see sisley.main.List#set(int, java.lang.Object)
	 */
	public E set(int i, E e) {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	/* (non-Javadoc)
	 * @see sisley.main.List#add(int, java.lang.Object)
	 */
	public void add(int i, E e) {
		checkIndex(i, size + 1);
		if (size == data.length) // not enough capacity
			throw new IllegalStateException("Array is full");
		for (int k=size-1; k >= i; k--) // start by shifting rightmost
			data[k+1] = data[k];
		data[i] = e; // ready to place the new element size++;
		
	}

	/* (non-Javadoc)
	 * @see sisley.main.List#remove(int)
	 */
	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for (int k=i; k < size-1; k++)
			data[k] = data[k+1];
		data[size-1] = null;
		size--;
		return temp;
	}
	
	/**
	 * Check index.
	 *
	 * @param i the i
	 * @param n the n
	 * @throws IndexOutOfBoundsException the index out of bounds exception
	 */
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
		throw new IndexOutOfBoundsException("Illegal index: " + i);
	}

}
