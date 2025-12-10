package kr.ac.kopo.won.baseball.repository;

import kr.ac.kopo.won.baseball.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    // 등수 오름차순(1등 -> 10등)으로 가져오기
    List<Team> findAllByOrderByRankingAsc();
}