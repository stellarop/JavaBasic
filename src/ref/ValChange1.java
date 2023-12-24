package ref;

public class ValChange1 {
    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        // dataA의 참조값을 복사
        Data dataB = dataA;
        System.out.println("dataA의 참초값 : " + dataA);
        System.out.println("dataB의 참초값 : " + dataB);

        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataB.value : " + dataB.value);
        System.out.println("dataB.value : " + dataB.value);

        // dataA dataB 참조값이 같다 따라서 둘 다 같은 인스턴스 객체를 가리킨다.
    }
}
