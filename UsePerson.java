class Person {
	String name;
	int age;
	String address;
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public int getAge(){
		return this.age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
}
public class UsePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person []pArr = new Person[3];
		for(int i=0; i<pArr.length; i++) {
			pArr[i]= new Person();
		}
		pArr[0].setName("홍길동1");
		pArr[1].setAge(21);
		pArr[2].setAddress("서울시 구로구 구로동 212번지");
		
		pArr[0].setName("홍길동2");
		pArr[1].setAge(22);
		pArr[2].setAddress("서울시 구로구 구로동 213번지");
		
		pArr[0].setName("홍길동3");
		pArr[1].setAge(23);
		pArr[2].setAddress("서울시 구로구 구로동 214번지");
		
	

		
	}

}
