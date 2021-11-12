package TaskNumberFive;

public class NumberFiveSubject {
	int capacity;
	int value;
	
	public NumberFiveSubject(int capacity, int value) {
		super();
		this.capacity = capacity;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "NumberFiveSubject [capacity=" + capacity + ", value=" + value + "]";
	}

	public int getCapacity() {
		return capacity;
	}

	public int getValue() {
		return value;
	}
	
}
