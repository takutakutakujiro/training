import java.util.ArrayList;

public class Test{
	public static void main(String args[]){
		String[] array = new String[1];
		array[0] = "田中";
		String name = array[0];
		System.out.println(name + ":" + array.length);

		ArrayList<String> list = new ArrayList<>(3);
		list.add("田中");
		String name2 = list.get(0);
		System.out.println(name + ":" + list.size());		


	}
}