
public class Test {
	public static void main(String[]args){
		TestUserDA0 dao =new TestUserDA0();
		dao.select("taro","123");
		dao.selectAll();
		dao.selectByName("taro");
		dao.selectByPassword("123");
		dao.updateUserNameByUserName("taro", "saburo");
		dao.insert(4, "shiro", "012");
		dao.delete("jiro");
	}
}
