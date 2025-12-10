package kr.ac.kopo.won.baseball.repository;

import kr.ac.kopo.won.baseball.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    // 이름으로 검색 (포함 검색: "김"만 쳐도 "김도영" 나옴)
    List<Player> findByNameContaining(String keyword);
}