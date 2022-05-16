package test;

public class Test01 {
	public static void main(String[] args) {
		// 변수 생성
		int[] point = {98,70,45,60,83};
		int sum=0;
		int pomax=0;
		int pomin=1000;
		double avg=0;
		// 계산
		for(int i=0;i<point.length;i++) {
			sum+=point[i];
			if(pomax<point[i]) {pomax=point[i];}
			if(pomin>point[i]) {pomin=point[i];}
		}
		avg=(double)sum/point.length;
		// 결과 출력
		System.out.println("총점 = "+sum);
		System.out.println("평균 = "+avg);
		System.out.println("최고점수 = "+ pomax);
		System.out.println("최저점수 = "+ pomin);
	}
}
