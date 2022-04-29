package se2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A class of bags whose entries are stored in a fixed-size array.
 */
public final class ArrayBag<T> implements BagInterface<T> {

    //STEP 1: DETERMINES THE DATA FIELDS   
    /**
     * TODO: [DONE] Declares the necessary attributes 
     * bag: T[] 
     * numberOfEntries: int
     * DEFAULT_CAPACITY: int (30) 
     * MAX_CAPACITY: int (3000)
     */
	
	private final T[] bag;
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY = 30;
	private static final int MAX_CAPACITY = 3000;
	
    //STEP 2: IMPLEMENTS THE CONSTRUCTORS
    /**
     * TODO: [DONE] Creates an empty bag with default capacity
     */
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }
    
    /**
     * TODO: [DONE] Creates an empty bag having a given capacity.
     *
     * @param desiredCapacity The integer capacity desired.
     */
    public ArrayBag(int desiredCapacity) {
		if(desiredCapacity > MAX_CAPACITY) {
    		throw new IllegalStateException("Invalid capacity! Maximum capacity allowed is " + MAX_CAPACITY);
    	} else {
    		@SuppressWarnings("unchecked")
	    	T[] tempBag = (T[]) new Comparable[desiredCapacity];
	    	this.bag = tempBag;
	    	this.numberOfEntries = 0;
    	}

    }

    //STEP 3: IMPLEMENTS THE FUNCTIONS
    /**
     * TODO: [DONE] Adds a new entry to this bag.
     *
     * @param newEntry The object to be added as a new entry.
     * @return True if the addition is successful, or false if not.
     */
    public boolean add(T newEntry) {
    	
//    	check if full 
    	if(isArrayFull()) {
    		System.err.println("Bag is full!\n");
    		return false;
    	}
    	
//    	insert + add numberOfEntries
    	this.bag[numberOfEntries] = newEntry;
    	this.numberOfEntries++;
        return true;
    }

    /**
     * TODO: [] Retrieves all entries that are in this bag.
     *
     * @return A newly allocated array of all the entries in this bag.
     */
    public T[] toArray() {
    	
    	@SuppressWarnings("unchecked")
		T[] newBag = (T[]) Array.newInstance(bag.getClass().getComponentType(), numberOfEntries);
		for(int i = 0; i < numberOfEntries; i++) {
//			System.out.println(bag[i].getClass().getSimpleName());
    		newBag[i] = (T) this.bag[i];
    	}
    	
    	
        return newBag;

    }

    /**
     * TODO: [DONE] Sees whether this bag is empty.
     *
     * @return True if this bag is empty, or false if not.
     */
    public boolean isEmpty() {
        return this.numberOfEntries == 0;
    }

    /**
     * TODO: [DONE] Gets the current number of entries in this bag.
     *
     * @return The integer number of entries currently in this bag.
     */
    public int getCurrentSize() {
        return this.numberOfEntries;
    }

    /**
     * TODO: [DONE] Counts the number of times a given entry appears in this bag.
     *
     * @param anEntry The entry to be counted.
     * @return The number of times anEntry appears in this bag.
     */
    public int getFrequencyOf(T anEntry) {
    	
//    	init count variable
    	int count = 0;
    	
//    	loop through bag
    	for (T t : bag) {
			if(t == anEntry) {
				count++;
			}
		}
    	
        return count;

    }

    /**
     * TODO: [TEMP DONE] Tests whether this bag contains a given entry.
     *
     * @param anEntry The entry to locate.
     * @return True if this bag contains anEntry, or false otherwise.
     */
    public boolean contains(T anEntry) {
        return Arrays.asList(bag).contains(anEntry);
    }

    /**
     * TODO: [TEMP DONE] Removes all entries from this bag.
     */
    public void clear() {
    	numberOfEntries = 0;
    }

    /**
     * TODO: [TEMP DONE] Removes one unspecified entry from this bag, if possible.
     *
     * @return Either the removed entry, if the removal was successful, or null.
     */
    public T remove() {
        return removeEntry(numberOfEntries-1);

    }

    /**
     * TODO: [] Removes one occurrence of a given entry from this bag.
     *
     * @param anEntry The entry to be removed.
     * @return True if the removal was successful, or false if not.
     */
    public boolean remove(T anEntry) {
    	
//    	check if bag contain this entry
    	if(contains(anEntry)) {
    		
//    		get index
    		int index = getIndexOf(anEntry);
    		
    		T removedItem = removeEntry(index);
    		
    		if(removedItem != null) {
    			return true;    			
    		}
    	}
    	    	
//    	default
        return false;

    }

    // TODO: [DONE] Returns true if the array bag is full, or false if not.
    private boolean isArrayFull() {
        return this.numberOfEntries == this.bag.length;

    }

    // TODO: [] Locates a given entry within the array bag.
    // Returns the index of the entry, if located,
    // or -1 otherwise.
    // Precondition: checkInitialization has been called.
    private int getIndexOf(T anEntry) {
    	
//    	check if contain this entry
    	if(contains(anEntry)) {
        	return Arrays.asList(bag).indexOf(anEntry);
    	}

//    	default
        return -1;

    }

    // TODO: [] Removes and returns the entry at a given index within the array.
    // If no such entry exists, returns null.
    // Precondition: 0 <= givenIndex < numberOfEntries.
    // Precondition: checkInitialization has been called.
    private T removeEntry(int givenIndex) {

//    	init removedItem
    	T removedItem = null;
    	
//    	validate index
    	if(givenIndex >= 0 || givenIndex < this.numberOfEntries) {
    		
    		
//    		reduce the number of bag
    		numberOfEntries--;
    		
//    		remove last entry
    		if(givenIndex == numberOfEntries) {
    			removedItem = bag[numberOfEntries];
    		} else {
    			removedItem = bag[givenIndex];
//    			System.out.println(removedItem);
    			for(int i = givenIndex; i < numberOfEntries; i++) {
    				bag[i] = bag[i+1];
//    				System.out.println(bag[i]);
    			}
    		}
    		
    	}
    	
	
        return removedItem;

    }

}

