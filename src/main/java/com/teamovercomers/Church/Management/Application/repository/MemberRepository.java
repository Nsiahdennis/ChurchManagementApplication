package com.teamovercomers.Church.Management.Application.repository;




import com.teamovercomers.Church.Management.Application.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
