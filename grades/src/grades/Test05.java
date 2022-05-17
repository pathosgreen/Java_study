package grades;

public class Test05 {
	public static void main(String[] args) {

		// 변수 선언
		String[] name = {"말자","영자","순자","공자","맹자"};
		int[] guk = {89,74,90,60,83};
		int[] eng = {35,72,95,65,82};
		int[] mat = {50,70,92,62,81};
		int[] sum = new int[5];
		int[] rank = new int[5];
		double[] avg = new double[5];
		String[] hak = {"N","N","N","N","N"};
		
		// 계산
		for(int i=0;i<name.length; i++) {
			sum[i]=guk[i]+eng[i]+mat[i];
			avg[i] = (double)sum[i]/3;
			rank[i]=1;
				switch((int)avg[i]/10) {
				case 10:
				case 9: hak[i]="A"; break;
				case 8: hak[i]="B"; break;
				case 7: hak[i]="C"; break;
				case 6: hak[i]="D"; break;
				default: hak[i]="F";
				}
			for(int j=0;j<name.length;j++) {
				sum[j]=guk[j]+eng[j]+mat[j];
				if(sum[i]<sum[j]) {
					rank[i]+=1;
				}
			}
		}
		
		// 결과 출력
		System.out.println("                              성 적 표");
		System.out.println("===================================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t등수");
		System.out.println("-------------------------------------------------------------------");
		for(int i=0;i<rank.length; i++) {
			System.out.print(i+1 +".\t"+name[i]+"\t"+guk[i]+"점\t"+eng[i]+"점\t"+mat[i]+"점\t"+sum[i]+"점\t");
			System.out.printf("%.1f",avg[i]);
			System.out.println("점\t"+hak[i]+"급\t"+rank[i]+"등");
		}
		System.out.println("");
	}
}
