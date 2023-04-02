package ex.thisisjava.exam1303;

public class Container<T1, T2> {
	private T1 key;
	private T2 value;

	public T1 getKey() {
		return key;
	}

	public void setKey(T1 key) {
		this.key = key;
	}

	public T2 getValue() {
		return value;
	}

	public void setValue(T2 value) {
		this.value = value;
	}

	public void set(T1 key, T2 value) {
		this.key = key;
		this.value = value;
	}
}