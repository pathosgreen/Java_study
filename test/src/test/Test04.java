package test;

public class Test04 {
	public static void main(String[] args) {
		// 등수 구하기
		
		int[] point = {98,70,45,60,83};
		int[] rank = new int[5];
		
		for(int i=0;i<point.length; i++) {
			rank[i]=1;
			for(int j=0;j<point.length;j++) {
				if(point[i]<point[j]) {
					rank[i]+=1;
				}
			}
		}
		
		// 출력
		for(int i=0;i<rank.length; i++) {
			System.out.println(i+1 +".\t"+ point[i]+"점\t"+rank[i]+"등");
		}
	}
}
