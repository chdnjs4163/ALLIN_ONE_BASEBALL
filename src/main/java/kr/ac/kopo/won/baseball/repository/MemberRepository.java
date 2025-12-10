package kr.ac.kopo.won.baseball.repository;

import kr.ac.kopo.won.baseball.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // 아이디로 회원 정보 찾기 (로그인할 때 사용)
    Optional<Member> findByLoginId(String loginId);
}