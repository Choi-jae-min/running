package step2;

public class Main {

    public static void main(String[] args) {
        Barista bariKim = new Barista();
        Customer sonny = new Customer();

        // 1. 정상적인(?) 손놈의 강탈 과정
        sonny.order("아이스 아메리카노", bariKim);
        sonny.order("카페라뗴", bariKim);
        sonny.order("카페라뗴", bariKim);
        sonny.order("마끼아또", bariKim);
        sonny.order("뜨아", bariKim);
        sonny.order("두쫀쿠", bariKim);

    }
}
