package com.example.springwebservice.domain.member;


import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository  extends JpaRepository<Item, Long> {
}
