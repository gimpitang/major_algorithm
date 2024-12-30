import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class LunchPick {
    public static void main(String[] args) {
        // 데이터 리스트 생성
        List<String> names = List.of( "베고파", "배고파", "최영재","최영일" );

        // ThreadLocalRandom 객체를 사용하여 랜덤 인덱스 선택
        int randomIndex = ThreadLocalRandom.current().nextInt(names.size());

        // 선택된 이름 출력
        String pickedName = names.get(randomIndex);
        System.out.println("선택된 사람: " + pickedName);
    }
}
