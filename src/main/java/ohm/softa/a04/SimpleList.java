package ohm.softa.a04;

import java.util.Iterator;
import java.util.function.Function;

public interface SimpleList<T> extends Iterable {
	/**
	 * Add a given object to the back of the list.
	 */
	void add(T o);

	void addDefault();

	/**
	 * @return current size of the list
	 */
	int size();

	/**
	 * Generate a new list using the given filter instance.
	 *
	 * @return a new, filtered list
	 */
	default SimpleList<T> filter(SimpleFilter<T> filter) {
		SimpleList<T> result = new SimpleListImpl();
		for(Object o : this){
			if(filter.include((T) o)){
				result.add((T) o);
			}
		}
		return result;
	}

	default <R> SimpleList<R> map(Function<T,R> transform) {
		SimpleList<R> newList = new SimpleListImpl<R>() {

			for(Object o : this)

		}
	}
}
