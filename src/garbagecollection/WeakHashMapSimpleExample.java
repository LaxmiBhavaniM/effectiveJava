package garbagecollection;

import java.util.WeakHashMap;

/**
 * 1. WeakHashMap is a hash-table based implementation of Map interface
 * 2. Keys are of type WeakReference.
 * 3. An entry will be automatically removed by garbage collector when key is no longer in use
 *
 */
public class WeakHashMapSimpleExample {
	static class ID{
		int id;
		public ID(final int id){
			this.id = id;
		}
		@Override
		public String toString() {
			return String.valueOf(id);
		}
		@Override
		protected void finalize() throws Throwable {
			System.out.println("finalize method is called");
		}
	}
    public static void main(String args[]) throws InterruptedException{
    	WeakHashMap<ID, String> students = new WeakHashMap<>();
    	ID id1 = new ID(1);
    	
    	students.put(id1, "Foo");
    	System.out.println(students.get(id1));
    	
    	// make key eligible for garbage collection
    	id1 = null;
    	
    	System.gc();
    	
    	Thread.sleep(5000);
    	
    	System.out.println(students);
    	
    	/*
    	 * Output:
    	 * Foo
    	 * finalize method is called
    	 * {}
    	 */
    }
}
