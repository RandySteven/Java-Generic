package generic.application;

public class ConstraintApp {

	public static void main(String[] args) {
		NumberData<Integer> integerNumberData = new NumberData<Integer>(1);
		NumberData<Long> longNumberData = new NumberData<Long>(1L);
//		NumberData<String> stringNumberData = new NumberData<String>("Randy"); //ERR0R
	}

	public static class NumberData<T extends Number>{
		private T data;

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public NumberData(T data) {
			this.data = data;
			
		}
		
		
	}
}
