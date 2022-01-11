
public class MultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int months[][]= {{1,2},{3,4},{5,6}};
		//System.out.println(months[1][0]);
		for(int i=0;i<months.length;i++) {
			int month1[]=months[i];
			for(int j=0;j<month1.length;j++) {
				System.out.println(month1[j]);
			}
		}

	}
}
	