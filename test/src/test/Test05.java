package test;

public class Test05 {
	public static void main(String[] args) {
		// 조합
		
		String[] name = {"aaa","bbb","ccc","ddd","eee"};
		int[] kuk = {98,70,45,65,83};
		int[] eng = {55,61,54,76,71};
		int[] mat = {78,93,72,49,92};
		int[] sum = {0,0,0,0,0};
		int[] rank = new int[5];
		double[] avg = {0,0,0,0,0};
		double temp=0;
		for(int i=0;i<sum.length; i++) {
			sum[i]=kuk[i]+eng[i]+mat[i];
			avg[i] = (double)sum[i]/3;
			temp = (int)(avg[i]*10);
			avg[i]= (double)temp/10;
			rank[i]=1;
			for(int j=0;j<sum.length;j++) {
				if(sum[i]<sum[j]) {
					rank[i]+=1;
				}
			}
		}
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		for(int i=0;i<rank.length; i++) {
			System.out.println(i+1 +".\t"+name[i]+"\t"+ kuk[i]+"점\t"+ eng[i]+"점\t"+ mat[i]+"점\t"+sum[i]+"점\t"+avg[i]+"점\t"+rank[i]+"등");
		}
		
	}
}
