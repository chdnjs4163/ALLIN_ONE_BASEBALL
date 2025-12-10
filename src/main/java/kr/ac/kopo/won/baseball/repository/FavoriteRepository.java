package kr.ac.kopo.won.baseball.repository;

import kr.ac.kopo.won.baseball.domain.Favorite;
import kr.ac.kopo.won.baseball.domain.Member;
import kr.ac.kopo.won.baseball.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    // 특정 회원의 즐겨찾기 목록 조회
    List<Favorite> findByMember(Member member);

    // 중복 찜 방지용 (이미 찜했는지 확인)
    boolean existsByMemberAndPlayer(Member member, Player player);
}