package kodlamaio.northwind.core.utilities.results;

public class SuccessResult extends Result{
	//işlem sonucu başarılı olanlar için
	public SuccessResult() {
		super(true);
	}
	public SuccessResult (String message) {
		super(true,message);
	}

}
