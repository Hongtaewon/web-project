package web.project.backend.orm;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;

@Getter
@Entity(name="post_comment")
public class Post_comment extends BaseEntity {
	
	@Column
	private Long post_id; //포스트 아이디
	@Column
	private Long user_id; //코멘트를 단 유저 아이디
	@Column
	private int enabled; //숨김 기능
	@Column
	private String comments; //코멘트 내용
	@Column
	private int likes; //좋아요. comment_like를 cnt해서 저장함.
	

}