package com.smhrd.board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //db 테이블 처럼 쓰겠다
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
	
	//필드들은 --> DB의 컬럼이 될 예정
	// ★★★필수 조건!!★★ 반드시 pk가 존재해야 한다!
	// --> 숫자(long)으로 지정

	@Id //pk
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increase
	private Long id;
	
	// 컬럼 설정 하는 법 -- unique, not null, length
	//@Column	
	@Column(unique = true, nullable = false) //unique 설정 + not null 설정
	private String userId;
	
	//길이 조정
	@Column(length = 100)
	private String pw;
	
	private String name;
	private int age;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
