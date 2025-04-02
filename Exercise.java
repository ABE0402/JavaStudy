class MyTv2{
    int channel;
	int prevChannel;	
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int i) {
		prevChannel = this.channel;
		this.channel = i;
	}
	
	public void gotoPrevChannel() {
		int temp = channel; 
		channel =prevChannel;
		prevChannel = temp;
	}
	
}


public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" +t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" +t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" +t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" +t.getChannel());

	}

}
