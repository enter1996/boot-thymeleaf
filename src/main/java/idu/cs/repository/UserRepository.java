package idu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idu.cs.entity.UserEntity;

@Repository
public interface UserRepository 
	extends JpaRepository<UserEntity, Long> {
	// findById, save. delete 안만들어도 됨 스프링이 같이 만드는 순간 알아서 만들어줌
	// 선언 없이도 구현 가능
	
	// 아래 메소드들은 선언해야 JPA 규칙에 의해 구현됨
	// find - select문, by - where, orderby, Asc와 Desc를 함께 사용
	//List<UserEntity> findByNameOrderByIdDESC(String name);
	//id 내림차순으로 정렬
	List<UserEntity> findByName(String name);
	List<UserEntity> findByCompany(String company);
	
	UserEntity findByUserId(String userId);
	

}
