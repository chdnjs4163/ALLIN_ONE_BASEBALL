package kr.ac.kopo.won.baseball;

import jakarta.annotation.PostConstruct;
import kr.ac.kopo.won.baseball.domain.Player;
import kr.ac.kopo.won.baseball.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInit {

    private final PlayerService playerService;

    @PostConstruct
    public void init() {
        // 이미 데이터가 있으면 실행 안 함 (중복 방지)
        if (!playerService.findAllPlayers().isEmpty()) {
            return;
        }

        // 테스트용 데이터 5명 자동 추가
        createPlayer("김도영", "KIA", "내야수", 0.330, "호타준족의 상징");
        createPlayer("구자욱", "SAMSUNG", "외야수", 0.343, "삼성의 캡틴");
        createPlayer("홍창기", "LG", "외야수", 0.320, "출루 기계");
        createPlayer("류현진", "HANWHA", "투수", 3.50, "돌아온 몬스터");
        createPlayer("양의지", "DOOSAN", "포수", 0.310, "안방 마님");
    }

    private void createPlayer(String name, String team, String position, Double avg, String desc) {
        Player p = new Player();
        p.setName(name);
        p.setTeam(team);
        p.setPosition(position);
        p.setAvg(avg);
        p.setDescription(desc);
        playerService.savePlayer(p);
    }
}