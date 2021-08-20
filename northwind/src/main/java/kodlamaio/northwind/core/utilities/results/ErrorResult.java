package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result {
	//işlem sonucu başarılı olanlar için
		public ErrorResult() {
			super(false);
		}
		public ErrorResult (String message) {
			super(false,message);
		}

	}