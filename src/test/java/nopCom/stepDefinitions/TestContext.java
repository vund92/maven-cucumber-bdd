package nopCom.stepDefinitions;

public class TestContext {
	
	// class TestContext: giữ cho DataContext luôn là 1 đối tượng duy nhất
	// nếu mà những class khác mà muốn tạo instance từ DataContext rồi cứ gọi trực tiếp tới nó thì dữ liệu sẽ ko tồn tại xuyên suốt được
	// từ đó mà data có thể bị truyền sai
	public DataContext dataContext;

	public TestContext() {
		dataContext = new DataContext();
	}

	public DataContext getDataContext() {
		return dataContext;
	}

}
